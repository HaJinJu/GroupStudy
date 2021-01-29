package Homework0106;

public class Homework03 {
    public static void main(String[] args) {
        // 1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, 79, ...
        // 위 수열에서 20번째 숫자를 찾도록 프로그래밍 해보자!

        System.out.println("20번째 숫자를 찾자 !");

        int[] arr = new int[23];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;

        for(int i = 3; i <= arr.length-1; i++) {
            arr[i] = arr[i-1] + arr[i-3];
        }

        System.out.println("20 번째 항은 : " + arr[20]);
    }
}
