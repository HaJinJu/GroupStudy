package Ninth;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class RockPaperScissors {
    final int SCISSORS = 1;
    final int ROCK = 2;
    final int PAPER = 3;

    int computerNum;
    int playerNum;

    Scanner scan;

    boolean duel; // 조건 참, 거짓으로 듀얼 모드를 키고 끌 수 있게 만듬.
                  // 듀얼 모드 - 승부가 날 때 까지

    RockPaperScissors() {
        scan = new Scanner(System.in);
        duel = false;

        System.out.println("연습 대련");
    }

    RockPaperScissors(boolean duel) {
        scan = new Scanner(System.in);

        this.duel = true;

        System.out.println("결투 모드");
    }

    public void playGame() {

        do {
            computerNum = (int)(Math.random() * 3) + 1;
            System.out.println("Scissors: 1, Rock: 2, Paper: 3");
            playerNum = scan.nextInt();

            // 가독성이 좋지만 동작이 느린 코드
            // * 자바 개발자는 크게 성능을 고려하여 코드를 짜지 않는다.
            if (playerNum == computerNum) {
                // 무승부의 경우 반복해야 하기 때문에 break가 없다.
                System.out.println("Draw!!");
            } else if (playerNum == SCISSORS && computerNum == PAPER) {
                System.out.println("Player Win");
                break;
            } else if (playerNum == ROCK && computerNum == SCISSORS) {
                System.out.println("Player Win");
                break;
            } else if (playerNum == PAPER && computerNum == ROCK) {
                System.out.println("Player Win");
                break;
            } else {
                System.out.println("Computer Win");
                break;
            }

//            가독성이 좋지 않지만 동작이 빠른 코드 (동작에 대한 주석이 필요함)

//            int tmpNum1 = playerNum - 1;
//            // playerNum에서 1을 뺀 값과 computerNum이 같으면 player가 이기는
//            // 규칙을 찾아 작성한 코드
//            int tmpNum2 = playerNum + 1;
//            // playerNum에서 1을 더한 값과 computerNum이 같으면 computer가 이기는
//            // 규칙을 찾아 작성한 코드
//
//            if (tmpNum1 < 0) {
//                tmpNum1 = 3; // playerNum이 0인경우 1을 빼면 -1이 나오기 때문에
//                // 비교를 위해 3으로 바꿔준다.
//            }
//
//            if (tmpNum2 > 3) {
//                tmpNum2 = 1;
//            }
//
//            if(tmpNum1 == computerNum) {
//                System.out.println("Player Win!");
//                break;
//            } else if (tmpNum2 == computerNum) {
//                System.out.println("Computer Win!");
//                break;
//            } else {
//                System.out.println("Draw!");
//            }

            System.out.println("Computer = " + computerNum);
            System.out.println("Player = " + playerNum);
        } while(duel); // duel이 true로 바뀌면 결투 모드로 바뀌어 무한 반복을 돌게 된다.
                       // false인 경우 do 본문을 한 번만 돈다.


    }
}
