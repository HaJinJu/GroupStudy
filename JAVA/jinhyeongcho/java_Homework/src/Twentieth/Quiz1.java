package Twentieth;

class DiceNum {
    int[] playerNum;
    int[] comNum;
    int sum;
    int sum2;

    public int[] getPlayerNum() {
        return playerNum;
    }

    public int[] getComNum() {
        return comNum;
    }

    public void playerNum(){

        for(int i =0;i<2;i++) {
        playerNum = new int[2];
        playerNum[i] = (int) (Math.random() * 6) + 1;
        System.out.printf("플레이어 %d회차 수 : %d\n", i, playerNum[i]);
            sum += playerNum[i];
        }

    }

    public void comNum() {
        for(int i =0;i<2;i++){
        comNum = new int[2];
        comNum[i] =(int)(Math.random()*6)+1;
        System.out.printf("컴퓨터 %d회차 수: %d\n",i,comNum[i]);
            sum2 += comNum[i];
        }
    }


    public void printResult(){
        if(sum > sum2){
            System.out.printf("플레이어 수:%d   컴퓨터 수:%d\n",sum,sum2);
            System.out.println("플레이어 승!");
        } else if(sum <sum2 ) {
            System.out.printf("플레이어 수:%d   컴퓨터 수:%d\n",sum,sum2);
            System.out.println("컴퓨터 승!");
        } else {
            System.out.printf("플레이어 수:%d   컴퓨터 수:%d\n",sum,sum2);
            System.out.println(" 무승부!");
        }
    }
}

public class Quiz1 {
    public static void main(String[] args) {
        DiceNum dg = new DiceNum();
        dg.playerNum();
        dg.comNum();
        dg.printResult();
    }
}
