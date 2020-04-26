package 算法;
//普通矩阵 转为 稀疏矩阵 在转 普通矩阵
public class demo1 {
    public static void main(String[] args) {
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;

        for (int[] row:chessArr1){
            for (int data:row){
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        int sum=0;
        for (int i =0;i<11;i++){
            for (int j = 0;j<11;j++){
                if (chessArr1[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println(sum);

        //普通矩阵 转为 稀疏矩阵
        int passArr[][] = new int[sum+1][3];
        passArr[0][0] = 11;
        passArr[0][1] = 11;
        passArr[0][2] = sum;

        int count = 0;  //用于记录第几个非0数据
        for (int i =0;i<11;i++){
            for (int j = 0;j<11;j++){
                if (chessArr1[i][j] != 0){
                    count++;
                    passArr[count][0] = i;
                    passArr[count][1] = j;
                    passArr[count][2] = chessArr1[i][j];
                }
            }
        }

        System.out.println();
        for (int i = 0;i<passArr.length;i++){
            System.out.printf("%d\t%d\t%d\t\n",passArr[i][0],passArr[i][1],passArr[i][2]);
        }

        //稀疏矩阵 转为  普通矩阵

    }
}
