package 算法.stack;

import java.util.LinkedList;
import java.util.Queue;

public class Queue2Stack {
    public static void main(String[] args) {
        MyStack queue2Stack = new MyStack();
        queue2Stack.push("a");
        queue2Stack.push("c");
        queue2Stack.pop();
        queue2Stack.push("d");
        queue2Stack.push("e");
        queue2Stack.push("f");
        queue2Stack.push("g");
        queue2Stack.push("h");

        while(queue2Stack.length()>0) {
            System.out.println(queue2Stack.pop());
        }
    }

    static class MyStack {

        private Queue queue1;//输入队列
        private Queue queue2;//输出队列

        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }


        public void push(Object o) {
            queue1.add(o);
        }

        public Object pop() {
            Object o = null;
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            if (queue1.size() == 1) {
                o = queue1.poll();
                while (queue2.size() > 0) {
                    queue1.add(queue2.poll());
                }
            }
            return o;
        }

        public int length() {
            return queue1.size();
        }
    }
}
