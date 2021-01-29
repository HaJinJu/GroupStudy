package Second;

import java.util.Scanner;

public class IfBasedRangeProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("점수를 입력하세요 : ");
        int num = scan.nextInt();

        System.out.println("입력한 점수는 " + num);
        // 90 ~ 100 : A, 89 ~ 89 : B, 70 ~ 79 : C, 60 ~ 69 : D, 나머지 F

        // 주의점 : if-else if 사용 시 히든 조건을 매우 조심해야 한다.
        //         잘못 작성할 경우 프로그램 논리가 통째로 잘못될 가능성이 있고
        //         디버깅을 통해 오류를 잡는 것이 오래 걸릴 가능성이 높아진다.

        // 팁 : 가장 범주가 큰 녀석을 위로 올리고
        //      그것보다 작은 범주의 크기들을 서서히 단계단계 내리며 작성한다.
        if (num > 100) { // num이 100 보다 크다면
            System.out.println("잘못된 입력입니다.");
        } else if (num >= 90) { // num이 90 이상이라면 && 100 보다 작거나 같다면
            System.out.println("당신의 등급은 A입니다.");
        } else if (num >= 80) { // num이 80 이상이라면 && 90 보다 작다면
            System.out.println("당신의 등급은 B입니다.");
        } else if (num >= 70) { // num이 70 이상이라면 && 80 보다 작다면
            System.out.println("당신의 등급은 C입니다.");
        } else if (num >= 60) { // num이 60 이상이라면 && 70 보다 작다면
            System.out.println("당신의 등급은 D입니다.");
        } else if (num >= 0) { // num이 0 이상이라면 && 60 보다 작다면
            System.out.println("빵야 빵야 F");
        } else { // 0 보다 작다면면
            System.out.println("잘못된 입력입니다.");
        }
    }
}