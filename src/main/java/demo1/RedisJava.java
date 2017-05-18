package demo1;

import redis.clients.jedis.Jedis;

/**
 * Name: admin
 * Date: 2017/5/18
 * Time: 17:06
 */
public class RedisJava {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server successfully");
        //check whether server is running or not
        System.out.println("Server is running:"+jedis.ping());
    }
}
