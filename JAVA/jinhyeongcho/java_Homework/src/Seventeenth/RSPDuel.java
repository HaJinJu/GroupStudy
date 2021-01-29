package Seventeenth;

import java.util.Scanner;

public class RSPDuel {
    final int SCISSORS = 1;
    final int ROCK = 2;
    final int Paper =3;
    Scanner scan;
    int computerNum;
    int playerNum;

    public void playGame(){
        scan = new Scanner(System.in);
        computerNum = (int) (Math.random() * 3) + 1;
        System.out.println("가위는 1, 바위는 2, 보자기는3,  원하는 값을 입력하세요");
        playerNum = scan.nextInt();

        if (playerNum == computerNum) {
            System.out.printf("%d :%d 무승부 입니다!\n",playerNum,computerNum);
            }else if(playerNum ==SCISSORS&& computerNum ==Paper ){
            System.out.printf("%d :%d 사용자 승!\n",playerNum,computerNum);
            } else if(playerNum == ROCK && computerNum == SCISSORS){
            System.out.printf("%d :%d 사용자 승!\n",playerNum,computerNum);
            } else if(playerNum == Paper && computerNum == ROCK){
            System.out.printf("%d :%d 사용자 승!\n",playerNum,computerNum);
            } else {
            System.out.printf("%d :%d 컴퓨터 승!\n",playerNum,computerNum);
        }

    }

}
