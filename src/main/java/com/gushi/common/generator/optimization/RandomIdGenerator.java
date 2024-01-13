package com.gushi.common.generator.optimization;

import com.google.common.annotations.VisibleForTesting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/13 16:22
 */
public class RandomIdGenerator implements  LogTraceIdGenerator{

    private static final Logger logger = LoggerFactory.getLogger(RandomIdGenerator.class);

    /**
     *
     * @return
     */
    @Override
    public String generate() {
        String lastFiledOfHostName = getLastFiledOfHostName();
        long timestamp = System.currentTimeMillis();
        String ran = generateRandomAlphameric(8);
        return String.format("%s-%s-%s", lastFiledOfHostName, timestamp, ran);
    }


    /**
     *
     * @return
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
     *
     * @param hostname
     * @return
     */
    @VisibleForTesting
    protected String getLastSubStrSplittedByDot(String hostname) {
        String[] tokens = hostname.split("\\.");
        String substrOfHostName = tokens[tokens.length - 1];
        return substrOfHostName;
    }

    /**
     *
     * @param length
     * @return
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
