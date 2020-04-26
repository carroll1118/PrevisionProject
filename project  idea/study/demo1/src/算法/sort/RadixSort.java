package 算法.sort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] array = new int[]{5,100,0,7,8,6,9,3,1,2,4};
        radixSort(array);
    }

    //基数排序
    public static void radixSort(int[] arr){

        //1.得到数组中数的最大的位数
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        int maxLength = (max + "").length();
        int[][] bucket = new int[10][arr.length];
        int[] bucketElementCounts = new int[10];

        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int digitOfElement = arr[j] / n % 10;

                bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
                bucketElementCounts[digitOfElement]++;
            }

            int index = 0;

            for (int k = 0; k < bucketElementCounts.length;k++){
                if (bucketElementCounts[k] != 0){
                    for (int l = 0; l < bucketElementCounts[k]; l++){
                        arr[index++] = bucket[k][l];
                    }
                }
                bucketElementCounts[k] = 0;
            }
            System.out.println(Arrays.toString(arr));
        }
    }


}
