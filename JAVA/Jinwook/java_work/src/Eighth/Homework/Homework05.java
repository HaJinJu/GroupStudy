package Eighth.Homework;

import java.util.Scanner;

//컴퓨터와 가위 바위 보 게임을 할 수 있도록 프로그램을 만들어보자!
//   (무승부로 끝날 수도 있다)
class RSPGame {
//    Scanner player;

    String rock = "주먹";
    String scissors = "가위";
    String paper = "보";
    int com;
    int player;
    final int NONDRAW =1;
    final int DRAW = 2;



    public void playerWant() {
//        Scanner scan = new Scanner(System.in);
//        player = scan.nextLine();
//        System.out.println();
//        if (player == "가위") {
//            System.out.println(scissors);
//                }
//        if (player == "주먹") {
//            System.out.println(rock);
//            }
//        if (player == "보") {
//            System.out.println(paper);
//        }
//    }

        player = (int) (Math.random() * 2);
        if (player == 0) {
            System.out.println(rock);
        } else if (player == 1) {
            System.out.println(scissors);
        } else {
            System.out.println(paper);
        }
    }



    public void comWant() {
        com = (int) (Math.random() * 2);
        if (com == 0) {
            System.out.println(rock);
        }
        else if (com == 1) {
            System.out.println(scissors);
        }
        else {
            System.out.println(paper);
        }
    }
    public void result (){
        if(com == player){
            System.out.println("비겼습니다.");

        }
        else if(com > player){
            System.out.println("컴퓨터 승");

        }
        else {
            System.out.println("플레이어 승");
        }

    }
    boolean finish = false;
    public void draw (final int CHECK) {
        for (int i = 0; ; ) {

            if (finish) {
                break;
            }
            switch (CHECK) {

                case DRAW:
                    if (com == player) {
                        finish = false;
                        player = (int) (Math.random() * 2);
                        com = (int) (Math.random() * 2);
                        System.out.println("----------재 경 기--------");
                        if (player == 0) {
                            System.out.println(rock);
                        } else if (player == 1) {
                            System.out.println(scissors);
                        } else {
                            System.out.println(paper);
                        }
                        if (com == 0) {
                            System.out.println(rock);
                        } else if (com == 1) {
                            System.out.println(scissors);
                        } else {
                            System.out.println(paper);
                        }

                        if (com == player) {
                            System.out.println("비겼습니다.");

                        } else if (com > player) {
                            System.out.println("컴퓨터 승");

                        } else {
                            System.out.println("플레이어 승");
                        }
                        continue;
                    }
                case NONDRAW:
                    if((com > player || com < player)){
                        finish = true;
                        System.out.println("----------경 기 끝--------");

                        break;
                    }
                default:
                    System.out.println("wrong"); break;
            }
        }
    }

}
public class Homework05 {
    public static void main(String[] args) {
        RSPGame rg = new RSPGame();
        rg.playerWant();
        rg.comWant();
        rg.result();




    }
}
