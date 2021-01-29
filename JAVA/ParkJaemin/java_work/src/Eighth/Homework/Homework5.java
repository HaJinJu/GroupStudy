package Eighth.Homework;

import java.util.Scanner;

class rockpaperscissors {
    int user;
    int coms;

    public rockpaperscissors(int coms) {
        this.user = user;
        this.coms = coms;

        Scanner sc = new Scanner(System.in);
        System.out.println("[가위,바위,보]");
        System.out.println("숫자를 입력하세요");

        user = sc.nextInt();
        int comes = (int) (Math.random() * 3) + 1;

        String users;
        switch (user) {
            case 1:
                users = "가위!";
                break;
            case 2:
                users = "바위!";
                break;
            case 3:
                users = "보!";
                break;
        }
        String com;
        switch (coms) {
            case 1:
                com = "가위!";
                break;
            case 2:
                com = "바위!";
                break;
            case 3:
                com = "보!";
                break;
        }
        System.out.println("가위 바위 보");
        System.out.printf("[나 : %s] vs [컴퓨터 : %s]\n", user, coms);

        if ((coms == 1 && user == 1) || (coms == 2 && user == 2) || (coms == 3 && user == 3)) {
            System.out.println("무승부");
        } else if ((coms == 1 && user == 2) || (coms == 2 && user == 3) || (coms == 3 && user == 1)) {
            System.out.println("승리");
        } else if ((coms == 1 && user == 3) || (coms == 2 && user == 1) || (coms == 3 && user == 2)) {
            System.out.println("패배");
        }

    }
}


public class Homework5 {
    public static void main(String[] args) {
//5) 컴퓨터와 가위 바위 보 게임을 할 수 있도록 프로그램을 만들어보자!
//   (무승부로 끝날 수도 있다)
//8) 앞선 5 번 문제를 승부가 날 때까지 멈추지 않는 형태로 만들어보자!
        rockpaperscissors D = new rockpaperscissors((int) (Math.random() * 3) + 1);

    }
}
