package com.nov.redis.javaUtils.base;

import redis.clients.jedis.Jedis;

/**
 * 测试账号密码
 * @author november
 */
public class TestPassword {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.auth("a2288311");

        //验证密码，如果没有设置密码这段代码省略
//        jedis.auth("password");

        jedis.connect(); //连接
        jedis.disconnect(); //断开连接

        jedis.flushAll(); //清空所有的key
    }
}
