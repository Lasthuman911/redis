package demo1;

import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Name: admin
 * Date: 2017/5/18
 * Time: 17:12
 */
public class RedisListJava {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println(jedis.ping());

        jedis.lpush("firstList","疯狂java");
        jedis.lpush("firstList","疯狂java1");
        jedis.lpush("firstList","疯狂java2");
        jedis.lpush("firstList","疯狂java3");

        List<String> firstList = jedis.lrange("firstList",0,3);
        for (String element : firstList){
            System.out.println(element);
        }
System.out.println("=============================");
        for (int i = 0;i<firstList.size();i++){
            System.out.println(firstList.get(i));
        }
    }
}
