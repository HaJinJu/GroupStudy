package Homework.Seventh;

class RandomNoDup2 {
    final int NUM = 20;
    int i, randNum;
    int[] employee = new int[NUM];

    public void Employee() {
        for (int i = 0; i < NUM; i++) {
            employee[i] = 0;
        }
    }

    public void Random() {
        for (i = 1; ; ) {
            randNum = (int)(Math.random() * 20) + 1;

            if (employee[randNum - 1] != 0) continue;

            employee[randNum - 1] = 1;

            System.out.printf("%d번 사원 : %d\n", i, randNum);
            Prize();

            if (i++ == NUM) break;
        }
    }

    public void Prize() {
        if (randNum == 1 || randNum == 3 || randNum == 7 || randNum == 10 || randNum == 18) {
            System.out.println("상금을 1억 원 받았습니다.");
        } else {
            System.out.println("아쉽네요 ~ 다음에 재도전을 !");
        }
    }
}

public class Homework9 {
    public static void main(String[] args) {
        // 9) 8번 문제에서 번호 별로 상금과 꽝이 존재하도록 하여
        //    당첨되면 '상금을 xxx 받았습니다.'
        //    꽝이면 '아쉽네요 ~ 다음에 재도전을 !' 이 출력되도록 만든다.
        RandomNoDup2 rnd = new RandomNoDup2();

        rnd.Random();
    }
}
