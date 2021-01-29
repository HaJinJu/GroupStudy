package Seventh;

import java.util.Arrays;

class Fibonacci {
    // 5) 피보나치 수열을 계산하는 문제를 클래스화 시켜서 만들어보자!
    int[] arr;

    @Override
    public String toString() {
        return "Fibonacci{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public void fibonacciMaker(int num) {
        arr = new int[num];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
    }
}

public class Exercise5 {
    public static void main(String[] args) {

        Fibonacci fb = new Fibonacci();

        fb.fibonacciMaker(20);

        System.out.println(fb);
    }
}