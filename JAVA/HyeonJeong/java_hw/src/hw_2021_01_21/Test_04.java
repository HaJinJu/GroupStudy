package hw_2021_01_21;

import java.util.Scanner;
import java.util.Random;

public class Test_04 {
    private final int ROCK = 1;
    private final int SCISSORS = 2;
    private final int PAPER = 3;

    private boolean isGameRunning;

    Scanner scan;
    private int gamerNum;
    private int computerNum;

    public Test_04() {
        scan = new Scanner(System.in);
        isGameRunning = true;
    }

    public void playRockScissorsPaper() {
        Random random = new Random();

        while(isGameRunning) {
            System.out.print(
                    "바위는 [1] 가위는 [2] 보자기는 [3]\n원하는 값을 입력하세요: ");

            computerNum = random.nextInt(3) + 1;
            gamerNum = scan.nextInt();

            if(gamerNum > 3 || gamerNum < 1) {
                System.out.println("------게임 규칙을 확인하세요!------");
                continue;
            }
            System.out.println("--------------------------");
            System.out.printf("컴퓨터: %d   ||   사용자: %d\n",computerNum ,gamerNum);

            if(computerNum == gamerNum) {
                System.out.println("ㅇ_ㅇ..  한판 더!");
                continue;
            } else if (computerNum == ROCK && gamerNum == SCISSORS) {
                System.out.println("난 주먹, 넌 가위\nㅍ_ㅍ 다음에 다시 도전해라");
                break;
            } else if (computerNum == SCISSORS && gamerNum == PAPER) {
                System.out.println("난 가위, 넌 보자기\nㅍ_ㅍ 다음에 다시 도전해라");
                break;
            } else if (computerNum == PAPER && gamerNum == ROCK) {
                System.out.println("난 보자기, 넌 주먹\nㅍ_ㅍ 다음에 다시 도전해라");
                break;
            } else {
                System.out.println("내가 졌다고?\n=ㅅ= 한판 더 하자!");
            } break;

        }
    }

    public static void main(String[] args) {
        System.out.println(
                "혼자서 컴퓨터와 즐기는 가위, 바위, 보 게임을 만들어보자!\n");

        Test_04 t4 = new Test_04();
        t4.playRockScissorsPaper();
    }
}
