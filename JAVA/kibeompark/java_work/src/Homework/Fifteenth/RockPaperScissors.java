package Homework.Fifteenth;

public class RockPaperScissors {
    final int SCISSORS = 1;
    final int ROCK = 2;
    final int PAPER = 3;
    final String[] rps = {"가위", "바위", "보"};

    public RockPaperScissors() {
        System.out.println("[가위바위보 게임]");
        System.out.println("가위 : 1, 바위 : 2, 보 : 3");
        System.out.println("숫자로 입력해 주세요.");
    }

    public void playGame(int player1, int player2) {
        System.out.println("나 : " + rps[player1 - 1] + " VS 상대방 : " + rps[player2 - 1]);

        if (player1 == player2) {
            System.out.println("무승부");
        } else if (player1 == SCISSORS && player2 == PAPER) {
            System.out.println("본인 승 !");
        } else if (player1 == ROCK && player2 == SCISSORS) {
            System.out.println("본인 승 !");
        } else if (player1 == PAPER && player2 == ROCK) {
            System.out.println("본인 승 !");
        } else {
            System.out.println("상대방 승 !");
        }
    }


}
