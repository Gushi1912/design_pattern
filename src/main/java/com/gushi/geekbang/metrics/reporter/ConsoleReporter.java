package com.gushi.geekbang.metrics.reporter;

import com.google.gson.Gson;
import com.gushi.geekbang.metrics.Aggregator;
import com.gushi.geekbang.metrics.domain.RequestInfo;
import com.gushi.geekbang.metrics.domain.RequestStat;
import com.gushi.geekbang.metrics.storage.IMetricsStorage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/10 15:03
 */
public class ConsoleReporter {

    private IMetricsStorage metricsStorage;
    private ScheduledExecutorService executorService;

    public ConsoleReporter(IMetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
        this.executorService = Executors.newSingleThreadScheduledExecutor();
    }

    //定时执行
    public void startRepeatedReport(long periodInSeconds, long durationInSeconds) {
        executorService.scheduleAtFixedRate(() -> {
            //给定指定时间区间，从数据库中拉取数据
            long durationInMillis = durationInSeconds * 1000;
            long endTimeInMillis = System.currentTimeMillis();
            long startTimeInMillis = endTimeInMillis -durationInMillis;
            Map<String, List<RequestInfo>> requestInfos = metricsStorage.getRequestInfos(startTimeInMillis, endTimeInMillis);
            Map<String, RequestStat> stats = new HashMap<>();
            for (Map.Entry<String, List<RequestInfo>> entry : requestInfos.entrySet()) {
                String apiName = entry.getKey();
                List<RequestInfo> requestInfosPerApi = entry.getValue();
                //根据原始数据，计算得到统计数据
                RequestStat requestStat = Aggregator.aggregate(requestInfosPerApi, durationInMillis);
                stats.put(apiName, requestStat);
            }
            //将统计数据显示到终端
            System.out.println("Time Span: [" + startTimeInMillis + ","  + endTimeInMillis + "]");
            Gson gson = new Gson();
            System.out.println(gson.toJson(stats));
        }, 0, periodInSeconds, TimeUnit.SECONDS);
    }
}
