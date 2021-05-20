package com.nov.redis.javaUtils.ping;

import redis.clients.jedis.Jedis;

/**
 * Created by IntelliJ IDEA.
 *
 * @Description: redis连接类
 * @Author: november
 * @CreateTime: 2021/4/20 1:53 下午
 * @UpdateTIme:
 */
public class TestPing {
    public static void main(String[] args) {
        //创建redis连接
        try (Jedis jedis = new Jedis("127.0.0.1", 6379)) {
            // jedis 里有 redis 的所有命令
            jedis.auth("a2288311");
            System.out.println(jedis.ping());
        }
    }
}
