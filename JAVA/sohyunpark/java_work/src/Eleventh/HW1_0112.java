package Eleventh;

import Tenth.Matrix;
import org.w3c.dom.ls.LSOutput;

public class HW1_0112 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] arr2 = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}};
        int[][] arr3 = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12}};

        Matrix wrong = new Matrix(arr1, 4);
        wrong.allocRandomMatrix();
        wrong.printMatrix();

        // Matrix A = new Matrix(arr1, 3, 3);
        // Matrix B = new Matrix(arr2, 3);
        System.out.println("Matrix A");
        Matrix A = new Matrix(arr1, 3, 3);
        A.printMatrix();

        System.out.println("Matrix B");
        Matrix B = new Matrix(arr2, 3);
        B.printMatrix();

        System.out.println("Matrix C");
        Matrix C = new Matrix(arr3, 4);
        C.printMatrix();



        System.out.println("R = A + B");
        Matrix R = new Matrix(3,3);
        R.addMatrix(A, B);
        R.printMatrix();

        System.out.println("A = A + B");
        A.addMatrix(B);
        A.printMatrix();

        System.out.println("R = A - B");
        R.subMatrix(A, B);
        R.printMatrix();

        System.out.println("A = A - B");
        A.subMatrix(B);
        A.printMatrix();

        System.out.println("R = A * B");
        R.mulMatrix(A, B);
        R.printMatrix();
    }
}
