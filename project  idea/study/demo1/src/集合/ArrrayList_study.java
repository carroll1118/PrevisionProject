package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrrayList_study {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("abc");
        list.add("edf");
        list.add("ghi");
        System.out.println(list);
        list.add(1,"ggq");
        System.out.println(list);
        /*list.clear();
        System.out.println(list);*/
        /*boolean contains = list.contains("ggq");
        System.out.println(contains);*/
        System.out.println(list.get(2));
        System.out.println(list.lastIndexOf("ggq"));
        System.out.println(list.remove(1));
        System.out.println(list);
        list.set(1,"ggq");
        System.out.println(list.toArray());




        /*Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }*/
    }
}
