package Seventeenth;

public class Quiz11 {
    //11. 이중 배열을 사용하여 2 by 2 행렬의 덧셈을 프로그래밍 해보자!
    public static void main(String[] args) {
        DoubleArray da = new DoubleArray(2,2);
        DoubleArray da2 = new DoubleArray(2,2);
        System.out.println("1번째 행렬");
        da.setMat();
        System.out.println("2번째 행렬");
        da2.setMat();
        da.addMatrix(da2);
        System.out.println("");
        da.printMatrix();

        da.multiMatrix(da2);
        da.printMatrix2();
    }
}
