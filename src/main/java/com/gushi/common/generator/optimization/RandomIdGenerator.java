package com.gushi.common.generator.optimization;

import com.google.common.annotations.VisibleForTesting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * 一个用来生成随机ID的生成器
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/13 16:22
 */
public class RandomIdGenerator implements  LogTraceIdGenerator{

    private static final Logger logger = LoggerFactory.getLogger(RandomIdGenerator.class);

    /**
     * 生成一段随机字符串，字符串是由主机名的最后一个字段，当前时间戳以及一个随机字符串组合成的，
     * 只有在及其特殊的情况下不唯一，比如机器时钟回拨且生成同样一段随机字符串且主机名相同的情况下
     * @return 一个随机ID
     */
    @Override
    public String generate() {
        String lastFiledOfHostName = getLastFiledOfHostName();
        long timestamp = System.currentTimeMillis();
        String ran = generateRandomAlphameric(8);
        return String.format("%s-%s-%s", lastFiledOfHostName, timestamp, ran);
    }


    /**
     * 获取当前主机名的最后一个字段的名称
     * @return 主机名的最后一个字段名
     */
    private String getLastFiledOfHostName() {
        String subStrOfHostName = null;
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            subStrOfHostName = getLastSubStrSplittedByDot(hostName);
        } catch (UnknownHostException e) {
            logger.warn("Failed to get hostname", e);
            throw new RuntimeException(e);
        }
        return  subStrOfHostName;
    }

    /**
     *  根据.分割主机名，并获取最后一个字段名称
     * @param hostname 当前机器的主机名
     * @return 主机名的最后一个字段
     */
    @VisibleForTesting
    protected String getLastSubStrSplittedByDot(String hostname) {
        String[] tokens = hostname.split("\\.");
        String substrOfHostName = tokens[tokens.length - 1];
        return substrOfHostName;
    }

    /**
     * 生成一段{@length}长度的随机字符串，这个随机字符串由小写字母，大写字母以及数字组成
     * @param length 字符串长度，不能小于0
     * @return 长度为{@Length}的随机字符串
     */
    @VisibleForTesting
    protected  String generateRandomAlphameric(int length) {
        char[] randomChars = new char[length];
        int count = 0;
        Random random = new Random();
        while (count < length) {
            int maxAscii = 'z';
            int randomAscii = random.nextInt(maxAscii);
            boolean isDigit= randomAscii >= '0' && randomAscii <= '9';
            boolean isUppercase= randomAscii >= 'A' && randomAscii <= 'Z';
            boolean isLowercase= randomAscii >= 'a' && randomAscii <= 'z';
            if (isDigit|| isUppercase || isLowercase) {
                randomChars[count] = (char) (randomAscii); ++count;
            }
        }
        return new String(randomChars);
    }
}
