package hw_2021_01_21;

import java.util.Arrays;
import java.util.Random;

public class Test_03 {
    public static void main(String[] args) {
        System.out.println(
                "클래스를 사용하여 임의의 난수 배열을 생성하도록 프로그램을 작성한다.\n");

        AraayTest at = new AraayTest();

        int[] test_03 = at.setArray();
        at.printArray(test_03);
    }
}
