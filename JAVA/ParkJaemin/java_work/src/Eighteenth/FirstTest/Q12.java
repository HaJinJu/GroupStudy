package Eighteenth.FirstTest;

import java.util.Arrays;
import java.util.Random;

public class Q12 {
    public static void main(String[] args) {
        Q12 R = new Q12();

        RanArr.ARR();


    }


    static class RanArr {
        public static void ARR() {
            Random random = new Random();
            int[] arr = new int[(int) (Math.random() * 50)];


            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(50) + 1;

                System.out.printf("arr[%d] = %d%n", i, arr[i]);

            }
            System.out.println("  ");
            System.out.println("[오름차순 정렬]"); // 13번문제
            Arrays.sort(arr); // 먼저

            for (int i = 0; i < arr.length; i++)
                System.out.printf("arr[%d] = %d%n", i, arr[i]);

        }
    }
}

