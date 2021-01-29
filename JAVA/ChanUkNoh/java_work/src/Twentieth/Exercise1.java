package Twentieth;

class DiceGame {
    int computerDice;
    int myDice;

    public DiceGame() {
        computerDice = (int)(Math.random() * 6) + 1;
        myDice = (int)(Math.random() * 6) + 1;
    }

    public void play() {
        if (myDice > computerDice) {
            System.out.println("승!");
            System.out.printf("결과 - 나: %d 컴퓨터: %d \n", myDice, computerDice);
        } else if (computerDice > myDice) {
            System.out.println("패!");
            System.out.printf("결과 - 나: %d 컴퓨터: %d \n", myDice, computerDice);
        } else {
            System.out.println("무승부!");
            System.out.printf("결과 - 나: %d 컴퓨터: %d \n", myDice, computerDice);
        }
    }
}

public class Exercise1 {
    //1. 주사위 2개를 굴려서 컴퓨터와 대전을 치뤄보자!
    //   눈금이 높은 사람이 이긴다!
    public static void main(String[] args) {
        DiceGame dg = new DiceGame();

        dg.play();
    }
}
