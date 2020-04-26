package 集合;

import java.util.ArrayList;
import java.util.Collection;

/*  集合：用来存放数据的容器
 * 数组:长度固定，不能再添加元素
 * 
 * 集合   存储任意对象
 * 
 * 元素固定  推荐使用  数组
 * 元素不固定   推荐使用  集合


*/

class Student{
	String name;
	String age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}


public class CollectionDemo1 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		int[] a = {10,20,4};
		a[1] = 50;
		//ArrayList 内部已经覆盖了toString 方法，所以可以直接打印结果
		//集合中存储的都是对象
		//List可以添加重复元素  返回结果都是true
		//set 不能添加重复元素，如果添加就返回 false
		//添加基本数据类型都会帮你自动装箱
		Collection c = new ArrayList<>();
		boolean b1 = c.add("abc");
		boolean b2 = c.add(10);
		boolean b3 = c.add(true);
		
		Student s = new Student();
		s.name = "MYXQ";
		s.age = "17";
		boolean b4 = c.add(s);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		System.out.println(c);
		
		System.out.println("--------------------");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		System.out.println(c2);
		
		c2.remove("a");
		System.out.println(c2);
		
		System.out.println(c2.size());
		
		c2.clear();
		System.out.println(c2);
		//判断结合是否为空
		System.out.println(c2.isEmpty());
		

	}

}
