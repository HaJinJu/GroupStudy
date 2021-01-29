package Ninth;

import java.util.Scanner;

public class RockScissorsPaper {
    final int SCISSORS = 1;
    final int ROCK = 2;
    final int Paper =3;
    Scanner scan;
    int computerNum;
    int playerNum;

    boolean duel;

    RockScissorsPaper(boolean duel){
        scan = new Scanner(System.in);
        this.duel = true;
        System.out.printf("연습 대련입니다. \n" + "가위는 1, 바위는 2, 보자기는3,  원하는 값을 입력하세요");
    }

    RockScissorsPaper(){
        scan = new Scanner(System.in);
        this.duel = duel;

    }

    public void playGame(){
        // String computerStr, playStr;
        do {
            computerNum = (int) (Math.random() * 3) + 1;
            System.out.printf("결투 모드입니다. \n" + "가위는 1, 바위는 2, 보자기는3,  원하는 값을 입력하세요");
            playerNum = scan.nextInt();

            // 가독성이 좋은 코드
            if (playerNum == computerNum) {
                System.out.println("무승부입니다.");
            }else if(playerNum ==SCISSORS&& computerNum ==Paper ){
                System.out.println("사용자 승!");
            } else if(playerNum == ROCK && computerNum == SCISSORS){
                System.out.println("사용자 승!");
            } else if(playerNum == Paper && computerNum == ROCK){
                System.out.println("사용자 승!");
            } else {
                System.out.println("컴퓨터 승!");
            }

            int tmpNum1 = playerNum -1;
            int tmpNum2 = playerNum +1;

            if (tmpNum1<0){
                tmpNum1 = 3;
            }

            if(tmpNum2 >3){
                tmpNum2 =1;
            }

            // 가독성이 안좋은 코드
            if (tmpNum1 ==computerNum){
                System.out.println("사용자 승!");
                break;
            } else if(tmpNum2 ==computerNum) {
                System.out.println("컴퓨터 승!");
                break;
            } else {
                System.out.println("무승부");
            }

            System.out.println("컴퓨터 ="+ computerNum);
            System.out.println("사용자 ="+ playerNum);
        } while (duel);
    }
}
