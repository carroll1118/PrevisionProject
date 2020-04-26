package 算法.sort;

import java.util.Arrays;
//快速排序
public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{5,7,8,6,0,1,2,9,3,4};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    //快速排序
    public static void quickSort(int arr[],int left,int right){
        int l = left;  //左下标
        int r = right;  // 右下标
        int pivot = arr[(left+right)/2];  //中间值
        int temp = 0;

        while (l<r){
            while (arr[l] < pivot){
                l +=1;
            }

            while (arr[r] > pivot){
                r -=1;
            }

            if (l >= r){
                break;
            }

            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if (arr[l] == pivot){
                r -=1;
            }
            if (arr[r] == pivot){
                l +=1;
            }
        }

        if (l == r){
            l +=1;
            r -=1;
        }
        if (left<r){
            quickSort(arr,left,r);
        }
        if (right>l){
            quickSort(arr,l,right);
        }
    }
}
