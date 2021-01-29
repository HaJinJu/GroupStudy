package Test;

import java.util.Scanner;

class RPSGame {

    Scanner scan;

    final int SCISSORS;
    final int ROCK;
    final int PAPER;

    private int computer;
    private int player;

    public RPSGame() {
        SCISSORS = 1;
        ROCK = 2;
        PAPER = 3;

        scan = new Scanner(System.in);

        computer = (int) (Math.random() * 3) + 1;
    }

    public void play() {

        System.out.print("가위 : 1 , 바위 : 2 , 보 : 3 중 원하는 숫자를 입력하세요: ");
        player = scan.nextInt();

        if (player == computer) {
            System.out.println("무승부입니다.");
        } else if (player == SCISSORS && computer == PAPER) {
            System.out.println("플레이어 승!");
        } else if (player == ROCK && computer == SCISSORS) {
            System.out.println("플레이어 승!");
        } else if (player == PAPER && computer == ROCK) {
            System.out.println("플레이어 승!");
        } else {
            System.out.println("컴퓨터 승!");
        }
        System.out.println("컴퓨터 = " + computer);
        System.out.println("사용자 = " + player);
    }
}

public class Quiz4 {
    public static void main(String[] args) {
        RPSGame rpsg = new RPSGame();

        rpsg.play();
    }
}
