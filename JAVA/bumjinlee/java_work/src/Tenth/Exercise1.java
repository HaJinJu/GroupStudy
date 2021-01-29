package Tenth;

public class Exercise1 {
    public static void main(String[] args) {
        // 1. 이중 배열을 클래스를 통해 초기화 하도록 프로그래밍 해보자!
        MyMatrix mat = new MyMatrix(3, 3);

        mat.allocRandomMatrix();
        mat.printMatrix();
    }
}