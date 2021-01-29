package Tenth;

public class Homework3 {
    public static void main(String[] args) {
//        3) 덧셈이 있다면 뺄셈도 있으니 뺄셈을 만들어보자!

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

        System.out.println("A - B: ");
        matR.calcMatrix(A, B, matR.subtract);
        matR.printMatrix();
    }
}
