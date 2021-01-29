package SecondToFiveth;

import java.util.Random;

public class RandomInst {
    public static void main(String[] args) {
        Random rand = new Random();

        // bound는 범위의 개수를 지정하는 녀석
        // 입력할 필요가 없으며 자동 완서 기능으로 나타나는 것
        // 인수로 보내는 숫자는 범위를 지정해줌
        int randNum1 = rand.nextInt(2);
        System.out.println(" 0 ~ 1 까지 2개의 값을 뽑아라: " + randNum1);

        int randNum2 = rand.nextInt(6);
        System.out.println(" 0 ~ 5 까지 6개의 값을 뽑아라: " + randNum2);

        randNum2 = rand.nextInt(6) + 1; // -- 주사위 만들기
        System.out.println(" 1 ~ 6 까지 주사위 굴리기: " + randNum2);
    }
}
