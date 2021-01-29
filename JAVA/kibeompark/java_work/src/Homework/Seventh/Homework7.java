package Homework.Seventh;

class RandomDup {
    final int NUM = 20;
    int randNum;

    public void Random() {
        for (int i = 1; i <= NUM; i++) {
            randNum = (int)(Math.random() * 20) + 1;
            System.out.printf("%d번 사원 : %d\n", i, randNum);
        }
    }
}

public class Homework7 {
    public static void main(String[] args) {
        // 7) 총 20명의 사원이 있다고 가정한다.
        //    20명 모두에게 랜덤한 번호가 할당되도록 만든다. (중복 허용)
        RandomDup rd = new RandomDup();

        rd.Random();
    }
}
