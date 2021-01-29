package Seventh;

import java.util.Arrays;

class Company {
    final int STAFF = 20;

    public void assignID() {
        for (int i = 0; i < STAFF; i++) {
            int randNum = (int)(Math.random() * 20) + 1;
            System.out.printf("%d번 사원의 ID: %d\n", i + 1, randNum);
        }
    }
}

public class Homework7 {
    public static void main(String[] args) {
        // 7. 총 20명의 사원이 있다고 가정한다. 20명 모두에게 랜덤한 번호가 할당되도록 만든다.(중복허용)

        Company c = new Company();

        c.assignID();
    }
}
