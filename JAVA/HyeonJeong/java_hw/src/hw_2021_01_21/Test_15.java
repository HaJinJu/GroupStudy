package hw_2021_01_21;

public class Test_15 {
    public static void main(String[] args) {
        System.out.println(
                "2 by 2 행렬의 곱셈을 수행하도록 프로그래밍 해보자!\n");

        int[][] matrixONE = {
                                {1, 2},
                                {2, 4},
                                        };
        int[][] matrixTWO = {
                                {4, 3},
                                {2, 1},
                                        };

        MatrixTest mt = new MatrixTest(2, 2);
        System.out.println("matrixONE * matrixTWO =");
        mt.mulMatirx(matrixONE, matrixTWO);
        mt.printMatrix();
    }
}
