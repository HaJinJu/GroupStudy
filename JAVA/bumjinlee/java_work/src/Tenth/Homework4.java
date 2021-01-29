package Tenth;

public class Homework4 {
    public static void main(String[] args) {
//        4) 그렇다면 곱셈이 빠질 수 없으므로 곱셈도 만든다.

        MyMatrix matA = new MyMatrix(3,3);
        MyMatrix matB = new MyMatrix(3,3);
        MyMatrix matR = new MyMatrix(3,3);

        System.out.println("A:");
        matA.allocRandomMatrix();
        int[][] A = matA.getMat();
        matA.printMatrix();

        System.out.println("B:");
        matB.allocRandomMatrix();
        int[][] B = matB.getMat();
        matB.printMatrix();

        System.out.println("A X B: ");
        matR.calcMatrix(A, B, matR.multiple);
        matR.printMatrix();
    }
}
