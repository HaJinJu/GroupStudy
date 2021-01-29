package Sixth.SixthHomeworkReview;

import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] arr1 = new int[7];

        for (int i = 0; i < 7; i++) {
            arr1[i] = rand.nextInt(7);
            System.out.printf(" arr[%d] = %d\n ", i, arr1[i]);
        }
    }
}
