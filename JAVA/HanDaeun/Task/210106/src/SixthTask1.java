/*
    < 문제 1 >

7개 짜리 int 형 배열을 만들어보자!

 */


public class SixthTask1 {
    public static void main(String[] args) {
        int[] arr = new int[7];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
