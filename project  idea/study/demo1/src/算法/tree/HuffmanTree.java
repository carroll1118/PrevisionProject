package 算法.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {
    public static void main(String[] args) {
        int arr[] = {13,7,8,3,29,6,1};
        Node root = creatHuffmanTree(arr);
        preOrder(root);
        //System.out.println(arr);
    }

    //前序遍历
    public static void preOrder(Node root){
        if (root != null){
            root.preOrder();
        }else {
            System.out.println("树为空");
        }
    }

    private static Node creatHuffmanTree(int[] arr) {
        List<Node> nodes = new ArrayList<Node>();
        for (int value:arr) {
            nodes.add(new Node(value));
        }

        while(nodes.size() > 1){
            Collections.sort(nodes);

            System.out.println(nodes);

            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);

            Node parent = new Node(leftNode.value + rightNode.value);
            parent.left = leftNode;
            parent.right = rightNode;

            nodes.remove(leftNode);
            nodes.remove(rightNode);

            nodes.add(parent);
        }
        return nodes.get(0);
    }
}

class Node implements Comparable<Node> {

    int value;
    Node left;
    Node right;

    //前序遍历
    public void preOrder(){
        System.out.println(this);
        if (this.left != null){
            this.left.preOrder();
        }
        if (this.right != null){
            this.right.preOrder();
        }
    }

    public Node(int value){
        this.value = value;
    }

    @Override
    public int compareTo(Node o) {
        return this.value - o.value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
