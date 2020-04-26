package 算法;
//递归  基础问题
public class demo2 {
    public static void main(String[] args) {
        test(4);
        int a = factorial(5);
        System.out.println(a);
    }

    private static void test(int n) {
        if (n>2){
            test(n-1);
        }
        System.out.println("n = "+ n);
    }

    public static int factorial(int n){
        if (n == 0 || n == 1){
            return n;
        }else{
            return n * factorial(n-1);
        }
    }
}
