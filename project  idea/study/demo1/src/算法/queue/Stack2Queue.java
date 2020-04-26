package 算法.queue;

import java.util.Stack;
//用两个栈实现队列
public class Stack2Queue {

    public static void main(String[] args) {
        Stack2Queue stack2Queue = new Stack2Queue();
        stack2Queue.add("a");
        stack2Queue.add("b");
        stack2Queue.add("c");
        stack2Queue.add("d");
        stack2Queue.add("e");
        while(!stack2Queue.empty()) {
            System.out.println(stack2Queue.poll());
        }
    }
    /*
    用栈的入栈和出栈  来实现队列的入队和出队
      stack1是入栈的，stack2是出栈的。
        入队列：直接压入stack1即可
        出队列：如果stack2不为空，把stack2中的栈顶元素直接弹出；
            否则，把stack1的所有元素全部弹出压入stack2中，再弹出stack2的栈顶元素

    * */

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();
    public void add(Object o){
        stack1.add(o);
    }

    public Object poll(){
        Object o = null;

        if (stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
            o = stack2.pop();
        }else{
            o = stack2.pop();
        }
        return o;
    }

    boolean empty(){
        return stack1.empty()&&stack2.empty();
    }
}
