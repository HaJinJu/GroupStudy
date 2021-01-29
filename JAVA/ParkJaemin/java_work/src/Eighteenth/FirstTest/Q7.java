package Eighteenth.FirstTest;

public class Q7 {
    public static void main(String[] args) {

        DiceGame game = new DiceGame();

        game.Rolldice();

        game.checkdicenumber();


    }

}

class DiceGame {
    int coms;
    int user;

    public void Rolldice() {

        System.out.println("[지금부터 주사위 게임을 시작합니다]");

        user = (int) ((Math.random() * 6 + 1));
        coms = (int) ((Math.random() * 6 + 1));

        System.out.println("user의 주사위 숫자는 " + user);
        System.out.println("coms의 주사위 숫자는 " + coms);

    }

    public void checkdicenumber() {

        if (coms < user) {
            System.out.println("user가 승리했습니다.");
        } else if (coms > user) {
            System.out.println("coms가 승리했습니다.");
        } else if (coms == user) {
            System.out.println("무승부 입니다");
        }

        }
    }









