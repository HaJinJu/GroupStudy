/*
    < Homework 9 >
8번 문제에서 번호별로 상금과 꽝이 존재하도록 하여
당첨되면 '상금을 xxx 받았습니다.'
꽝이면 '아쉽네요 ~ 다음에 재도전을!' 이 출력되도록 만든다.
*/


class Random3 {
    final int EMPLOYEE = 20;
    final String WIN = "상금을 xxx 받았습니다.";
    final String LOSE = "아쉽네요 ~ 다음에 재도전을!";
    int[] checkDup;
    int cnt;
    int randNum, randWin;

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

            randWin = (int)(Math.random() * 2) + 1;
            if(randWin == 1) {
                System.out.printf("\t%s\n", WIN);
            } else {
                System.out.printf("\t%s\n", LOSE);
            }

            checkDup[randNum - 1] = 1;
            cnt++;

            if(cnt == EMPLOYEE) {
                break;
            }
        }
    }
}

public class SeventhHomework9 {
    public static void main(String[] args) {
        Random3 rand3 = new Random3();

        rand3.setCheckDup();
        rand3.setCnt();
        rand3.numRandom();
    }
}