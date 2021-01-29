package Ninth;

import Eighth.MySeries;

public class HW7_0108 {
    public static void main(String[] args) {
        // 3 ~ 33 까지의 홀수 합산 결과를 출력해보자!
        MySeries ms = new MySeries();

        System.out.println("3 ~ 33 까지의 합 = " + ms.valueSum(3, 33));

    }
}
