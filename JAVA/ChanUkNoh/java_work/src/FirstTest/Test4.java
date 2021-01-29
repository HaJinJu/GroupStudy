package FirstTest;

import java.util.Scanner;

class RSP_Game {
    private final int SCISSORS = 1;
    private final int ROCK = 2;
    private final int PAPER = 3;

    private Scanner scan;
    private int computer;
    private int player;

    public RSP_Game() {
        System.out.println("가위바위보 게임에 온 것을 환영합니다.");
        scan = new Scanner(System.in);
    }

    public void playGame() {
        System.out.println("가위바위보 게임을 시작합니다.");

        duel();
        for (;;) {
            if (player == computer) {
                System.out.println("Draw!!");
                System.out.println("Rematch Start!");

                duel();
            } else if (player == SCISSORS && computer == PAPER) {
                System.out.println("Player Win");
                break;
            } else if (player == ROCK && computer == SCISSORS) {
                System.out.println("Player Win");
                break;
            } else if (player == PAPER && computer == ROCK) {
                System.out.println("Player Win");
                break;
            } else {
                System.out.println("Computer Win");
                break;
            }
        }
    }

    private void duel() {
        System.out.println("가위: 1, 바위: 2 보: 3");

        player = scan.nextInt();

        computer = (int)(Math.random() * 3) + 1;
    }
}

public class Test4 {
    public static void main(String[] args) {
        RSP_Game rg = new RSP_Game();

        rg.playGame();
    }

}
