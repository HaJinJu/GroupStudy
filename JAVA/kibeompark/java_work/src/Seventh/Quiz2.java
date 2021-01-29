package Seventh;

import java.util.Arrays;

class StartUp {
    int[] startMemberAccount;

    public void setRandomPayment(int num) {
        int i;

        startMemberAccount = new int[num];

        for (i = 0; i < num; i++) {
            startMemberAccount[i] = (int)(Math.random() * 1201) + 2400;
        }
    }

    // toString 을 사용하면
    // 클래스 변수의 내부 정보를 System.out.println 으로 확인할 수 있게 된다.
    @Override
    public String toString() {
        return "StartUp{" + "startMemberAccount = " + Arrays.toString(startMemberAccount) + '}';
    }
}

public class Quiz2 {
    public static void main(String[] args) {
        // 변수의 정의 : 특정 데이터 타입을 저장할 수 있는 공간
        // 클래스란 결국 ? 일종의 데이터 타입
        // new 를 하면서 실제 클래스를 활용할 수 있게 된다.
        StartUp su = new StartUp();
        su.setRandomPayment(4);

        System.out.println(su);
    }
}

/*
package Seventh;

class Salary {
    int[] startMemberAccount;

    public void setstartMemberAccount() {
        final int MEMBERNUM = 4;
        startMemberAccount = new int[MEMBERNUM];

        for (int i = 0; i < MEMBERNUM; i++) {
            startMemberAccount[i] = (int)(Math.random() * 1201) + 2400;
        }
    }

    public int getstartMemberAccount(int i) {
        return startMemberAccount[i];
    }
}

public class Quiz2 {
    public static void main(String[] args) {
        final int MEMBERNUM = 4;
        Salary s = new Salary();

        for (int i = 0; i < MEMBERNUM; i++) {
            s.setstartMemberAccount();
            System.out.println("스타트업 멤버의 연봉 = " + s.getstartMemberAccount(i));
        }
    }
}
 */