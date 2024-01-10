package com.gushi.geekbang.metrics.storage;

import com.gushi.common.util.RedisUtil;
import com.gushi.geekbang.metrics.domain.RequestInfo;

import java.util.List;
import java.util.Map;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/10 9:52
 */
public class RedisMetricsStorage implements IMetricsStorage{

    private RedisUtil redisUtil;

    public RedisMetricsStorage() {
        redisUtil = new RedisUtil();
    }

    public RedisMetricsStorage(RedisUtil redisUtil) {
        this.redisUtil = redisUtil;
    }

    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {
        String key = requestInfo.getApiName();
        String s = redisUtil.get(key);
        if (s != null && s.length() > 0) {

        }

    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimeMillis, long endTimeMillis) {
        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimeMillis, long engTimeMillis) {
        return null;
    }
}
