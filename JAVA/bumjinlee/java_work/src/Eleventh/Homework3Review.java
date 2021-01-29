package Eleventh;

public class Homework3Review {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] arr2 = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        int[][] arr3 = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12}
        };

        Matrix wrong = new Matrix(arr1, 4);
        wrong.allocRandomMatrix();
        wrong.printMatrix();

        System.out.println("A: ");
        Matrix rightCaseA = new Matrix(arr1, 3, 3);
        rightCaseA.printMatrix();

        System.out.println("B: ");
        Matrix rightCaseB = new Matrix(arr2, 3);
        rightCaseB.printMatrix();

        System.out.println("C: ");
        Matrix rightCaseC = new Matrix(arr3, 4);
        rightCaseC.printMatrix();

        System.out.println("A - B = ");
        Matrix R = new Matrix(3, 3);
        R.subMatrix(rightCaseA, rightCaseB);
        R.printMatrix();
    }

}
