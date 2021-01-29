package Eighteenth.FirstTest;

import java.util.Arrays;

class Q15 {

    public int[][] productMatrix(int[][] A, int[][] B) {
        int[][] answer = new int[A.length][B[0].length];
        for(int i=0;i<answer.length;i++){
            for(int j=0;j<answer[0].length;j++){
                for(int k=0;k<A[0].length;k++){
                    answer[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        return answer;
    }


}

public class Q15_mutipleMatrix {
    public static void main(String[] args) {
        Q15 M = new Q15();
        int[][] a = { { 1, 2 }, { 2, 3 } };
        int[][] b = { { 3, 4 }, { 5, 6 } };

        System.out.println("행렬의 곱셈 : " + Arrays.deepToString(M.productMatrix(a, b)));



    }
}
