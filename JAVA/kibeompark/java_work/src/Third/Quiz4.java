package Third;

import java.util.Random;

public class Quiz4 {
    public static void main(String[] args) {
        // A의 주사위와 B의 주사위를 만들고
        // 주사위를 각자 굴려서
        // 더 높은 숫자가 나온 사람이 이기게 만들어보자!
        Random rand = new Random();

        int i = 0;

        while (i < 100) {
            int diceA = (int) (Math.random() * 6) + 1;
            int diceB = rand.nextInt(6) + 1;

            // System.out.printf
            // System.out.println
            // System.out.print
            // 각각의 차이점은 무엇인가 ?
            // print는 단순히 출력을 수행하여 엔터 입력이 제외된다.
            // println은 출력과 함께 엔터가 입력된다.
            // printf는 특정한 포맷(서식)을 가지고 출력된다.
            // 여기서 %d와 \n은 서식에 해당한다.
            // \n의 경우가 엔터 입력에 해당한다.
            // %d %d %d 형식으로 오게 될 경우
            // 구분자 ',' 를 통해 각각에 값이 대입되는 형식으로 사용됨
            // 주의할 점은 %d의 경우 정수형(int)만 가능하며
            // %f의 경우 실수형(float, double)만 가능하다.

            // printf의 장점 :
            // System.out.printf("A 승리 ! %d vs %d\n", diceA, diceB);
            // System.out.println("A 승리 ! " + diceA + " vs " + diceB);

            if (diceA > diceB) {
                System.out.printf("A 승리 ! %d vs %d\n", diceA, diceB);
            } else if (diceA < diceB) {
                System.out.printf("B 승리 ! %d vs %d\n", diceA, diceB);
            } else {
                System.out.printf("무승부! %d vs %d\n", diceA, diceB);
            }

            i++;
        }
    }
}