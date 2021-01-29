package Sixth;

import java.util.Scanner;

public class InputArrayFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n번째 피보나치 항을 구해보자");
        int num = scanner.nextInt();

        // 초기에 배열의 개수를 할당할때는 대괄호 안에 개수를 적는다.
        // 사용할 때는 0부터 시작한다는 것을 주의하도록 한다.
        int[] arr1 = new int[num];
        arr1[0] = 1;
        arr1[1] = 1;

        for (int i = 2; i < num; i++) {
            arr1[i] = arr1[i - 1] + arr1[i - 2];
            System.out.printf("arr[%d] = %d\n", i, arr1[i]);
        }
    }
}
