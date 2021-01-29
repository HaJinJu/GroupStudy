// 주사위 게임을 한다.
// 5명의 플레이어가 있다.
// 이들은 모두 3개의 주사위를 가지고 있다.
// 3개의 주사위를 굴려서 합산 결과가 가장 큰 사람이 이긴다.
// (숫자 6은 0 으로 무효화 된다)
// 프로그램으로 이를 만들어보자!

class Dice{

    int playerNum;
    int dice1;
    int[] player;
    int diceNum;

    public Dice(int playerNum, int dice1){
        this.playerNum = playerNum;
        this.dice1 = dice1;

        player = new int [playerNum];

        for(int i = 0; i < playerNum; i++){
            for (int j = 0; j < dice1; j++){   
            
                diceNum = (int)(Math.random() * 6 ) + 1;

                if ( diceNum == 6){
                    diceNum = 0;
                }

                System.out.printf("player[%d] = %d\n", i, diceNum);

                player[i] += diceNum;
            }
            System.out.println("주사위 합" + player[i]); 
        }     
    }

    // 최대갑ㅅ 찾기
    public void setWinner(){
        int max = player[0];

        for(int i = 0; i < player.length; i++){
            if (max < player[i]){
                max = player[i];
            }
        }
        System.out.println(max);
    }

}

public class Q4 {
    public static void main(String[] args) {
            
        Dice dc = new Dice(5, 3);
        dc.setWinner();

        // Dicegame method 사용
        Dicegame dicegame = new Dicegame(5, 3, 6);

        dicegame.playGame();
        dicegame.printSumOfDice();

        System.out.println("\nFILTER\n");

        dicegame.insetSort();
        dicegame.printSumOfDice();
        dicegame.printWinner();
    }
}