package Seventeenth;

import java.util.Random;

public class RandomDice {
    int playerNum;
    int computerNum;
    Random rand = new Random();

    public void diceGame(){
        playerNum = (int) (Math.random()*5)+1;
        computerNum =(int) (Math.random()*5)+1;
        if (playerNum > computerNum){
            System.out.printf("플레이어= %d : 컴퓨터= %d\n 플레이어 승",playerNum,computerNum);
        } else if(playerNum == computerNum){
            System.out.printf("플레이어= %d : 컴퓨터= %d\n 무승부 다시 하세요",playerNum,computerNum);
        } else {
            System.out.printf("플레이어= %d : 컴퓨터= %d\n 컴퓨터 승 ",playerNum,computerNum);
        }
    }
}
