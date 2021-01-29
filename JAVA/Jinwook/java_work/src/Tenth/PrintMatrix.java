package Tenth;
/* 연습문제 1
위의 이중 배열을 클래스를 통해 초기화 하도록 프로그래밍 해보자
ex) DoubleArray(3,3) 형식으로 동작하고
 PrintArray()를 통해 결과를 확인하도록 한다.
*/
public class PrintMatrix {
    public static void main(String[] args) {

        Matrix mat = new Matrix(3, 3);

        mat.allocRandomMatrix();
        mat.printMatrix();
    }
}
