package Test;
// 2 by 2 행렬의 곱셈을 수행하도록 프로그래밍 해보기.
public class Quiz15 {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2},
                {3, 4},
        };
        int[][] b = {
                {5, 6},
                {7, 8},
        };

        Matrix mt = new Matrix(2,2);
        System.out.println("a[][] * b[][] =");
        mt.mulMatrix(a, b);
        mt.printMatrix();
    }
}
