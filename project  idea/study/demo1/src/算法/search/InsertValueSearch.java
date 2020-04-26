package 算法.search;

import java.util.ArrayList;

//插值查找（数组必须是有序的）
public class InsertValueSearch {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,5,5,5,6,7,7,8,9};
        int index = insertValueSearch(array,0,array.length-1,5);
        System.out.println(index);
    }

    //插值查找（数组必须是有序的）
    public static int insertValueSearch(int[] arr,int left,int right,int findVal){

        if (left>right || findVal < arr[0] || findVal > arr[arr.length - 1]){
            return -1;
        }
        int mid = left + (right - left) * (findVal - arr[left]) / (arr[right] - arr[left]);
        int midVal = arr[mid];

        if (findVal > midVal){
            return insertValueSearch(arr,mid + 1,right,findVal);
        }else if (findVal < midVal){
            return insertValueSearch(arr,left,mid - 1,findVal);
        }else {
            return mid;
        }
    }

}
