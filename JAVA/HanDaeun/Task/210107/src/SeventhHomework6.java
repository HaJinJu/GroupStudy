/*
    < Homework 6 >
피보나치 수열을 배열 없이 만들어서 출력해보도록 만든다.
*/


import java.util.Scanner;

class Fibonacci2 {
    Scanner scan;
    int targetNum;
    int pastNum, preNum, sum;

    public void setScan() {
        scan = new Scanner(System.in);
    }

    public void setNum() {
        System.out.print("몇 번째 피보나치 항까지 찾을지 입력하세요 : ");
        targetNum = scan.nextInt();

        if(targetNum <= 0) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }

        pastNum = preNum = 1;
    }

    public void getFibonacci() {
        if(targetNum == 1) {
            System.out.printf("%d 번째 항까지의 피보나치 수열 = %d", targetNum, pastNum);
        } else if(targetNum >= 2){
            System.out.printf("%d 번째 항까지의 피보나치 수열 = %d %d", targetNum, pastNum, preNum);

            if(targetNum == 2)
                return;

            for(int i = 3; i <= targetNum; i++) {
                sum = pastNum + preNum;
                System.out.printf(" %d", sum);

                pastNum = preNum;
                preNum = sum;
            }
        }
    }
}

public class SeventhHomework6 {
    public static void main(String[] args) {
        Fibonacci2 fib2 = new Fibonacci2();

        fib2.setScan();
        fib2.setNum();
        fib2.getFibonacci();
    }
}