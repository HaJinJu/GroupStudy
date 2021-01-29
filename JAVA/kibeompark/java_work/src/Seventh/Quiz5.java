package Seventh;

import java.util.Scanner;

class Fibonacci {
    int[] series;
    Scanner scan;
    int lastNum;

    public void setScan() {
        scan = new Scanner(System.in);
    }

    public void setSeries() {
        System.out.print("몇 번째 항을 찾을까요 ? ");
        lastNum = scan.nextInt();

        if (lastNum <= 0) {
            System.out.println("잘못된 입력입니다.");
            return;
        }
        series = new int[lastNum];
    }

    public int getTargetNumber() {
        if (lastNum <= 0) {
            return -1 ;
        } else if (lastNum < 3) {
            return 1;
        }

        series[0] = 1;
        series[1] = 1;

        for (int i = 2; i < lastNum; i++) {
            series[i] = series[i - 2] + series[i - 1];
        }

        // 클래스의 메서드를 통해서 어떤 값을 얻고자 할 때 return 을 사용한다.
        // 값을 얻을 필요가 없으면 return 을 하지 않거나
        // 아무것도 없는 return 을 사용한다.
        // 아무것도 없는 return 은 void 한정이다.
        return series[lastNum - 1];
    }
}
public class Quiz5 {
    public static void main(String[] args) {
        // 5) 피보나치 수열을 계산하는 문제를
        //    클래스화 시켜서 메서드 사용 방식으로 풀어보자
        //    1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        Fibonacci fib = new Fibonacci();

        fib.setScan();
        fib.setSeries();

        int checkNumber = fib.getTargetNumber();

        if (checkNumber == -1) {
            System.out.println("잘못된 입력이니 다시 하세요 !");
        } else {
            System.out.println("당신이 찾는 값은 " + fib.getTargetNumber());
        }
    }
}

/*
package Seventh;

import java.util.Arrays;
import java.util.Scanner;

class fibonacci {
    int[] fib;
    Scanner scan;
    int num;

    public void setScan() {
        scan = new Scanner(System.in);
    }

    public void setFib() {
        System.out.print("몇 번째 항까지 구할까요 ? ");
        num = scan.nextInt();

        if (num <= 0) {
            System.out.println("잘못 입력하셨습니다.");
        } else {
            fib = new int[num];

            fib[0] = 1;
            fib[1] = 1;

            for (int i = 2; i < num; i++) {
                fib[i] = fib[i - 2] + fib[i - 1];
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(fib);
    }
}
public class Quiz5 {
    public static void main(String[] args) {
        fibonacci fib = new fibonacci();

        fib.setScan();
        fib.setFib();

        if (fib.num > 0) {
            System.out.println(fib);
        }
    }
}
*/