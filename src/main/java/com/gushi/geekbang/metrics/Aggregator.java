package com.gushi.geekbang.metrics;

import com.gushi.geekbang.metrics.domain.RequestInfo;
import com.gushi.geekbang.metrics.domain.RequestStat;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/10 10:33
 * @desc 负责聚合统计
 */
public class Aggregator {

    public static RequestStat aggregate(List<RequestInfo> requestInfos, long durationMillis) {
        double maxRespTime = Double.MIN_VALUE;
        double minRespTime = Double.MAX_VALUE;
        double avgRespTime = -1;
        double p999RespTime = -1;
        double p99RespTime = -1;
        double sumRespTime = 0;
        long count = 0;

        for(RequestInfo requestInfo : requestInfos) {
            ++count;
            double respTime = requestInfo.getResponseTime();
            if (respTime > maxRespTime) {
                maxRespTime = respTime;
            }
            if (respTime < minRespTime) {
                minRespTime = respTime;
            }
            sumRespTime += respTime;
        }
        if (count != 0) {
            avgRespTime = sumRespTime / count;
        }
        long tps = (long)(count / durationMillis * 1000);
        Collections.sort(requestInfos, (o1, o2) -> {
            double diff = o1.getResponseTime() - o2.getResponseTime();
            if (diff < 0.0) {
                return -1;
            } else if (diff > 0.0) {
                return 1;
            } else return 0;
        });
        int idx999 = (int)(count * 0.999);
        int idx99 = (int)(count * 0.99);
        if (count != 0) {
            p999RespTime = requestInfos.get(idx999).getResponseTime();
            p99RespTime = requestInfos.get(idx99).getResponseTime();
        }
        RequestStat requestStat = new RequestStat();
        requestStat.setMaxResponseTime(maxRespTime);
        requestStat.setMinResponseTime(minRespTime);
        requestStat.setAvgResponseTime(avgRespTime);
        requestStat.setP999ResponseTime(p999RespTime);
        requestStat.setP99ResponseTime(p99RespTime);
        requestStat.setCount(count);
        requestStat.setTps(tps);
        return requestStat;
    }


}
