package FirstTest;

import java.util.Scanner;

class UserInput {
    // 테스트 1번 2번 입니다.

    private Scanner scan;
    private int[] scoreArr;
    private int averageScore;
    private int sumScore;

    public int getAverageScore() {
        return averageScore;
    }

    public UserInput(int studentNum) {
        scan = new Scanner(System.in);

        scoreArr = new int[studentNum];

        sumScore= 0;
        for(int i = 0; i < studentNum; i++) {
            System.out.printf("%d번 학생 점수를 입력해주세요.", i + 1);
            scoreArr[i] = scan.nextInt();

            sumScore += scoreArr[i];
        }

        averageScore = sumScore / studentNum;
    }
}

public class Test1 {
    public static void main(String[] args) {
        UserInput ui = new UserInput(5);

        System.out.println(ui.getAverageScore());
    }
}
