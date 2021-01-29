package JAVA_2021_01_26_Twentieth;

class DiceGame {
    int playerDice;
    int computerDice;
    int randomNum;

    int diceNum[];

    public DiceGame(int numOfDice) {
        System.out.println("주사위 게임을 시작합니다!");
        diceNum = new int[numOfDice];
    }

    public int setPlayerDice() {
        int diceSum = 0;
        for(int i = 0; i < diceNum.length; i++) {
            randomNum = (int)(Math.random() * 6) + 1;
            diceNum[i] = randomNum;
            diceSum += diceNum[i];
            System.out.printf("%d번째 눈금: %d\n", i + 1, diceNum[i]);
        }

        playerDice = diceSum;
        System.out.print("플레이어 주사위: " + playerDice + "\t\n");

        return playerDice;
    }

    public int setComputerDice() {
        int diceSum = 0;
        for(int i = 0; i < diceNum.length; i++) {
            randomNum = (int)(Math.random() * 6) + 1;
            diceNum[i] = randomNum;
            diceSum += diceNum[i];
            System.out.printf("%d번째 눈금: %d\n", i + 1, diceNum[i]);
        }

       computerDice = diceSum;
        System.out.println("컴퓨터 주사위: " + computerDice);

        return computerDice;
    }

    public void whoIsWinner(int playerDice, int computerDice) {
        System.out.println("<<<<<<< 게임 결과");
        if(playerDice > computerDice) {
            System.out.println("플레이어 승리!");
        } else if (playerDice < computerDice) {
            System.out.println("컴퓨터 승리!");
        } else {
            System.out.println("무승부!");
        }
    }
}

public class ComprehensiveExercise1 {
    public static void main(String[] args) {
        System.out.println("1. 주사위 2개를 굴려서 컴퓨터와 대전을 치뤄보자!\n" +
                           "   눈금이 높은 사람이 이긴다.\n");
        final int NUMOFDICE = 2;

        JAVA_2021_01_26_Twentieth.DiceGame dg = new JAVA_2021_01_26_Twentieth.DiceGame(NUMOFDICE);

        dg.whoIsWinner(dg.setPlayerDice(),dg.setComputerDice());
    }
}
