package Ninth;

public class Homework4 {
    public static void main(String[] args) {
        MyDice md = new MyDice(5, 3, 6);

        md.playGame();
        md.printSumOfDice();

        System.out.printf("\n정렬 후 !\n\n");

        md.insertSort();
        md.printSumOfDice();
    }
}

/*
package Homework.Eighth;

class DiceGame {
    int playerNum, max, maxIndex;
    int player[];

    public DiceGame(int playerNum, int dice) {
        this.playerNum = playerNum;
        player = new int[playerNum];

        for (int i = 0; i < playerNum; i++) {
            for (int j = 0; j < dice; j++) {
                int randNum = (int) (Math.random() * 6) + 1;

                if (randNum == 6) {
                    continue;
                }

                player[i] += randNum;
            }
            System.out.printf("%3d", player[i]);
        }
    }

    public void findMax() {
        maxIndex = 0;

        for (int i = 0; i < playerNum; i++) {
            if (player[maxIndex] <= player[i]) {
                maxIndex = i;
                max = player[i];
            }
        }
    }

    public void printWinner() {
        System.out.printf("\n합산 결과 %d점으로 ", max);
        for (int i = 0; i < maxIndex; i++) {
            if (player[i] == max) {
                System.out.printf("%d, ", i + 1);
            }
        }
        System.out.printf("%d번째 플레이어 승리 !\n", maxIndex + 1);
    }
}

public class Homework4 {
    public static void main(String[] args) {
        // 4) 주사위 게임을 한다.
        //    5명의 플레이어가 있다.
        //    이들은 모두 3개의 주사위를 가지고 있다.
        //    3개의 주사위를 굴려서 합산 결과가 가장 큰 사람이 이긴다.
        //    (숫자 6은 0 으로 무효화 된다)
        //    프로그램으로 이를 만들어 보자 !
        DiceGame dg = new DiceGame(5, 3);

        dg.findMax();
        dg.printWinner();
    }
}
 */