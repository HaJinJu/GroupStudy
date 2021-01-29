/*
    < 문제 3 >

1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, 79, ...
위 수열에서 20번째 숫자를 찾도록 프로그래밍 해보자!

 */


public class SixthTask3 {
    public static void main(String[] args) {
        final int FIXNUM1 = 1, FIXNUM2 = 3;
        int[] arr = new int[20];

        arr[0] = arr[1] = FIXNUM1;
        arr[2] = FIXNUM2;

        for(int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 3];
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
