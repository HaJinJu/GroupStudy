package Test01;

class DiceGame {
    private int randomNum, userNum;

    public DiceGame() {
        userNum = (int)(Math.random() * 6) + 1;
    }

    public void playDiceGame() {
        do {
            System.out.println("사용자 주사위 값 : " + userNum);
            randomNum = (int)(Math.random() * 6) + 1;
            System.out.println("컴퓨터 주사위 값 : " + randomNum);

            if (userNum > randomNum) {
                System.out.println("사용자 승!");
                break;
            } else if (userNum < randomNum) {
                System.out.println("컴퓨터 승!");
                break;
            } else {
                System.out.println("무승부입니다.");
            }
        } while(true);
    }
}

public class Test01_07 {
    public static void main(String[] args) {
        // 컴퓨터와 주사위를 굴려서 숫자가 크면 승리하도록 프로그래밍해보자
        DiceGame dg = new DiceGame();

        dg.playDiceGame();
    }
}
