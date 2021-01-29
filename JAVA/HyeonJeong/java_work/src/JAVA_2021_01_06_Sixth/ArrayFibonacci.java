package JAVA_2021_01_06_Sixth;

public class ArrayFibonacci {
    public static void main(String[] args) {
        // 피보나치 수열을 프로그래밍으로 구현해보자!
        // 구체적으로 13번째 항의 숫자를 구하도록 만들어보자!

        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, .........
        System.out.println("13번째 피보나치 항을 구해보자!");

        int[] array = new int[13];

        array[0] = 1;
        array[1] = 1;

        for(int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.printf("arr[%d] = %d\n", i , array[i-1]);
        }

        /*
        for문을 이용해 만든 피보나치 수열

        final int TARGET = 13;
        final int ALREADY = 2;
        int loop = 0;
        int first = 1, second = 1, res = 0;

//      first   second  res
//        1       1      2
//        1       2      3
//        2       3      5
//        3       5      8

//      2는 왜 빼나요?
//      첫번째 항 + 두 번째 항 = 결과

        while(loop < TARGET - ALREADY){
            res = first + second;
            first = second;
            second = res;


            loop++;
        }
        System.out.println("res = " + res);
         */
    }
}
