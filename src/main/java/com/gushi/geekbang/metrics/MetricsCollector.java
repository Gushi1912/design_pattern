package com.gushi.geekbang.metrics;

import com.gushi.geekbang.metrics.domain.RequestInfo;
import com.gushi.geekbang.metrics.storage.IMetricsStorage;
import com.mysql.cj.util.StringUtils;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/9 15:46
 * @Desc 负责提供 API，来采集接口请求的原始数据
 */
public class MetricsCollector {

    private IMetricsStorage metricsStorage;    //基于接口而非实现编程

    //依赖注入
    public MetricsCollector(IMetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    public void recordRequest(RequestInfo requestInfo) {
        if(requestInfo == null || StringUtils.isNullOrEmpty(requestInfo.getApiName())) {
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }
}
