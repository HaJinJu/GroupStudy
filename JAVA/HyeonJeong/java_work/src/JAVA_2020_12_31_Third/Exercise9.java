public class Exercise9 {
    public static void main(String[] args) {
//      주사위 게임을 해보자!
//      이 주사위 게임의 규칙은 다음과 같다.
//      홀수가 나오면 주사위를 계속해서 굴릴 수 있고
//      마지막에 짝수가 나오면 주사위를 멈춘다.
//      이때 마지막 주사위 눈금을 구하도록 프로그래밍 해보자
//      (마지막 눈금은 모든 주사위 눈금의 합산값이다.)

        int dice = (int)(Math.random() * 6) + 1;
        int trial = 1;
        int diceSum = 0;

        for(;;){ //무한 루프에서 주사위가 굴러가도록 만든다.
            dice = (int)(Math.random() * 6) + 1;
            System.out.println("주사위 눈금 = " + dice); //          주사위 눈금 출력

            trial++;
            diceSum += dice;
//          diceSum += dice;
//          효율적인 측면에서 if문 양쪽에 두번 적기 보다 한번만 적어서
//          보다 효육적으로 처리하는 부분이다.

            if(dice % 2 == 1){ //주사위 눈금이 홀수인지 판정
                System.out.println("홀수입니다.");
            }else{
                System.out.println("짝수입니다.");
                break; // 특정 조건에서 반복이 멈추도록 만들어보자
            }
        }
        System.out.println("주사위 눈금의 합 = " + diceSum);
        System.out.println("주사위 던진 횟수 = " + trial);
    }
}
