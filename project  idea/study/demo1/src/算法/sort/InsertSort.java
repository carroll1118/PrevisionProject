package 算法.sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[]{5,7,8,6,9,0,1,2,3,4};

    }
    // 插入排序
    public static void insertSort(int[] array){
        int j;
        for (int i = 1;i<array.length;i++){
            int temp = array[i];
            for (j = i;j>0 && temp < array[j-1];j--){
                array[j] = array[j-1];
            }
            array[j] = temp;
        }

        for (int i = 0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
