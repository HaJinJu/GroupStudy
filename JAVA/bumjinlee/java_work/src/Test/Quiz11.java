package Test;
// 문제 11.
// 이중 배열을 사용하여 2 by 2 행렬의 덧셈을 프로그래밍

public class Quiz11 {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2},
                {3, 4},
        };
        int[][] b = {
                {5, 6},
                {7, 8},
        };

        Matrix mt = new Matrix(2, 2);
        System.out.println("a[][] + b[][] = ");
        mt.addMatrix(a, b);
        mt.printMatrix();
    }
}