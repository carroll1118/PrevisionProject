import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.regex.Pattern;
public class Main {
    public static void get_txt() throws FileNotFoundException{
        try {
            RandomAccessFile ra= new RandomAccessFile("D:\\img\\a.txt","rw");
            Pattern pa;
            pa=Pattern.compile(" ");
            String s="s";
            while(s!=null)
            {
                s=ra.readLine();
                String[] str=pa.split(s);
                int length=str.length;
                //新的数组
                String s1="";
                String s2="19"+str[length-1];
                if((length==0) || (s2.equals("19"))){
                    break;
                }
                //新的字符串拼接
                for(int i=0;i<length-1;i++){
                    s1=s1+" "+str[i];
                }
                s1=s1+" "+s2;
                System.out.println(s1);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        get_txt();
    }

}
