import java.util.Scanner;

public class RockSissosPaper {

    public static final int ROCK = 1;
    public static final int SISSORS = 2;
    public static final int PAPER = 3;

    Scanner scan;
    int comNum;
    int playerNum;

    boolean duel;

    // 결투모드인 경우
    public RockSissosPaper(boolean duel) {
        scan = new Scanner(System.in);

        if (duel != true) {
            System.out.println("true 설정 필요");
        }
        this.duel = true;
    }

    // 결투모드가 아닌 경우
    public RockSissosPaper() {
        scan = new Scanner(System.in);
        duel = false;
    }

    public void playGame() {
        do {
            comNum = (int) (Math.random() * 3) + 1;

            System.out.printf("가위 바위 보!\n" + "가위 1, 바위2, 보3 선택");
            playerNum = scan.nextInt();

            if (playerNum == comNum) {
                System.out.println("draw");
            } else if (playerNum == SISSORS && comNum == PAPER) {
                System.out.println("win");
                break;
            } else if (playerNum == PAPER && comNum == ROCK) {
                System.out.println("win");
                break;
            } else if (playerNum == ROCK && comNum == SISSORS) {
                System.out.println("win");
                break;
            } else {
                System.out.println("lose");
                break;
            }

            System.out.println("computer =" + comNum);
            System.out.println("ueer =" + playerNum);
        } while (duel); // 무조건 한 번 do를 실행하고 duel 조건을 검사

        // do while반복문
    }
}
