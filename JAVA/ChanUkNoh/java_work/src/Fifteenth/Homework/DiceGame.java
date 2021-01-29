package Fifteenth.Homework;

public class DiceGame implements Game {

    public DiceGame() {
        System.out.println("주사위 게임을 시작합니다.");
    }

    public int rollDice() {
        System.out.println("주사위를 굴립니다.");
        int dice = (int)(Math.random() * 6) + 1;

        System.out.println("내 주사위: " + dice);

        return dice;
    }

    public int game(int my, int your) {

        if (my > your) {
            System.out.println("승리!");
            return 1;
        } else if (my < your) {
            System.out.println("패배!");
            return -1;
        } else {
            System.out.println("무승부!");
            return 0;
        }
    }
}
