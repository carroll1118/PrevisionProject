package 面试;

public class study1 {
    public static void main(String[] args) {
        int MyInt = 1234;
        String MyString = "" + MyInt;
        String string = String.valueOf(MyInt);
        String string1 = new String("1234");
        String string2 = new String("1234");
        System.out.println(MyString.equals(string1));
        System.out.println(string2.equals(string1));
        System.out.println(string2.equals(string2));
        System.out.println(string1 == string2);
        Integer integer = string1.hashCode();
        System.out.println(integer);
    }

}
