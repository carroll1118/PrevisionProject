import redis.clients.jedis.Jedis;

public class TestJredis {
        public static void main(String[] args) {
            //连接 Redis 服务
            Jedis jedis = new Jedis("192.168.25.129",6379);
            System.out.println("连接成功");
            //查看服务是否运行
            System.out.println("服务正在运行: "+jedis.ping());
        }
}
