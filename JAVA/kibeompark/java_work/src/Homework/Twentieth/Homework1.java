package Homework.Twentieth;

import java.util.Arrays;
import java.util.Random;

class DiceGame {
    private int[] playerNum, computerNum;
    private int dice, sumOfPlayer, sumOfComputer;
    private Random rand = new Random();

    public DiceGame(int dice) {
        this.dice = dice;

        System.out.println("주사위 게임을 시작합니다.");

        playerNum = new int[dice];
        computerNum = new int[dice];
        sumOfPlayer = 0;
        sumOfComputer = 0;
    }

    public void playGame() {
        for (int i = 0; i < dice; i++) {
            playerNum[i] = rand.nextInt(6) + 1;
            sumOfPlayer += playerNum[i];

            computerNum[i] = rand.nextInt(6) + 1;
            sumOfComputer += computerNum[i];
        }
    }

    public void printWinner() {
        while (true) {
            System.out.printf("사용자 : %d %s VS 컴퓨터 : %d %s\n",
                    sumOfPlayer, Arrays.toString(playerNum),
                    sumOfComputer, Arrays.toString(computerNum));

            if (sumOfPlayer > sumOfComputer) {
                System.out.println("사용자 승 !");

                break;
            } else if (sumOfPlayer < sumOfComputer) {
                System.out.println("컴퓨터 승 !");

                break;
            } else {
                System.out.println("무승부 !");
                System.out.println("승패 결정을 위해 다시 시작합니다.\n");

                playGame();
            }
        }
    }
}
public class Homework1 {
    static final int DICE = 2;

    public static void main(String[] args) {
        // 1. 주사위 2개를 굴려서 컴퓨터와 대전을 치뤄 보자 !
        //    눈금이 높은 사람이 이긴다 !
        DiceGame dg = new DiceGame(DICE);

        dg.playGame();
        dg.printWinner();
    }
}
