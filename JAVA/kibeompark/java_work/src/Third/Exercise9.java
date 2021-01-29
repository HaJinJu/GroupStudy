package Third;

public class Exercise9 {
    public static void main(String[] args) {
        // 주사위 게임을 해 보자 !
        // 이 주사위 게임의 규칙은 다음과 같다.
        // 홀수가 나오면 주사위를 계속해서 굴릴 수 있고
        // 마지막에 짝수가 나오면 주사위를 멈춘다.
        // 이 때 마지막 주사위 눈금을 구하도록 프로그래밍 해 보자 !
        // (마지막 눈금은 모든 주사위 눈금의 합산값이다)

        int sum = 0;

        for (;;) {
            int dice = (int)(Math.random() * 6) + 1;

            System.out.println("주사위 눈금 = " + dice);

            sum += dice;

            if (dice % 2 == 0) {
                System.out.println("짝수 입니다.");
                System.out.println("마지막 눈금 = " + sum);
                break;
            } else {
                System.out.println("홀수 입니다.");
            }
        }
    }
}