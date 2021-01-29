package Sixth;

public class Homework3 {
    public static void main(String[] args) {
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;

        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 3];
        }

        System.out.printf("수열의 20번째 수는 %d\n", arr[19]);
    }
}
