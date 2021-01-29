package 정기역략평가01;

import java.util.Scanner;
class RockScissorsPaper{
    final int SCISSORS = 1;
    final int ROCK = 2;
    final int PAPER = 3;

    Scanner scan;
    int computerNum;
    int playerNum;

    boolean NonDraw;


    public RockScissorsPaper(boolean duel) {
        scan = new Scanner(System.in);
        if(duel != true) {
            System.out.println("오류 입니다 true를 넣어주세요");
        }
        this.NonDraw = true;

        System.out.printf("듀얼모드 on.\n");
    }

    public void playGame() {

        do {
            computerNum = (int) (Math.random() * 3) + 1;

            System.out.print(
                    "가위는 1, 바위는 2, 보자기는 3, 원하는 값을 입력하세요: ");

            playerNum = scan.nextInt();
            System.out.println("컴퓨터 = " + computerNum);

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

        } while(NonDraw);
    }
}

public class Exercise04 {
    public static void main(String[] args) {
        RockScissorsPaper rsc = new RockScissorsPaper(true);
        rsc.playGame();
    }
}
