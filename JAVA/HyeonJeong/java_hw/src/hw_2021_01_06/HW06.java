package hw_2021_01_06;

public class HW06 {
    public static void main(String[] args) {
        // 5번 문제에서 출력한 값들을 출력하지 않고
        // 배열에 저장하고 출력하도록 한다.

        final int A_HUNDRED = 100;
        final int MULTI_NUM = 3;
        int[] series = new int[A_HUNDRED/MULTI_NUM];
        int count = 0;

        for(int i = 1; i < A_HUNDRED; i++) {
            if(i % MULTI_NUM == 0) {
                series[count] = i;
                System.out.printf("array[%d] = %d\n", count, series[count++]);
            }
        }
    }
}
