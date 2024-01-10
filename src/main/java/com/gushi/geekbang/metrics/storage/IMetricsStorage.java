package com.gushi.geekbang.metrics.storage;

import com.gushi.geekbang.metrics.domain.RequestInfo;

import java.util.List;
import java.util.Map;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/9 15:48
 * @Desc
 */
public interface IMetricsStorage {

    void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getRequestInfos(String apiName, long startTimeMillis, long endTimeMillis);

    Map<String, List<RequestInfo>> getRequestInfos(long startTimeMillis, long engTimeMillis);
}
