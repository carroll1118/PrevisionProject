package 算法.tree;

public class ArrBinaryTreeDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ArrBinaryTree arrBinaryTree = new ArrBinaryTree(arr);
        arrBinaryTree.preOrder();
    }
}

class ArrBinaryTree{
    private int[] arr;

    public ArrBinaryTree(int[] arr){
        this.arr = arr;
    }

    //重载preOrder
    public void preOrder(){
        this.preOrder(0);
    }

    public void preOrder(int index){
        if (arr == null || arr.length == 0){
            System.out.println("数组为空");
        }
        System.out.println(arr[index]);
        if ((index * 2 + 1) < arr.length){
            preOrder(2*index+1);
        }
        if ((index * 2 + 2) < arr.length){
            preOrder(2*index+2);
        }
    }
}
