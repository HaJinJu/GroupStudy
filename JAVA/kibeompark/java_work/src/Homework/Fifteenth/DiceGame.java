package Homework.Fifteenth;

public class DiceGame {
    public DiceGame() {
        System.out.println("[주사위 게임]");
    }

    public int playGame() {
        int diceNum = (int) (Math.random() * 6) + 1;

        return diceNum;
    }

    public void printGame(int player1, int player2) {
        System.out.println("나 : " + player1 + " 너 : " + player2);

        if (player1 > player2) {
            System.out.println("내가 이겼다.");
        } else if (player1 < player2) {
            System.out.println("네가 이겼다.");
        } else {
            System.out.println("비겼다.");
        }
    }
}
