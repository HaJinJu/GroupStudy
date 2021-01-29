package Homework.Tenth;

public class Homework5_1 {
    public static void main(String[] args) {
        DiceGame dg = new DiceGame(5, 3);

        dg.playGame();
        dg.printWinner();

        System.out.println("오름차순 정렬");

        dg.insertSort();
        dg.printWinner();
        System.out.printf("우승자는 %d번째 플레이어", dg.playerArr[dg.playerNum - 1]);
    }
}
