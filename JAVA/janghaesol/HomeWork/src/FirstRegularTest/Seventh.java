package FirstRegularTest;

class diceGame{
    int comD;
    int myD;

    public void diceCondition(){
        comD = (int)(Math.random()*6)+1;
        myD =(int)(Math.random()*6)+1;
    }
    public void playDiceGame(){
        if(comD > myD){
            System.out.println("컴퓨터 :" +comD + "\n나 :" + myD
                    + "\n컴퓨터 : 강해져서 돌아와라 (사용자 '패배')");
        }else if(comD < myD){
            System.out.println("컴퓨터 :" +comD + "\n나 :" + myD
                    + "\n나 : 이제 컴퓨터 정도는 껌이지 (사용자 '승리')");
        }else{
            System.out.println("컴퓨터 :" +comD + "\n나 :" + myD
                    + "\n상대와 비겼습니다");
        }
    }
}

public class Seventh {
    //컴퓨터와 주사위를 굴려서 숫자가 크면 승리하도록 프로그래밍 해보자
    public static void main(String[] args) {
        diceGame dg = new diceGame();

        dg.diceCondition();
        dg.playDiceGame();

    }
}
