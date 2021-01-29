/*
    < 연습 문제 5 >

피보나치 수열을 계산하는 문제를
클래스화 시켜서 매서드 사용 방식으로 풀어보자

 */


import java.util.Scanner;

class Fibonacci {
    Scanner scan = new Scanner(System.in);
    int num;
    int[] fib;

    public void setNum() {
        System.out.print("몇 번째 피보나치 항을 구할지 입력하세요 : ");
        this.num = scan.nextInt();

        fib = new int[num];
        fib[0] = fib[1] = 1;
    }

    public void getFibonacci() {
        for(int i = 2; i < num; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.printf("%d 번째 피보나치 항은 = %d", num, fib[num - 1]);
    }
}


public class SeventhTask5 {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();

        fib.setNum();
        fib.getFibonacci();
    }
}
