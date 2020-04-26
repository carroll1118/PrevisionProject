package 算法.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] array = new int[]{5,7,8,6,9,10,1,2,3,4};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }

    //选择排序
    public static void selectSort(int[] arr){

        for (int i=0;i<arr.length-1;i++){
            int minIndex = i;
            int min = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (min >  arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            if (minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}
