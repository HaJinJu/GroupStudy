package Sixth;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
