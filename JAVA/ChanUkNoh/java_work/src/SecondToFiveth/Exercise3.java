package SecondToFiveth;

public class Exercise3 {
    public static void main(String[] args) {
        // 주사위 3개를 굴려 가장 큰 숫자가 나온 사람이 이기게 만들

        int diceA = (int) (Math.random() * 6) + 1;
        int diceB = (int) (Math.random() * 6) + 1;
        int diceC = (int) (Math.random() * 6) + 1;

        System.out.printf("A = %d, B = %d, C = %d", diceA, diceB, diceC);

        if (diceA > diceB) {
            if (diceA > diceC) {
                System.out.println("A Win!");
            } else if (diceC > diceA) {
                System.out.println("C Win!");
            } else {
                System.out.println("Draw!");
            }
        }   else if (diceB > diceA) {
            if (diceB > diceA) {
                System.out.println("B Win!");
            } else if (diceC > diceB) {
                System.out.println("C Win!");
            } else {
                System.out.println("Draw!");
            }
        } else {
            if(diceA > diceC) {
                System.out.println("Draw!");
            } else {
                System.out.println("C Win!");
            }
        }
    }
}
