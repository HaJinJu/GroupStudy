/*
    < Homework 7 >
총 20명의 사원이 있다고 가정한다.
20명 모두에게 랜덤한 번호가 할당되도록 만든다(중복 허용)
*/


class Random1 {
    final int EMPLOYEE = 20;
    int randNum;

    public void numRandom() {
        for(int i = 1; i <= EMPLOYEE; i++) {
            randNum = (int)(Math.random() * EMPLOYEE) + 1;
            System.out.printf("%d 번째 사원의 번호 = %d\n", i, randNum);
        }
    }
}

public class SeventhHomework7 {
    public static void main(String[] args) {
        Random1 rand1 = new Random1();

        rand1.numRandom();
    }
}