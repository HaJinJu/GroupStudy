package Test01;

public class Test01_15 {
    public static void main(String[] args) {
        // 2 by 2 행렬의 곱셈을 수행하도록 프로그래밍 해보자
        TwoMatrix tm = new TwoMatrix();

        tm.setMatrix();

        tm.multiMatrix(tm.getA(), tm.getB());
        tm.printMatrix(tm.getMulti());
    }
}
