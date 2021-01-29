package Homework.Tenth;

public class DiceGame {
    int playerNum, diceNum;
    int player[][], sumOfDice[], playerArr[];

    public DiceGame(int playerNum, int diceNum) {
        this.playerNum = playerNum;
        this.diceNum = diceNum;

        player = new int[playerNum][diceNum];
        sumOfDice = new int[playerNum];
        playerArr = new int[playerNum];

        for (int i = 0; i < playerNum; i++) {
            for (int j = 0; j < playerNum; j++) {
                sumOfDice[i] = 0;
                playerArr[i] = i + 1;
            }
        }
    }

    public void playGame() {
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d번째 플레이어 획득 점수 : ", playerArr[i]);
            for (int j = 0; j < diceNum; j++) {
                player[i][j] = (int) (Math.random() * 6) + 1;
                System.out.printf("%2d점", player[i][j]);

                if (player[i][j] == 6) {
                    continue;
                }

                sumOfDice[i] += player[i][j];
            }
            System.out.println();
        }
        System.out.println();
    }

    public void insertSort() {
        int i , j, numKey, playerNoKey;

        for (i = 1; i < playerNum; i++) {
            numKey = sumOfDice[i];
            playerNoKey = playerArr[i];

            for (j = i - 1; j >= 0 && sumOfDice[j] > numKey; j--) {
                sumOfDice[j + 1] = sumOfDice[j];
                playerArr[j + 1] = playerArr[j];
            }
            sumOfDice[j + 1] = numKey;
            playerArr[j + 1] = playerNoKey;
        }
    }

    public void printWinner() {
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d번째 플레이어 : %d점\n", playerArr[i], sumOfDice[i]);
        }
        System.out.println();
    }
}
