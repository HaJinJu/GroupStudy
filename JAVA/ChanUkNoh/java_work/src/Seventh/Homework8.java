package Seventh;

class Company2 {
    final int STAFF = 20;
    int[] id = new int[STAFF];
    int i;
    int randNum;

    public void assignID() {

        for (i = 0; i < STAFF; i++) {
            id[i] = 0;
        }

        for (i = 0;;) {
            randNum = (int)(Math.random() * 20) + 1;

            if (id[randNum - 1] != 0) continue;

            if (id[randNum - 1] == 0) id[randNum - 1] = -1;

            System.out.printf("%d번 = %d\n", i + 1, randNum);

            i++;

            if (i == STAFF) break;
        }
    }

    public void pickPrize() {

        for (i = 0; i < STAFF; i++) {
            id[i] = 0;
        }

        for (i = 0;;) {
            randNum = (int)(Math.random() * 20) + 1;

            if (id[randNum - 1] != 0) continue;

            if (id[randNum - 1] == 0) id[randNum - 1] = -1;

            if (randNum == 7) {
                System.out.printf("%d번 = %d  당첨! 상금을 받았습니다.\n", i + 1, randNum);
            } else {
                System.out.printf("%d번 = %d  아쉽네요~ 다음에 재도전!\n", i + 1, randNum);
            }

            i++;

            if (i == STAFF) break;
        }
    }
}

public class Homework8 {
    public static void main(String[] args) {
        // 8. 7번 문제를 중복이 허용되지 않도록 만든다.
        Company2 c2 = new Company2();

        c2. assignID();
    }
}
