package Sixth;

public class ArrayFibonacci {
    public static void main(String[] args) {
        System.out.println("13번째 피보나치 항을 구해보자!");

        int[] arr = new int[13];

        arr[0] = 1;
        arr[1] = 1;

        for(int i =2; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.printf("arr[%d] = %d\n", i, arr[i] );




        }
    }
}
