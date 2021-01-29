package hw_2021_01_06;

public class HW02 {
    public static void main(String[] args) {
        // 1번 문제에서 만든 배열에 랜덤 값을 할당해보자!

        int[] array = new int[7];

        for(int i = 0; i < array.length; i++) {
            int randomNum = (int) (Math.random() * 10);
            array[i] = randomNum;

            System.out.printf("array[%d] = %d\n",i , array[i]);
        }
    }
}
