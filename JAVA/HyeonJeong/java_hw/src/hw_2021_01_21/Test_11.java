package hw_2021_01_21;

public class Test_11 {
    public static void main(String[] args) {
        System.out.println(
                "이중 배열을 사용하여 2 by 2 행렬의 덧셈을 프로그래밍 해보자!\n");

        int[][] matrixONE = {
                                {1, 2},
                                {2, 4},
                                        };
        int[][] matrixTWO = {
                                {4, 3},
                                {2, 1},
                                        };
        MatrixTest mt = new MatrixTest(2,2);
        System.out.println("randomMAT + matrixONE =");
        mt.setMatrix();
        System.out.println("--더하기--");
        mt.addMatrix(matrixONE);
        mt.printMatrix();

        System.out.println("\nmatrixONE + matrixTWO = ");
        mt.addMatrix(matrixONE, matrixTWO);
        mt.printMatrix();




    }
}
