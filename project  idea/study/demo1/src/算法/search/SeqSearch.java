package 算法.search;

public class SeqSearch {
    public static void main(String[] args) {
        int[] array = new int[]{5,7,8,6,0,1,2,9,3,4};
        int index = seqSearch(array,8);
        if (index == -1){
            System.out.println("没有找到~~");
        }else {
            System.out.printf("它是数组的第%d个",index+1);
        }
    }

    //线性查找
    public static int seqSearch(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
