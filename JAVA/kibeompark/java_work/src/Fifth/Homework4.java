package Fifth;

import Third.MathRandom;

public class Homework4 {
    public static void main(String[] args) {
        // 주사위 3개를 굴려서 가장 큰 숫자가 나온 사람이 이기게 만들자 !
        // 사람은 총 3명(A, B, C)가 있다고 가정한다.
        int diceA = (int)(Math.random() * 6) + 1;
        int diceB = (int)(Math.random() * 6) + 1;
        int diceC = (int)(Math.random() * 6) + 1;

        System.out.printf("A = %d, B = %d, C = %d\n", diceA, diceB, diceC);

        if (diceA > diceB) {
            if (diceA > diceC) {
                System.out.println("A 승리 !");
            } else if (diceA < diceC) {
                System.out.println("C 승리 !");
            } else {
                System.out.println("A - C 무승부 !");
            }
        } else if (diceA < diceB) {
            if (diceB > diceC) {
                System.out.println("B 승리 !");
            } else if (diceB < diceC) {
                System.out.println("C 승리 !");
            } else {
                System.out.println("B - C 무승부 !");
            }
        } else {    // A 와 B 가 같다
            if (diceA > diceC) {
                System.out.println("A - B 무승부 !");
            } else if (diceA < diceC) {
                System.out.println("C 승리 !");
            } else {
                System.out.println("A - B - C 무승부 !");
            }
        }
    }
}
