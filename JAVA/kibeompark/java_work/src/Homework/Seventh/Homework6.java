package Homework.Seventh;

import java.util.Scanner;

class Fibonacci {
    int first, second, res, target;

    Scanner scan = new Scanner(System.in);

    public void setRes() {
        System.out.print("몇 번째 항까지 구할까요 ? ");
        target = scan.nextInt();
    }

    public void Print() {
        first = 1;
        second = 1;

        System.out.printf("%d번째 항까지의 피보나치 수열 : %d %d", target, first, second);
        for (int i = 2; i < target; i++) {
            res = first + second;
            first = second;
            second = res;

            System.out.printf(" %d", res);
        }
    }
}

public class Homework6 {
    public static void main(String[] args) {
        // 6) 피보나치 수열을 배열 없이 만들어서 출력해 보도록 만든다.
        Fibonacci fib = new Fibonacci();

        fib.setRes();
        fib.Print();
    }
}
