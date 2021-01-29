package Homework.Tenth;

public class Homework1 {
    public static void main(String[] args) {
        // 1) 오늘 만든 Matrix 클래스를 개조하여
        //    사용자의 배열을 입력받아 행렬을 만들도록 개조해 보자 !
        //    실제 matlab의 풀 라이센스 가격은
        //    수십억 ~ 백억 이상 되는 소프트웨어다.
        //    ex) numpy나 matlab이라는 파이썬 라이브러리
        //    혹은 소프트웨어에 존재하는 기능으로
        //    아래와 같은 것이 되게 만드는 것이다.
        //    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //    Matrix A = new Matrix(arr, 3, 3);
        //    혹은
        //    Matrix A = new Matrix(arr, 3);
        //    둘 다 동작이 되어야 할 것이다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("행과 열이 모두 주어진 행렬");
        Matrix m1 = new Matrix(arr, 3, 3);
        m1.printMatrix();

        System.out.println("\n행만 주어진 행렬");
        Matrix m2 = new Matrix(arr, 3);
        m2.printMatrix();
    }
}
