package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


class Cat{
	String name;
	Cat(String name){
		this.name = name;
	}	
	void show() {
		System.out.println(this.name);
	}
}


public class CollectionDemo3 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		System.out.println(c);
		
		Object[] arrs = c.toArray();
		
		//迭代器遍历
		Iterator it = c.iterator();
		
		/*Object obj = it.next();
		System.out.println(obj);
		
		Object obj2 = it.next();
		System.out.println(obj2);
		
		Object obj3 = it.next();
		System.out.println(obj3);*/
		
		boolean res = it.hasNext();
        System.out.println(res);
        
        while (it.hasNext()) {
			System.out.println(it.next());		
		}
        
        
        Collection c2 = new ArrayList();
        c2.add(new Cat("mimi"));
        c2.add(new Cat("mm"));
        
        Iterator it2 = c2.iterator();
        
        while (it2.hasNext()) {
			Cat cat = (Cat) it2.next();	
			cat.show();
		}
        
		
	}
	
}
