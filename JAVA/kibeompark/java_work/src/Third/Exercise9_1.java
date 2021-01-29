package Third;

public class Exercise9_1 {
    public static void main(String[] args) {
        // 먼저 주사위 눈금을 출력하도록 프로그래밍 해 본다.
        int dice = (int)(Math.random() * 6) + 1;

        System.out.println("주사위 눈금 = " + dice);
    }
}