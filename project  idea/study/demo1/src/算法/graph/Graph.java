package 算法.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Graph {

    private ArrayList<String> vertexList;
    private int[][]  edges;
    private int numOfEdges;

    private boolean[] isVisited;

    public static void main(String[] args) {
        int n = 5;
        String Vertexs[] = {"A","B","C","D","E"};
        Graph graph = new Graph(n);
        for(String vertex:Vertexs){
            graph.insertVertex(vertex);
        }
        //添加边
        graph.insertEdge(0,1,1);
        graph.insertEdge(0,2,1);
        graph.insertEdge(1,2,1);
        graph.insertEdge(1,3,1);
        graph.insertEdge(1,4,1);

        //显示
        graph.showGraph();

        //测试
        /*System.out.println("深度优先遍历");
        graph.dfs();*/

        //测试
        System.out.println("广度优先遍历");
        graph.bfs();
    }

    public Graph(int n){
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        numOfEdges = 0;
        isVisited = new boolean[5];
    }

    //得到第一个邻接节点的下标
    public int getFirstNeighbor(int index){
        for (int j = 0; j < vertexList.size(); j++) {
            if (edges[index][j]>0){
                return j;
            }
        }
        return -1;
    }
    public int getNextNeighbor(int v1,int v2){
        for (int j = v2+1; j < vertexList.size(); j++) {
            if (edges[v1][j]>0){
                return j;
            }
        }
        return -1;
    }
    //深度优先遍历
    public void dfs(boolean[] isVisited,int i){
        System.out.print(getValueByIndex(i)+"->");
        isVisited[i] = true;

        int w = getFirstNeighbor(i);
        while (w!=-1){
            if (!isVisited[w]){
                dfs(isVisited,w);
            }
            w = getNextNeighbor(i,w);
        }
    }

    //对dfs重载
    public void dfs(){
        for (int i = 0; i < getNumOfVertex(); i++) {
            if (!isVisited[i]){
                dfs(isVisited,i);
            }
        }
    }

    //对一个结点进行广度优先遍历的方法
    private void bfs(boolean[] isVisited,int i){
        int u;
        int w;
        LinkedList queue = new LinkedList();
        System.out.print(getValueByIndex(i)+"->");
        isVisited[i] = true;
        queue.addLast(i);

        while (!queue.isEmpty()){
            u = (Integer) queue.removeFirst();

            w = getFirstNeighbor(u);
            while (w!=-1){
                if (!isVisited[w]){
                    System.out.print(getValueByIndex(w)+"=>");
                    isVisited[w] = true;
                    queue.addLast(w);
                }

                w = getNextNeighbor(u,w);
            }
        }
    }

    //遍历所有的结点，进行广度优先搜索
    public void bfs(){
        for (int i = 0; i < getNumOfVertex(); i++) {
            if (!isVisited[i]){
                bfs(isVisited,i);
            }
        }
    }

    //返回结点的个数
    public int getNumOfVertex(){
        return vertexList.size();
    }
    //显示图对应的矩阵
    public void showGraph(){
        for (int[] link: edges){
            System.out.println(Arrays.toString(link));
        }
    }
    //得到边的数目
    public int getNumOfEdges(){
        return numOfEdges;
    }
    public String getValueByIndex(int i){
        return vertexList.get(i);
    }
    public int getWeight(int v1,int v2){
        return edges[v1][v2];
    }
    //插入结点
    public void insertVertex(String vertex){
        vertexList.add(vertex);
    }

    public void insertEdge(int v1,int v2,int weight){
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }
}
