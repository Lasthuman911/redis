package demo1;

import redis.clients.jedis.Jedis;

/**
 * Name: admin
 * Date: 2017/5/18
 * Time: 17:09
 */
public class RedisStringJava {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println(jedis.ping());

        jedis.set("name","wzm1");
        System.out.println(jedis.get("name"));
    }
}
