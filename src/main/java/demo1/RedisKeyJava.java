package demo1;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Set;

/**
 * Name: admin
 * Date: 2017/5/18
 * Time: 17:21
 */
public class RedisKeyJava {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println(jedis.ping());

       Set<String> keyList = jedis.keys("*");
        for (String element : keyList){
            System.out.println(element);
        }
    }
}
