package Sixth;

public class HomeWork2 {
    public static void main(String[] args) {
        // 2) 1번 문제에서 만든 배열에 랜덤 값을 할당해보자!

        int[] sevenArr = new int[7];

        for (int i = 0; i < sevenArr.length; i++) {
            sevenArr[i] = (int)(Math.random() * 10);
            System.out.printf("sevenArr[%d] = %d\n", i, sevenArr[i]);
        }
    }
}
