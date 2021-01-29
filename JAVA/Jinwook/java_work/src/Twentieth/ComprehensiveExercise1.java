package Twentieth;

import java.util.Random;

class RandomDice {
    private Random random = new Random();
    private int userNum;
    private int comNum;
    private int userSum;
    private int comSum;

    public RandomDice() {
        this.userNum = random.nextInt(6) + 1;
        this.comNum = random.nextInt(6) + 1;
    }


    public void duelModePlay() {
        boolean duel = false;
        userSum = 0;
        comSum = 0;
        for (int i = 0; i < 2; i++) {
            userSum += userNum;
            comSum += comNum;
        }
        do {
            if (userSum == comSum) {
                System.out.printf("사용자: %d\n", userSum);
                System.out.printf("컴퓨터: %d\n", comSum);
                System.out.println("재경기");
                for (int j = 0; j < 2; j++) {
                    userNum = random.nextInt(6) + 1;
                    comNum = random.nextInt(6) + 1;
                    userSum += userNum;
                    comSum += comNum;
                }
            }else break;
        }while(duel);
    }
    public void printPlay(){
        System.out.printf("사용자: %d\n", userSum);
        System.out.printf("컴퓨터: %d\n", comSum);
        if(userSum > comSum){
            System.out.println("유저 승");
        }else{
            System.out.println("컴퓨터 승");
        }

    }


}
public class ComprehensiveExercise1 {
    // 1. 주사위 2개를 굴려서 컴퓨터와 대전을 치뤄 보자
    //    눈금이 높은 사람이 이긴다
    public static void main(String[] args) {
        RandomDice rd = new RandomDice();
        rd.duelModePlay();
        rd.printPlay();


    }
}
