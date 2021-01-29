package 정기역략평가01;
class RandomDice {
    private int plyerNum;
    private int comNum;

    boolean draw;

    public RandomDice(boolean draw) {
        if (draw != true) {
            System.out.println("오류 입니다 true를 넣어주세요");
        }
        this.draw = true;

    }

    public void playGame() {
        do {
            plyerNum = (int) (Math.random() * 6) + 1;
            System.out.println("사용자 주사위 눈금: " + plyerNum);
            comNum = (int) (Math.random() * 6) + 1;
            System.out.println("컴퓨터 주사위 눈금: " + comNum);

            if (plyerNum > comNum) {
                System.out.println("사용자 승");
                break;
            } else if (plyerNum < comNum) {
                System.out.println("컴퓨터 승");
                break;
            } else {
                System.out.println("무승부");
            }
        } while (draw);

    }
}


public class Exercise07 {
    public static void main(String[] args) {

        RandomDice rd = new RandomDice(true);
        rd.playGame();

    }

}
