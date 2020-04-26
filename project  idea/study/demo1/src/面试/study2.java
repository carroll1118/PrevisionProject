package 面试;
//递归方法求n的阶乘
public class study2 {
    public int factorial(int n){
        if (n == 0 || n == 1){
            return n;
        }else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        study2 test = new study2();
        Integer test1 = test.factorial(4);
        System.out.println(test1);
    }
}
