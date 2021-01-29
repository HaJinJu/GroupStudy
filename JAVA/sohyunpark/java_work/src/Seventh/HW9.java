package Seventh;

class Prize{
    int randNum = 0;
    int [] checkDup = new int[20];

    public void setArr3() {

        for (int i = 0; i < 20; i++) {
            checkDup[i] = 0;
        }

        for (int i = 1; ; ) {
            randNum = (int)(Math.random() * 20)+1;

            if (checkDup[randNum - 1] != 0)
                continue;

            checkDup[randNum - 1] = 1;
            System.out.printf("%d\n", randNum);


            if ((randNum == 3) || (randNum == 7)){
                System.out.println("당첨되셨습니다! 상금은 100만원입니다!");
            } else {
                System.out.println("아쉽네요 ~ 다음에 재도전을!");
            }

        }
    }
}

public class HW9 {
    public static void main(String[] args) {
        // 8번 문제에 번호별로 상금과 꽝이 존재하도록 하여
        // 당첨되면 '상금을 xxx 받았습니다'
        // 꽝이면 '아쉽네요 ~ 다음에 재도전을!'을 출력되도록 만든다.

        Prize pr = new Prize();
        pr.setArr3();

    }
}