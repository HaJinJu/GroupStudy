package Test;

import java.util.Scanner;

class RockPaperScissors {
    private final int SCISSORS = 1;
    private final int ROCK = 2;
    private final int PAPER = 3;
    private int playerNum, computerNum;
    private String [] rps;

    private Scanner scan;

    public RockPaperScissors() {
        System.out.println("가위바위보 게임 시작 !");

        scan = new Scanner(System.in);

        rps = new String[] {"가위", "바위", "보"};
    }

    public boolean isWrong() {
        return (playerNum < 1 || playerNum > 3);
    }

    public void playRPS() {
        System.out.println("가위 : 1, 바위 : 2, 보 : 3");
        System.out.print("숫자를 입력해 주세요. ");

        do {
            playerNum = scan.nextInt();

            if (isWrong()) {
                System.out.print("잘못 입력하였습니다. 다시 입력해 주세요. ");
            }
        } while (isWrong());

        computerNum = (int) (Math.random() * 3) + 1;
    }

    public void printWinner() {
        while (true) {
            System.out.printf("사용자 : %s VS 컴퓨터 : %s",
                    rps[playerNum - 1], rps[computerNum - 1]);
            System.out.println();

            if (playerNum == computerNum) {
                System.out.println("무승부 !\n");
                System.out.println("승패 결정을 위해 게임을 다시 시작합니다.");

                playRPS();
            } else {
                if (playerNum == SCISSORS && computerNum == PAPER) {
                    System.out.println("사용자 승 !");
                } else if (playerNum == ROCK && computerNum == SCISSORS) {
                    System.out.println("사용자 승 !");
                } else if (playerNum == PAPER && computerNum == ROCK) {
                    System.out.println("사용자 승 !");
                } else {
                    System.out.println("컴퓨터 승 !");
                }

                break;
            }
        }
    }
}

public class Test4 {
    public static void main(String[] args) {
        // 혼자서 컴퓨터와 즐기는 가위, 바위, 보 게임을 만들어 보자 !
        RockPaperScissors rps = new RockPaperScissors();

        rps.playRPS();
        rps.printWinner();
    }
}
