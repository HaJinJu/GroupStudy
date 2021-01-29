package Test01;

import java.util.Scanner;

class Rpp {
    private int randomNum, userNum;
    private Scanner scan;

    public Rpp() {
        randomNum = (int) (Math.random() * 3) + 1;
        scan = new Scanner(System.in);
    }

    public void setGame() {
        System.out.println("가위바위보를 합시다! (가위 : 1 바위 : 2 보 : 3)");
        System.out.printf("원하는 값을 입력해주세요 : ");
        userNum = scan.nextInt();

        switch (userNum) {
            case 1:
                System.out.println("사용자 : 가위");
                break;
            case 2:
                System.out.println("사용자 : 바위");
                break;
            case 3:
                System.out.println("사용자 : 보");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }

        if (randomNum == 1) {
            System.out.println("컴퓨터 : 가위");
        } else if (randomNum == 2) {
            System.out.println("컴퓨터 : 바위");
        } else {
            System.out.println("컴퓨터 : 보");
        }
    }

    public void playGame() {
        if((userNum < 1) || (userNum > 3)) {
            System.out.println("오류!");
        } else if (userNum == randomNum) {
            System.out.println("무승부입니다.");
        } else if ((userNum == 1 && randomNum == 3) || (userNum == 2 && randomNum == 1) ||
                (userNum == 3 && randomNum == 2)) {
            System.out.println("사용자 승!");
        } else {
            System.out.println("컴퓨터 승!");
        }
    }
}

public class Test01_04 {
    public static void main(String[] args) {
        // 혼자서 컴퓨터와 즐기는 가위, 바위, 보 게임을 만들어보자
        Rpp rp = new Rpp();

        rp.setGame();
        rp.playGame();
    }
}
