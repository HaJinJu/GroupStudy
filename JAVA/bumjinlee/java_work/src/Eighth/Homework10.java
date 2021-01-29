package Eighth;

class MultiplicationTable {
//    10) 구구단을 클래스를 활용해서 프로그래밍 해보자!
    public void printMultiplicationTable() {

        for(int i = 2; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                int res = i * j;

                System.out.printf("%d X %d = %d\n", i, j, res);
            }
        }
    }
}

public class Homework10 {
    public static void main(String[] args) {
        MultiplicationTable mt = new MultiplicationTable();

        mt. printMultiplicationTable();
    }
}