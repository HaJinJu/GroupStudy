package Seventh;

class FibonacciSeries {

    public void makeFibonacci() {
        final int TARGETNUM = 20;
        int first           = 1;
        int second          = 1;
        int current;

        for (int i = 3; i < TARGETNUM + 1; i++) {
            current = first + second;
            first = second;
            second = current;
            System.out.printf("%d항 = %d\n", i, current);
        }
    }
}

public class Homework6 {
    public static void main(String[] args) {
        // 6. 피보나치 수열을 배열 없이 만들어서 출력해보도록 만든다.

        FibonacciSeries fibs = new FibonacciSeries();

        fibs.makeFibonacci();
    }
}
