import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class RedisTranacttionJava {
    public  boolean transMethod() throws InterruptedException {
        //连接 Redis 服务
        Jedis jedis = new Jedis("192.168.25.129", 6379);
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: " + jedis.ping());
        /*
        * Redis 设置两个值
        * set balance 100
        * set debt 100
        * */

        int balance; //可用余额
        int debt;
        int amtToSubtract = 10;

        jedis.watch("balance");
         //set balance 5
        //jedis.set("balance","5");
        Thread.sleep(7000);

        balance = Integer.parseInt(jedis.get("balance"));
        if (balance < amtToSubtract) {
            jedis.unwatch();
            System.out.println("余额不足，请重试！");
            return false;
        } else {
            System.out.println("-----------transaction");
            Transaction transaction = jedis.multi();
            transaction.decrBy("balance", amtToSubtract);
            transaction.incrBy("debt", amtToSubtract);
            transaction.exec();
            balance = Integer.parseInt(jedis.get("balance"));
            debt = Integer.parseInt(jedis.get("debt"));

            System.out.println("----------" + balance);
            System.out.println("----------" + debt);
            return true;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RedisTranacttionJava test = new RedisTranacttionJava();
        boolean retValue = test.transMethod();
        System.out.println("main retValue-------: " + retValue);

    }
}

