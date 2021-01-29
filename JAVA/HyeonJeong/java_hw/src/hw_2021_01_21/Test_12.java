package hw_2021_01_21;

public class Test_12 {
    public static void main(String[] args) {
        System.out.println(
                "1 ~ 50 까지의 숫자를 임의로 배열에 할당하고 출력해보자!\n");

        final int TEN = 10;

        AraayTest at = new AraayTest(TEN);

        int[] test_12 = at.setArray();
        at.printArray(test_12);
    }
}
