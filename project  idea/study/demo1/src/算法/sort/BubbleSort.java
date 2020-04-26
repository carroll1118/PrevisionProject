package 算法.sort;
//冒泡排序法
public class BubbleSort {
        public static void main(String[] args) {
            int[] array = new int[]{5,7,8,6,9,10,1,2,3,4};
            boolean flag = false;

            for (int i = 0;i<array.length-1;i++){
                for (int j = 0;j<array.length - 1 - i;j++){
                    if (array[j]>array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;

                        flag = true;
                    }
                }
                if (!flag){
                    break;
                }
            }

            for (int i =0;i<array.length;i++){
                System.out.print(array[i]);
            }

        }

}
