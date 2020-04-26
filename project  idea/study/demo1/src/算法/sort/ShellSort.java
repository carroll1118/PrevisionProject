package 算法.sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = new int[]{5,7,8,6,0,1,2,9,3,4};
        //shellSort(array);
        shellSort2(array);
    }

    //希尔排序（交换法）
    public static void shellSort(int[] arr) {
        int temp = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
        //第一轮
        /*for (int i = 5; i < arr.length; i++) {
            for (int j = i - 5; j >= 0; j -= 5) {
                if (arr[j] > arr[j+5]){
                    temp = arr[j];
                    arr[j] = arr[j+5];
                    arr[j+5] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));*/

        //第二轮
        /*for (int i = 2; i < arr.length; i++) {
            for (int j = i - 2; j >= 0; j -= 2) {
                if (arr[j] > arr[j+2]){
                    temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));*/


        //希尔排序（移位法）
        public static void shellSort2(int[] arr){
            //增量gap，逐步缩小增量
            for (int gap = arr.length / 2; gap > 0; gap /= 2){
                for (int i = gap; i < arr.length; i++) {
                    int j = i;
                    int temp = arr[j];
                    if (arr[j] < arr[j-gap]){
                        while (j - gap >= 0 && temp < arr[j - gap]){
                            arr[j] = arr[j-gap];
                            j -= gap;
                        }
                        arr[j] = temp;
                    }
                }
                System.out.println(Arrays.toString(arr));
            }
    }

}
