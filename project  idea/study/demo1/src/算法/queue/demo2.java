package 算法.queue;

import java.util.Scanner;

//用数组模拟队列
public class demo2 {
    public static void main(String[] args) {
       ArrayQueue queue = new ArrayQueue(3);
       char key = ' ';
       Scanner scanner = new Scanner(System.in);
       boolean loop = true;
       while (loop){
           System.out.println("s(show):显示队列");
           System.out.println("e(exit):退出程序");
           System.out.println("a(add):添加到队列");
           System.out.println("g(get):取出队列");
           System.out.println("h(head):查看队列头的数据");
           key = scanner.next().charAt(0);
           switch (key){
               case 's':
                   queue.showQueue();
                   break;
               case 'a':
                   System.out.println("输入一个数");
                   int value = scanner.nextInt();
                   queue.addQueue(value);
                   break;
               case 'g':
                   try {
                       int res = queue.getQueue();
                       System.out.printf("取出的数据是%d\n",res);
                   }catch (Exception e){
                       System.out.println(e.getMessage());
                   }
                   break;
               case 'h':
                   try {
                       int res = queue.headQueue();
                       System.out.printf("取出的头数据是%d\n",res);
                   }catch (Exception e){
                       System.out.println(e.getMessage());
                   }
                   break;
               case 'e':
                   scanner.close();
                   break;
               default:
                   break;
           }
       }
        System.out.println("程序退出");

    }
}

class ArrayQueue{
    private int maxSize; //表示数组的最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int[] arr;//存储数据，模拟队列

    //创建队列的构造器
    public ArrayQueue(int arrmaxSize){
        maxSize = arrmaxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    //判断队列是否满
    public boolean isFull(){
        return rear == maxSize-1;
    }

    public boolean isEmpty(){
        return rear == front;
    }

    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列满~~~");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    //出队列
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列为空···");
        }
        front++;
        return arr[front];
    }

    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }

    //显示头部数据
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("没有数据");
        }
        return arr[front+1];
    }
}
