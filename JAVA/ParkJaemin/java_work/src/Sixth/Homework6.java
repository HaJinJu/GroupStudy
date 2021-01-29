package Sixth;

public class Homework6 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        arr[0] = 0;


        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 3;
            if (arr[i] % 3 == 0)
                System.out.printf("arr[%d] = %d\n", i, arr[i]);

        }
    }
}
