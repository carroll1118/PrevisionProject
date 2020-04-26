package 算法.sort;

import java.util.Arrays;

//归并排序
public class MergetSort {
    public static void main(String[] args) {
        int[] array = new int[]{5,7,8,6,0,1,2,9,3,4};
        int temp[] = new int[array.length];
        mergeSort(array,0,array.length-1,temp);
        System.out.println(Arrays.toString(array));
    }

    //归并排序

    public static void mergeSort(int[] arr,int left,int right,int[] temp){
        if (left < right){
            int mid = (left + right) / 2;
            mergeSort(arr,left,mid,temp);
            mergeSort(arr,mid + 1,right,temp);

            merge(arr,left,mid,right,temp);
        }
    }

    public static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i = left;  //初始化i,左边有序序列的初始索引
        int j = mid +1;  //初始化j,右边有序序列的初始索引
        int t =0;   //指向temp当前的索引
        /*
        * （一）先把左右两边（有序）的数据按照规则填充到temp
        *       直到左右两边的有序序列，有一边处理完为止
        *
        * */
        while(i<=mid && j<=right){
            if (arr[i] <= arr[j]){
                temp[t] = arr[i];
                t +=1;
                i +=1;
            }else {
                temp[t] = arr[j];
                t +=1;
                j +=1;
            }
        }


        /*
        * （二）把剩余数据的一边的数据依次全部填充到temp
        * */
        while (i<=mid){  //左边有序序列还有剩余的元素，全部填充到temp
            temp[t] = arr[i];
            t +=1;
            i +=1;
        }


        while (j <= right){
            temp[t] = arr[j];
            t +=1;
            j +=1;
        }

        t = 0;
        int tempLeft = left;
        System.out.println("tempLeft = " + tempLeft + "   right = " + right);
        while (tempLeft <= right){
            arr[tempLeft] = temp[t];
            t +=1;
            tempLeft +=1;
        }

    }
}
