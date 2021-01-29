package Sixth;

import java.util.Random;

public class Homework4 {
    public static void main(String[] args) {
        float[] arr = new float[3];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextFloat();
            System.out.printf("arr[%d] = %f\n", i, arr[i]);
        }
    }
}
