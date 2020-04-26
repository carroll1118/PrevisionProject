package 面试;

public class study5 {
    public static void main(String[] args) {
        //i++先引用后增加。++i 先增加后引用
        /*int i=1;
        int j=i++;
        System.out.println(j);
        if((j>++j)&&(i++==j)){j+=i;}
        System.out.println(j);*/

       // finally中的return 会覆盖 try 或者catch中的返回值。
       // finally 中语句不执行的唯一情况中执行了 System.exit(0)语句。
       /* study5 t=new study5();
        int b = t.get();
        System.out.println(b);*/

        String s = "dsfjsbgskg";
        System.out.println(reverse(s));



            outer: for (int i = 0; i < 3; i++)
            inner: for (int j = 0; j < 2; j++) {
                if (j == 1)
                    continue outer;
                System.out.println(j + " and " + i);
            }
    }
       //字符串反转输出
        public static String reverse(String str) {
            if (str == null || str.length() <= 1)
                return str;
            System.out.println(str.charAt(0));
            System.out.println(str.substring(1));
            return reverse(str.substring(1)) + str.charAt(0);
        }


    public int get()
    {
        try{
            return 1;
        }
        finally{
            return 2;
        }
    }

}
