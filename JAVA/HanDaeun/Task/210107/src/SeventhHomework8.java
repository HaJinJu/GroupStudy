/*
    < Homework 8 >
7번 문제를 중복이 허용되지 않도록 만든다.
*/


class Random2 {
    final int EMPLOYEE = 20;
    int[] checkDup;
    int cnt;
    int randNum;

    public void setCheckDup() {
        checkDup = new int[EMPLOYEE];

        for(int i = 0; i < EMPLOYEE; i++) {
            checkDup[i] = 0;
        }
    }

    public void setCnt() {
        cnt = 0;
    }

    public void numRandom() {
        for(int i = 1; ; ) {
            randNum = (int)(Math.random() * EMPLOYEE) + 1;

            if(checkDup[randNum - 1] != 0) {
                continue;
            }

            System.out.printf("%d 번째 사원의 번호 = %d\n", i++, randNum);

            checkDup[randNum - 1] = 1;
            cnt++;

            if(cnt == EMPLOYEE) {
                break;
            }
        }
    }
}

public class SeventhHomework8 {
    public static void main(String[] args) {
        Random2 rand2 = new Random2();

        rand2.setCheckDup();
        rand2.setCnt();
        rand2.numRandom();
    }
}