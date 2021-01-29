package Ninth;

import Eighth.MySeries;

public class HW3_0108 {
    public static void main(String[] args) {
        // 생성자를 사용하여 5 ~ 55 까지 숫자 중 7의 배수만 출력해보자
        MySeries ms = new MySeries();

        ms.printValue(5, 55, 7);
    }
}
