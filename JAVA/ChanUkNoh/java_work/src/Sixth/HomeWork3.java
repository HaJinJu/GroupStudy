package Sixth;

public class HomeWork3 {
    public static void main(String[] args) {

        // 3) 1, 1, 3, 4, 5, 8, 12, 17 ...
        //    위 수열에서 20번째 숫자를 찾도록 프로그래밍 해보자!

        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;

        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 3];
            System.out.printf("%d 번째 항 = %d\n", i + 1, arr[i]);
        }

    }
}
