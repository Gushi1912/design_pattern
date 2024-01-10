package com.gushi.geekbang.metrics;

import com.gushi.geekbang.metrics.domain.RequestInfo;
import com.gushi.geekbang.metrics.reporter.ConsoleReporter;
import com.gushi.geekbang.metrics.reporter.EmailReporter;
import com.gushi.geekbang.metrics.storage.IMetricsStorage;
import com.gushi.geekbang.metrics.storage.RedisMetricsStorage;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/10 15:49
 */
public class Demo {
    public static void main(String[] args) {
        IMetricsStorage storage = new RedisMetricsStorage();
        ConsoleReporter consoleReporter = new ConsoleReporter(storage);
        consoleReporter.startRepeatedReport(60, 60);
        EmailReporter emailReporter = new EmailReporter(storage);
        emailReporter.addToAddress("wangzheng@xzg.com");
        emailReporter.startDailyReport();
        MetricsCollector collector = new MetricsCollector(storage);
        collector.recordRequest(new RequestInfo("register", 123, 10234));
        collector.recordRequest(new RequestInfo("register", 223, 11234));
        collector.recordRequest(new RequestInfo("register", 323, 12334));
        collector.recordRequest(new RequestInfo("login", 23, 12434));
        collector.recordRequest(new RequestInfo("login", 1223, 14234));

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
