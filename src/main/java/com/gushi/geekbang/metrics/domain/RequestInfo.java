package com.gushi.geekbang.metrics.domain;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/9 15:50
 */
public class RequestInfo {

    private String apiName;

    private double responseTime;

    private long timestamp;

    public RequestInfo() {
    }

    public RequestInfo(String apiName, double responseTime, long timestamp) {
        this.apiName = apiName;
        this.responseTime = responseTime;
        this.timestamp = timestamp;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public double getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(double responseTime) {
        this.responseTime = responseTime;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
