import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;

public class TestSynchronized {
    public static void main(String[] args) throws InterruptedException {



        //获取开始时间
        long start = System.currentTimeMillis();

        Account acc = new Account("1001","123456",20000);

        Husband h = new Husband(acc);
        Wife w  = new Wife(acc);

      /*  h.acc.withdrawal("1001","123456",12000);
        w.acc.withdrawal("1001","123456",12000);*/
      Thread t1 = new Thread(h);
      Thread t2 = new Thread(w);

      t1.start();
      t2.start();

      t1.join();
      t2.join();

      //结束时间
        long  end = System.currentTimeMillis();

        System.out.println( end - start );

    }
}

class Husband implements Runnable{
    public Account acc;

    public Husband(Account acc){
        this.acc  =acc;
    }

    @Override
    public void run() {
     //   synchronized (acc){
         //   this.acc.withdrawal("1001","123456",12000);
           this.acc.selectedBalance("1001","123456");
      //  }

    }
}

class Wife implements Runnable{
    public Account acc;

    public Wife(Account acc){
        this.acc  =acc;
    }
    @Override
    public void run() {
    //    synchronized (acc){//给acc加锁    //阻塞：拿不到锁的时候
     //       this.acc.withdrawal("1001","123456",12000);
    //    }
        this.acc.selectedBalance("1001","123456");
    }

}


class Account{
    String cardNo;
    String password;
    double balance;

    public Account(String cardNo,String password,double balance) {
        super();
        this.cardNo = cardNo;
        this.password = password;
        this.balance = balance;
    }

    public void withdrawal(String no,String pwd,double money){
        synchronized (this){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("请稍后。。。。。。");
            if (this.cardNo.equals(no) && this.password.equals(pwd)){
                System.out.println("验证成功，请稍后...");
                if (money < balance){
                    balance -=money;
                    System.out.println("取款成功，当前余额为："+balance);
                }else{
                    System.out.println("余额不足.....");
                }
            }else {
                System.out.println("请重新输入用户信息...");
            }
        }
    }

    public void selectedBalance(String no,String pwd) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this.balance);
    }
}


