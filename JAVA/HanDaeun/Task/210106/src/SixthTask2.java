/*
    < 문제 2 >

1번 문제에서 만든 배열에 랜덤 값을 할당해보자!

 */


public class SixthTask2 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        int randNum;

        for(int i = 0; i < arr.length; i++) {
            randNum = (int)(Math.random() * 100) + 1;           // 1 ~ 100 사이의 랜덤 값을 할당
            arr[i] = randNum;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
