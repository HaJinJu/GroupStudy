package Tenth;

public class Homework2 {
    public static void main(String[] args) {
//        2) 행렬 두 개를 만들고 이 두 개의 행렬 덧셈을 수행하게 만들어보자!
//           행렬의 차원은 편한대로 설정해도 무방하다.
//           (오늘 만든 코드는 n by n 행렬도 가능하다)

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

        System.out.println("A + B: ");
        matR.calcMatrix(A, B, matR.add);
        matR.printMatrix();
    }
}
