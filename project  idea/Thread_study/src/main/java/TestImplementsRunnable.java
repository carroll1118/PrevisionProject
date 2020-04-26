public class TestImplementsRunnable {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("程序开始");
        Thread.sleep(1000);

        MyRunnable  task = new MyRunnable();

        Thread t1 = new Thread(task);

        Thread t2 = new Thread(task);

        //t1.run();
        t1.start();

        t2.start();

        System.out.println("程序结束");

    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println( Thread.currentThread().getId() + "  = " + i);
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
