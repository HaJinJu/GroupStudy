package hw_2021_01_21;

public class Test_07 {
    private int computerNum;
    private int gamerNum;

    public void setRandomNumber() {
        computerNum = (int)(Math.random() * 6) + 1;
        gamerNum = (int)(Math.random() * 6) + 1;
    }

    public void whoIsWinner() {
        System.out.printf("컴퓨터: %d   ||   사용자: %d\n",computerNum ,gamerNum);
        if(computerNum == gamerNum) {
            System.out.println("ㅇ_ㅇ?.. 무승부라고??");
        } else if(computerNum < gamerNum) {
            System.out.println("=ㅅ=;; 운이 안좋았음! 한판 더 하자!");
        } else {
            System.out.println("ㅎㅅㅎ+ 주사위게임으로 날 이기진 못하지!");
        }
    }

    public static void main(String[] args) {
        System.out.println(
                "컴퓨터와 주사위를 굴려서 숫자가 크면 승리하도록 프로그래밍해보자!\n");

        Test_07 t7 = new Test_07();

        t7.setRandomNumber();
        t7.whoIsWinner();
    }
}
