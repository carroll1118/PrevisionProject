package 集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_study {
    public static void main(String[] args) {
        //Set 集合存和取的顺序不一致。
        Set hs = new HashSet();
        hs.add("世界军事");
        hs.add("兵器知识");
        hs.add("舰船知识");
        hs.add("汉和防务");
        System.out.println(hs);

       /* hs.clear();
        System.out.println(hs);*/

        boolean b = hs.contains("世界军事");
        System.out.println(b);

        Object[] array = hs.toArray();


        System.out.println(array[2]);





        /*Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/
    }
}
