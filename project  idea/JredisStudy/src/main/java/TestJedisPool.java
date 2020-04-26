import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Protocol;

public class TestJedisPool {
    public static void main(String[] args) {
        JedisPool pool = new JedisPool(new JedisPoolConfig(), "192.168.25.129", 6379, Protocol.DEFAULT_TIMEOUT);

        pool.destroy();
    }
}
