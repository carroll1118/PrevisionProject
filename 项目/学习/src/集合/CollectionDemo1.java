package ����;

import java.util.ArrayList;
import java.util.Collection;

/*  ���ϣ�����������ݵ�����
 * ����:���ȹ̶������������Ԫ��
 * 
 * ����   �洢�������
 * 
 * Ԫ�ع̶�  �Ƽ�ʹ��  ����
 * Ԫ�ز��̶�   �Ƽ�ʹ��  ����


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
		//ArrayList �ڲ��Ѿ�������toString ���������Կ���ֱ�Ӵ�ӡ���
		//�����д洢�Ķ��Ƕ���
		//List��������ظ�Ԫ��  ���ؽ������true
		//set ��������ظ�Ԫ�أ������Ӿͷ��� false
		//��ӻ����������Ͷ�������Զ�װ��
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
		//�жϽ���Ƿ�Ϊ��
		System.out.println(c2.isEmpty());
		

	}

}
