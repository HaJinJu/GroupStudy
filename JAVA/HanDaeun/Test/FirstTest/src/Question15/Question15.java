/*
        < Question 15 >
2 by 2 행렬의 곱셈을 수행하도록 프로그래밍 해보자!
*/


package Question15;

import ClassList.Matrix;

public class Question15 {
    public static void main(String[] args) {
        final String PRINTA = "행렬 A = ";
        final String PRINTB = "행렬 B = ";
        final String PRINTMUL = "A * B = ";

        Matrix A = new Matrix(2, 2);
        Matrix B = new Matrix(2, 2);

        A.setRandomMatValue();
        B.setRandomMatValue();
        System.out.println(PRINTA);
        A.printMatrix();
        System.out.println(PRINTB);
        B.printMatrix();

        A.mulMatrix(B);
        Matrix matMul = new Matrix(A.getMatMul());
        System.out.println(PRINTMUL);
        matMul.printMatrix();
    }
}