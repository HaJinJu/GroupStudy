package FirstRegularTest;
//4. 혼자서 컴퓨터와 즐기는 가위, 바위, 보 게임을 만들어보자!
import java.util.Scanner;

class gameRSP{
    int com;
    int player;

    public void gameStart(){
        Scanner scan = new Scanner(System.in);
        System.out.println("가위바위보 게임을 시작합니다. 숫자를 눌러주세요 1:가위 2:바위 3:보");
        player = scan.nextInt();
    }
    public void judgement(){
        com = (int)(Math.random()*3)+1;

        if (com == player) {
            System.out.println("무승부");
        } else if (player - com == -2 || player - com == 1) {
            System.out.println("승리");
        }else if ( player - com == -1 || player - com == 2){
            System.out.println("패배");
        }
    }
    public void resCom(){
        if(com == 1 ) {
            System.out.println("컴퓨터가 가위를 냈습니다");
        }else if (com == 2) {
            System.out.println("컴퓨터가 바위를 냈습니다");
        }else {
            System.out.println("컴퓨터가 보를 냈습니다");
        }
    }
}
public class Fourth {
    public static void main(String[] args) {
        gameRSP rsp = new gameRSP();

        rsp.gameStart();
        rsp.resCom();
        rsp.judgement();

    }
}
