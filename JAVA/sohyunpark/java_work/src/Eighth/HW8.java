package Eighth;

import java.util.Scanner;

class playRockGame2 {
    Scanner scan;
    int num, com;

    public void setScan() {
        scan = new Scanner(System.in);
    }

    public void setGame() {
        System.out.println("가위바위보를 합시다! (1 : 가위  2 : 바위  3 : 보)");
        for (int i = 0; ; ) {
            System.out.print("당신의 선택 : ");
            num = scan.nextInt();
            com = (int) (Math.random() * 2) + 1;

            if (num <= 0) {
                System.out.println("잘못된 입력입니다.");
                return;
            }

            String user = null;
            String computer = null;

            if (num <= 0) {
                return;
            } else {

                switch (num) {
                    case 1:
                        user = "가위";
                        break;
                    case 2:
                        user = "바위";
                        break;
                    case 3:
                        user = "보";
                        break;
                }

                switch (com) {
                    case 1:
                        computer = "가위";
                        break;
                    case 2:
                        computer = "바위";
                        break;
                    case 3:
                        computer = " 보";
                        break;
                }
                System.out.printf("당신 : %s, 컴퓨터 : %s\n", user, computer);


                if (num == com) {
                    continue;
                } else if ((num == 1) && (com == 3) || (num == 2) && (com == 1) ||
                        (num == 3) && (com == 2)) {
                    System.out.println("당신 승리!");
                    break;
                } else if ((num == 1) && (com == 2) || (num == 2) && (com == 3) ||
                        (num == 3) && (com == 1)) {
                    System.out.println("패배");
                    break;
                } else {
                    System.out.println("잘못된 입력");
                    break;
                }


            }
        }
    }
}



public class HW8 {
    public static void main(String[] args) {
        // 컴퓨터와 가위바위보 게임을 한다.(승부가 날 때까지 게속)
        playRockGame2 pg = new playRockGame2();

        pg.setScan();
        pg.setGame();

    }
}
