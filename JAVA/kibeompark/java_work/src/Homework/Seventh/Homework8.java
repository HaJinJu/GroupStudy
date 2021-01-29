package Homework.Seventh;

class RandomNoDup {
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

            System.out.printf("%d번 사원 : %d\n", i++, randNum);

            if (i == NUM + 1) break;
        }
    }
}

public class Homework8 {
    public static void main(String[] args) {
        // 8) 총 20명의 사원이 있다고 가정한다.
        //    20명 모두에게 랜덤한 번호가 할당되도록 만든다. (중복 허용 X)
        RandomNoDup rnd = new RandomNoDup();

        rnd.Random();
    }
}
