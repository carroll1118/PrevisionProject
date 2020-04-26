package ����;

import java.util.ArrayList;
import java.util.Collection;


class Dog{
	private String name;

	public String getName() {
		return name;
	}

	Dog(String name){
		this.name = name;
	}
	
	
	
	
}

public class CollectionDemo2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		System.out.println(c);
		
		Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		Collection c2 = new ArrayList();
		c2.add(new Dog("wc"));
		c2.add(new Dog("wc2"));
		
		Object[] arr2 = c2.toArray();  //toArray �Զ������鵱�е�����Ԫ������ת��
		for (int i = 0; i < arr2.length; i++) {
			Dog dog = (Dog)arr2[i];  //����ת��
			System.out.println(dog.getName());
		}
		
	}

}
