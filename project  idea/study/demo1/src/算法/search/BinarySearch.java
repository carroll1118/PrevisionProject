package 算法.search;

import java.util.ArrayList;

//二分法（数组必须是有序的）
public class BinarySearch {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,5,5,5,6,7,7,8,9};
        //int index = binarySearch(array,0,array.length-1,5);
        ArrayList<Integer> index = binarySearch2(array,0,array.length-1,5);
        System.out.println(index);
    }

    //二分法（数组必须是有序的）
    public static int binarySearch(int[] arr,int left,int right,int findVal){

        if (left>right){
            return -1;
        }
        int mid = (left + right)/2;
        int midVal = arr[mid];

        if (findVal > midVal){
            return binarySearch(arr,mid + 1,right,findVal);
        }else if (findVal < midVal){
            return binarySearch(arr,left,mid - 1,findVal);
        }else {
            return mid;
        }
    }


    //二分法（数组必须是有序的）   返回多个值的索引
    public static ArrayList<Integer> binarySearch2(int[] arr, int left, int right, int findVal){

        if (left>right){
            return new ArrayList<Integer>();
        }
        int mid = (left + right)/2;
        int midVal = arr[mid];

        if (findVal > midVal){
            return binarySearch2(arr,mid + 1,right,findVal);
        }else if (findVal < midVal){
            return binarySearch2(arr,left,mid - 1,findVal);
        }else {
            ArrayList<Integer> resIndexlist = new ArrayList<Integer>();

            int temp = mid - 1;
            while (true){
                if (temp < 0 || arr[temp] != findVal){
                    break;
                }
                resIndexlist.add(temp);
                temp -=1;
            }
            resIndexlist.add(mid);

            temp = mid + 1;
            while (true){
                if (temp > arr.length - 1 || arr[temp] != findVal){
                    break;
                }
                resIndexlist.add(temp);
                temp +=1;
            }
            return resIndexlist;
        }
    }

}
