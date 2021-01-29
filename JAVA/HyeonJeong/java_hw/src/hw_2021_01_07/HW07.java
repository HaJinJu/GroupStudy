package hw_2021_01_07;

import java.util.Random;

public class HW07 {
    public static void main(String[] args) {
        // 총 20명의 사원이 있다고 가정한다.
        // 20명 모두에게 랜덤한 번호가 할당되도록 만든다(중복 허용)

        RandomNumber rn = new RandomNumber();

        rn.prepareArray(20);
        rn.setRandomNumber(rn.DUPLICATE);
        rn.printEmployee();
    }
}
