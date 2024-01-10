package com.gushi.geekbang.metrics.domain;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/10 10:45
 */
public class RequestStat {
    private double maxResponseTime;

    private double minResponseTime;

    private double avgResponseTime;

    /**
     * 分位数
     * 将数据按照规则从小到大排序，p99=总记录数*0.99，意思是99%的请求的某个数据不超过某某值
     */
    private double p999ResponseTime;

    private double p99ResponseTime;

    private long count;

    private long tps;

    public double getMaxResponseTime() {
        return maxResponseTime;
    }

    public void setMaxResponseTime(double maxResponseTime) {
        this.maxResponseTime = maxResponseTime;
    }

    public double getMinResponseTime() {
        return minResponseTime;
    }

    public void setMinResponseTime(double minResponseTime) {
        this.minResponseTime = minResponseTime;
    }

    public double getAvgResponseTime() {
        return avgResponseTime;
    }

    public void setAvgResponseTime(double avgResponseTime) {
        this.avgResponseTime = avgResponseTime;
    }

    public double getP999ResponseTime() {
        return p999ResponseTime;
    }

    public void setP999ResponseTime(double p999ResponseTime) {
        this.p999ResponseTime = p999ResponseTime;
    }

    public double getP99ResponseTime() {
        return p99ResponseTime;
    }

    public void setP99ResponseTime(double p99ResponseTime) {
        this.p99ResponseTime = p99ResponseTime;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public long getTps() {
        return tps;
    }

    public void setTps(long tps) {
        this.tps = tps;
    }
}
