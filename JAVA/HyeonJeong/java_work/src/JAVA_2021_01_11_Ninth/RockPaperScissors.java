package JAVA_2021_01_11_Ninth;

import java.util.Scanner;

public class RockPaperScissors {
    final int SCISSORS = 1;
    final int ROCK = 2;
    final int PAPER = 3;

    Scanner scan;
    int computerNum;
    int playerNum;

    boolean duel;

    RockPaperScissors() {
        scan = new Scanner(System.in);
        this.duel = false;

        System.out.printf("연습 대련입니다.\n");
    }

    RockPaperScissors(boolean duel) {
        scan = new Scanner(System.in);
        if(duel != true) {
            System.out.println("결투 모드입니다. 다음부턴 true 설정을 해주세요!");
        }
        this.duel = true;

        System.out.printf("결투 모드입니다.\n");
    }

    public void playGame() {
        // String computerStr, playerStr;
        do {
            computerNum = (int) (Math.random() * 3) + 1;
            System.out.print(
                    "가위는 1, 바위는 2, 보자기는 3, 원하는 값을 입력하세요: ");

            playerNum = scan.nextInt();

            // 가독성이 좋은 코드
            if (playerNum == computerNum) {
                System.out.println("무승부입니다.");
            } else if(playerNum == SCISSORS && computerNum == PAPER) {
                System.out.println("사용자 승!");
                break;
            } else if(playerNum == ROCK && computerNum == SCISSORS) {
                System.out.println("사용자 승!");
                break;
            } else if(playerNum == PAPER && computerNum == ROCK) {
                System.out.println("사용자 승!");
                break;
            } else {
                System.out.println("컴퓨터 승!");
                break;
            }
            break;
            // 1 vs 3
            // 2 vs 1
            // 3 vs 2

        } while(duel);
    }
}
