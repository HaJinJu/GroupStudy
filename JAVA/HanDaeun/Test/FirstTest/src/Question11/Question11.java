/*
        < Question 11 >
이중 배열을 사용하여 2 by 2 행렬의 덧셈을 프로그래밍 해보자!
*/


package Question11;

import ClassList.Matrix;

public class Question11 {
    public static void main(String[] args) {
        final String PRINTA = "행렬 A = ";
        final String PRINTB = "행렬 B = ";
        final String PRINTADD = "A + B = ";

        Matrix A = new Matrix(2, 2);
        Matrix B = new Matrix(2, 2);

        A.setRandomMatValue();
        B.setRandomMatValue();
        System.out.println(PRINTA);
        A.printMatrix();
        System.out.println(PRINTB);
        B.printMatrix();

        A.addMatrix(B);
        Matrix matAdd = new Matrix(A.getMatAdd());
        System.out.println(PRINTADD);
        matAdd.printMatrix();
    }
}