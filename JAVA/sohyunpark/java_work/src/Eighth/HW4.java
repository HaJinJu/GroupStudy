package Eighth;

class ThreeDice {
    int a[][] = new int[5][3];
    int sum = 0, max = 0;

    public void diceres() {
        for (int x = 0; x < 5; x++) {
            for (int i = 0; i < 3; i++) {
                a[x][i] = (int) (Math.random() * 5) + 1;
                System.out.printf("%3d", a[x][i]);
                sum += a[x][i];
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.printf("\n플레이어 %d 점수 합 : %d\n", x + 1, sum);
            sum = 0;
        }
        }
    public void printMax() {
        System.out.println("가장 큰 값 : " + max);
        // System.out.printf("우승 : 플레이어 %d", );
    }
}

public class HW4 {
    public static void main(String[] args) {
        // 5명이 3개의 주사위로 게임을 한다.
        // 3개의 주사위를 굴려 합산 결과가 가장 큰 사람이 이긴다. (숫자 6은 0으로 무효화)
        ThreeDice td = new ThreeDice();

        td.diceres();
        td.printMax();
    }
}
