package FirstRegularTest;

import java.util.Scanner;

class playWithCom{
    int comRcp;
    int myRcp;

    public void gameStart(){
        Scanner scan =  new Scanner(System.in);
        System.out.println("게임시작!\n 1 :가위! 2 :바위! 3 :보! :");
        myRcp = scan.nextInt();
    }
    public void checkWhoWin(){
        comRcp = (int)(Math.random()*3)+1;

        if(comRcp == myRcp){
            System.out.println("무승부!");
        }else if(myRcp - comRcp == -2 || myRcp - comRcp == 1 ){
            System.out.println("이겼다!");
        }else if(myRcp - comRcp == -1 || myRcp - comRcp == 2){
            System.out.println("졌다 ㅠ");
        }
        System.out.println(comRcp);
    }
    public void justLetYouKnow(){
        if(comRcp == 1){
            System.out.println("컴퓨터는 가위를 냈다!");
        }else if(comRcp == 2){
            System.out.println("컴퓨터는 바위를 냈다!");
        }else{
            System.out.println("컴퓨터는 보를 냈다");
        }

    }
}

public class Forth {
    public static void main(String[] args) {
       playWithCom rcp = new playWithCom();

       rcp.gameStart();
       rcp.checkWhoWin();
       rcp.justLetYouKnow();

    }
}
