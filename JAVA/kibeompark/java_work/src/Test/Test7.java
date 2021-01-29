package Test;

class DiceGame {
    private int playerNum, computerNum;

    public DiceGame() {
        System.out.println("주사위 게임 시작 !");
    }

    public void playDice() {
        playerNum = (int) (Math.random() * 6) + 1;
        computerNum = (int) (Math.random() * 6) + 1;
    }

    public void printWinner() {
        while (true) {
            System.out.println("사용자 : " + playerNum);
            System.out.println("컴퓨터 : " + computerNum);

            if (playerNum == computerNum) {
                System.out.println("무승부 !\n");
                System.out.println("승패 결정을 위해 게임을 다시 시작합니다.");

                playDice();
            } else {
                if (playerNum > computerNum) {
                    System.out.println("사용자 승 !");
                } else if (playerNum < computerNum) {
                    System.out.println("컴퓨터 승 !");
                }

                break;
            }
        }
    }
}

public class Test7 {
    public static void main(String[] args) {
        // 컴퓨터와 주사위를 굴려서 숫자가 크면 승리하도록 프로그래밍해 보자 !
        DiceGame dg = new DiceGame();

        dg.playDice();
        dg.printWinner();
    }
}
