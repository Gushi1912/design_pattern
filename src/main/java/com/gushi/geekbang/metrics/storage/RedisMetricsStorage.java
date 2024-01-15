package com.gushi.geekbang.metrics.storage;

import com.google.gson.Gson;
import com.gushi.common.util.RedisUtil;
import com.gushi.geekbang.metrics.domain.RequestInfo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/10 9:52
 */
public class RedisMetricsStorage implements IMetricsStorage{

    private RedisUtil redisUtil;

    private Gson gson = new Gson();

    public RedisMetricsStorage() {
        redisUtil = new RedisUtil();
    }

    public RedisMetricsStorage(RedisUtil redisUtil) {
        this.redisUtil = redisUtil;
    }

    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {
        String key = requestInfo.getApiName();
        redisUtil.set(key, gson.toJson(requestInfo));
    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimeMillis, long endTimeMillis) {
        List<String> list = redisUtil.lRangeAll(apiName);
        if (list.isEmpty()) return Collections.emptyList();
        List<RequestInfo> requestInfos = list.stream()
                .map(requestInfoStr -> gson.fromJson(requestInfoStr, RequestInfo.class))
                .collect(Collectors.toList());

        return requestInfos.stream()
                .filter(requestInfo -> (requestInfo.getTimestamp() > startTimeMillis) & (requestInfo.getTimestamp() <= endTimeMillis))
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeMillis, long engTimeMillis) {
        HashMap<String, List<RequestInfo>> result = new HashMap<>();
        Set<String> keys = redisUtil.keys();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            List<RequestInfo> requestInfos = getRequestInfos(key, startTimeMillis, engTimeMillis);
            if (!requestInfos.isEmpty()) {
                result.put(key, requestInfos);
            }
        }
        return result;
    }
}
