package com.itlike.jredis;

import java.util.Iterator;
import java.util.Set;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
            //连接Redis服务器
            Jedis jedis = new Jedis("192.168.25.129", 6379);
            //查看服务是否运行正常
            System.out.println("服务正在运行: " + jedis.ping());
            
            Set<String> set = jedis.keys("*");
            
            Iterator<String> iterable =  set.iterator();
            
            while ( iterable.hasNext()) {
				System.out.println(iterable.next());
				
			}
            
             Long str = jedis.ttl("sex");
            System.out.println("==================");
            System.out.println(str);
    }
}
