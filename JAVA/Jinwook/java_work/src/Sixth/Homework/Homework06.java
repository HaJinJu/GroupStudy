package Sixth.Homework;

public class Homework06 {
    public static void main(String[] args) {
        //6) 5번 문제에서 출력한 값들을 출력하지 않고
        //   배열에 저장하고 출력하도록 한다.
        int[] arr = new int[100];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            if (arr[i] % 3 == 0) {

                System.out.printf("arr[%d] = %d\n", i, arr[i]);
            }

        }
    }
}