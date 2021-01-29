package Eighth.Homework;
//주사위 게임을 한다.
//   5명의 플레이어가 있다.----array
//   이들은 모두 3개의 주사위를 가지고 있다. ---- random*3
//   3개의 주사위를 굴려서 합산 결과가 가장 큰 사람이 이긴다.-----if
//   (숫자 6은 0 으로 무효화 된다)------switch
//   프로그램으로 이를 만들어보자!
class DicePlayer {
    int[] player;
    int diceONE;
    int diceTwo;
    int diceThree;
    int diceSum;


    public DicePlayer(int playerNum) {

        player = new int[playerNum];

        for (int i = 1; i <= playerNum; i++) {


            System.out.print(i + " Player :");
            diceONE = ((int) (Math.random() * 6) + 1);
            if (diceONE == 6) {
                System.out.println(0);
            }
            diceTwo = ((int) (Math.random() * 6) + 1);
            if (diceONE == 6) {
                System.out.println(0);
            }
            diceThree = ((int) (Math.random() * 6) + 1);
            if (diceONE == 6) {
                System.out.println(0);
            }
            System.out.printf("%3d,%3d,%3d\n", diceONE, diceTwo, diceThree);

        }

    }

    public void setDiceSum() {
        diceSum = 0;
        for (int i = 1; i <= player.length; i++) {

            if (diceONE == 6) {
                diceSum -= 6;
            }
            if (diceTwo == 6) {
                diceSum -= 6;
            }
            if (diceThree == 6) {
                diceSum -= 6;
            }
//            diceSum[i] = diceONE + diceTwo + diceThree;
//            System.out.println("sum = " + diceSum);
        }

    }
}
public class Homework04 {
    public static void main(String[] args) {
        DicePlayer dp = new DicePlayer(5);
        dp.setDiceSum();

    }
}
