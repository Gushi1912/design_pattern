package com.gushi.common.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.io.*;
import java.util.*;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/10 9:31
 */
public class RedisUtil {

    private String host;

    private int port;
    private String username;
    private String password;
    private JedisPool jedisPool;

    public RedisUtil() {
        InputStream inputStream = readFromPath("redis.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            this.host = properties.getProperty("redis.host");
            this.port = Integer.parseInt(properties.getProperty("redis.port"));
            this.username = properties.getProperty("redis.username");
            this.password = properties.getProperty("redis.password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        ResourceBundle bundle = ResourceBundle.getBundle("redis");
//        String host = bundle.getString("redis.host");
//        String port = bundle.getString("redis.port");
//        String username = bundle.getString("redis.username");
//        String password = bundle.getString("redis.password");
//        this.host = host;
//        this.port = Integer.parseInt(port);
//        this.username = username;
//        this.password = password;
        this.jedisPool = new JedisPool(this.host, this.port, this.username, this.password);
    }

    private InputStream readFromPath(String path) {
        InputStream inputStream;
        //默认加载resources目录下的文件
        inputStream = RedisUtil.class.getClassLoader().getResourceAsStream(path);
        return inputStream;
    }



    public void set(String key, String value) {
        try (Jedis jedis = this.jedisPool.getResource()) {
            jedis.set(key, value);
        }
    }

    public String get(String key) {
        try(Jedis jedis = this.jedisPool.getResource()) {
            return jedis.get(key);
        }
    }

    public void lPush(String key, String value) {
        try (Jedis jedis = this.jedisPool.getResource()) {
            jedis.lpush(key, value);
        }
    }

    public List<String> lRange(String key, int i, int j) {
        List<String> res;
        try (Jedis jedis = this.jedisPool.getResource()) {
            res = jedis.lrange(key, i, j);
        }
        return res;
    }

    public List<String> lRangeAll(String key) {
        return lRange(key, 0 , -1);
    }

    public Set<String> keys() {
        Set<String> res;
        try (Jedis jedis = this.jedisPool.getResource()) {
            res = jedis.keys("*");
        }
        return res;
    }

}
