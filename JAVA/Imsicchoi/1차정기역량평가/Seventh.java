package FirstRegularTest;
//7. 컴퓨터와 주사위를 굴려서 숫자가 크면 승리하도록 프로그래밍해보자!
class diceGame{
    int com;
    int myDice;

    public void diceStatus(){
        com = (int)(Math.random()*6)+1;
        myDice = (int)(Math.random()*6)+1;
    }
    public void playDiceGame(){
        if(com > myDice) {
            System.out.println("컴퓨터 : " + com  +"  나의 주사위 " + myDice + " 컴퓨터 승! ");
        }else if (myDice>com) {
            System.out.println("컴퓨터 : " + com +"  나의 주사위 " + myDice + " 나의 승! ");
        }
        else {
            System.out.println("무승부");
        }
    }
}
public class Seventh {
    public static void main(String[] args) {
        diceGame dg = new diceGame();
        dg.diceStatus();
        dg.playDiceGame();
    }
}
