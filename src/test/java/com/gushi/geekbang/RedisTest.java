package com.gushi.geekbang;

import com.gushi.common.RedisUtil;
import org.junit.Test;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2024/1/10 11:21
 */
public class RedisTest {

    @Test
    public void redisConfig() {
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.set("123","456");
    }

}
