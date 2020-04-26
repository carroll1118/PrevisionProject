package 集合;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_study {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("abc");
        list.add("edf");
        list.add("ghi");
        System.out.println(list);




        /*Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }*/
    }
}
