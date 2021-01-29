package Third;

public class Exercise9_2 {
    public static void main(String[] args) {
        // 주사위 눈금이 홀수인지 판정해 본다.
        int dice = (int)(Math.random() * 6) + 1;

        System.out.println("주사위 눈금 = " + dice);

        if (dice % 2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }
}