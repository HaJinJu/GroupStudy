package Eighth;

class DiceGame {
    final int DICENUM = 3;
    int[] player1 = new int[DICENUM];
    int[] player2 = new int[DICENUM];
    int[] player3 = new int[DICENUM];
    int[] player4 = new int[DICENUM];
    int[] player5 = new int[DICENUM];
    int i;
    int player1Sum = 0;
    int player2Sum = 0;
    int player3Sum = 0;
    int player4Sum = 0;
    int player5Sum = 0;

    public void roll() {

        for (i = 0; i < DICENUM; i++) {
            player1[i] = (int)(Math.random() * 6);
            System.out.println("player1의 주사위: " + player1[i]);
            player2[i] = (int)(Math.random() * 6);
            System.out.println("player2의 주사위: " + player2[i]);
            player3[i] = (int)(Math.random() * 6);
            System.out.println("player3의 주사위: " + player3[i]);
            player4[i] = (int)(Math.random() * 6);
            System.out.println("player4의 주사위: " + player4[i]);
            player5[i] = (int)(Math.random() * 6);
            System.out.println("player5의 주사위: " + player5[i]);
        }
    }

    public void sumDice() {

        for (i = 0; i < DICENUM; i++) {
            player1Sum += player1[i];
            player2Sum += player2[i];
            player3Sum += player3[i];
            player4Sum += player4[i];
            player5Sum += player5[i];
        }
        System.out.println("player1의 총 합: " + player1Sum);
        System.out.println("player2의 총 합: " + player2Sum);
        System.out.println("player3의 총 합: " + player3Sum);
        System.out.println("player4의 총 합: " + player4Sum);
        System.out.println("player5의 총 합: " + player5Sum);
    }

    public void compare() {
        if (player1Sum > player2Sum) {
            if (player1Sum > player3Sum) {
                if (player1Sum > player4Sum) {
                    if (player1Sum > player5Sum) {
                        System.out.println("player1 Win");
                    }
                }
            }
        } else if (player2Sum > player3Sum) {
            if (player2Sum > player4Sum) {
                if (player2Sum > player5Sum) {
                    System.out.println("player2 Win");
                }
            }
        }
    }
}

public class Homework4 {
    public static void main(String[] args) {
        // 4) 주사위 게임을 한다. 5명의 플레이어가 있다.
        //    이들은 모두 3개의 주사위를 가지고 있다.
        //    3개의 주사위를 굴려서 합산 결과가 가장 큰 사람이 이긴다.
        //    (숫자 6은 0으로 무효화 된다) 프로그램으로 이를 만들어보자!

        DiceGame dg = new DiceGame();

        dg.roll();
        dg.sumDice();
    }
}
