package FirstTest;

class DiceGame {
    private int computerDice;
    private int playerDice;

    public DiceGame() {
        System.out.println("주사위 게임에 오신 것을 환영합니다.");
    }

    public void playGame() {

        rollDice();

        if (playerDice > computerDice) {
            System.out.println("승리!");
        } else if (computerDice > playerDice) {
            System.out.println("패배!");
        } else {
            System.out.println("무승부!");
        }
    }

    private void rollDice() {
        System.out.println("주사위를 굴립니다.");

        computerDice = (int)(Math.random() * 6) + 1;
        System.out.println("컴퓨터 :" + computerDice);

        playerDice = (int)(Math.random() * 6) + 1;
        System.out.println("나: " + playerDice);
    }
}

public class Test7 {
    public static void main(String[] args) {
        DiceGame dg = new DiceGame();

        dg.playGame();
    }
}
