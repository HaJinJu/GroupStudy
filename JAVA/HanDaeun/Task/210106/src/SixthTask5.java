/*
    < 문제 5 >

1 ~ 100 까지 숫자중 3 의 배수만 출력해보자!

 */


public class SixthTask5 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

            if(arr[i] % 3 == 0) {
                System.out.printf("arr[%d] = %d\n", i, arr[i]);
            }
        }
    }
}
