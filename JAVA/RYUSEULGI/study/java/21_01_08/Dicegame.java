// 플레이어 3명, 정팔면체 주사위 
// 홀수 나오면 한번 더
// 한 번 더 홀수 = 0
// 2: 이미 주사위를 얻은 사람의 주사위 값을 3 파괴한다.
// 4: 지정한 사용자의 주사위 값을 0 으로 만든다.
// 6: 모든 플레이어의 주사위 값을 2 파괴한다.
// 8: 자신을 제외한 모든 플레이어의 주사위 값을 3 상승시킨다.

import java.util.Scanner;

public class Dicegame {
    
    int ruleNum;
    int playerNum;
    int numOfDice;
    int [] sumOfDice;
    int [] playerArr;

    Scanner scan;
    boolean octahedronGame;

    public Dicegame(int playerNum, int numOfDice, int ruleNum){
        this.playerNum = playerNum;
        this.numOfDice = numOfDice;
        this.ruleNum = ruleNum;  // 6이 나오면 0으로 만들기

        sumOfDice = new int[playerNum];
        playerArr = new int[playerNum];

        for(int i = 0; i < playerNum; i++){
            sumOfDice[i] = 0;      // 초기화
            playerArr[i] = i + 1;  // 사람은 0에서 시작할 수 없기 때문
        }
    }

    public Dicegame(int playerNum){
        this.playerNum = playerNum;

        sumOfDice = new int[playerNum];
        scan = new Scanner(System.in);
    }

    public void playOctahedron(){
        
        int octahedronDice;
        int cnt = 0;

        for(int i = 0; i < playerNum; i++){
            System.out.printf("%d player\n", i);
            octahedronGame = true;

            while (octahedronGame) {
                octahedronDice = (int) (Math.random() * 8) + 1;
                cnt++;

                // 3번 던지는 것을 방지
                if (cnt == 3) {
                    cnt = 0;
                    break;
                }

                System.out.printf("%d player %d번 주사위 =%d\n", i, cnt, octahedronDice);

                sumOfDice[i] += octahedronDice;

                if ((cnt == 1) && (octahedronDice % 2 == 0)) {   // 첫번째로 던지고 짝수이면
                    octahedronGame = false;    //게임종료
                    cnt = 0;   // 카운트 초기화                   
                } else if ((cnt == 2) && (octahedronDice % 2 == 0)) {   // 두번째로 던지고 짝수일 경우
                    switch (octahedronDice) {
                        case 2:
                            for( int j = i - 1; j >= 0; j--){  // -1을 하는 이유는? 조건이 이 전에 합을 얻은 사람인 것을 생각해보기
                            }
                            break;
                        case 4:
                            System.out.println("주사위합을 0으로 만들 사용자를 입력하세요");
                            int tmp = scan.nextInt();
                            sumOfDice[tmp] = 0;
                            break;
                        case 6:
                            for(int j = i; j >= 0; j--){  // 모든 플레이어의 배열은 0~2 때문에 조건이 0 보다 크거나 같다
                                sumOfDice[j] -= 2;        
                            }
                            break;
                        case 8:
                            for (int j = 0; j <= 2; j++) {
                                
                                if (j == i) { // 본인 제외
                                    continue;
                                }
                                sumOfDice[j] += 3;
                            }
                            break;
                        default:
                            System.out.println("error");
                    }
                }
            }
        }
    }

    public void printSumOfOctahedronDice() {
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d player 주사위합=%d\n", i, sumOfDice[i]);
        }
    }
    
    public void playGame(){
        for(int i =0; i < playerNum; i++){
            for(int j = 0; j < numOfDice; j++){
                int dice = (int)(Math.random() * 6) + 1;

                if(dice == ruleNum){
                    continue;
                }
    
                sumOfDice[i] += dice;
            }
        }
    }
    public void printSumOfDice(){
        for(int i = 0; i < playerNum; i++){
            System.out.printf(
                "%d player 주사위 합 = %d\n", playerArr[i], sumOfDice[i]
            );
        }
    }

    // 삽입정렬 - 개수가 적을 때 처리 속도가 빠름
    public void insetSort(){
        int i;
        int j;
        int numKey;                   // 교체 대상의 백업용
        int playerNoKey;              // 교체 대상의 백업용

        for(i = 1; i < sumOfDice.length; i++){
            numKey = sumOfDice[i];
            playerNoKey = playerArr[i];
            
            // 카드를 순서대로 정렬하기 위함
            // (j != -1) index -1 오류 피하기

            for(j = i - 1; (j != -1) && (numKey < sumOfDice[j]); j--){
                sumOfDice[j + 1] = sumOfDice[j]; // 클 경우 오른쪽으로 밀어내기
                playerArr[j + 1] = playerArr[j]; // player번호도 같이 오른쪽으로 밀어내기
            }

            // for(비교할 대상; 기준)
            sumOfDice[j + 1] = numKey;      // 기준갑ㅅ 저장
            playerArr[j + 1] = playerNoKey; // 기준갑ㅅ 저장
        }
    }

    public void printWinner(){
        System.out.println(playerArr[playerNum - 1] + " player Win!");
    }

}


// My dice 75번째 줄 switch (octahedronDice) case 2에서 for( int j = i - 1; j >= 0; j--) 반복문이 왜 이전의 합을 얻은 사람들인가?
// RockSissosPaper final int을 하면 오류가 생기는데 public static final int으로 하면 오류가 사라진

