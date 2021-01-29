package Third;

public class Exercise9_5 {
    public static void main(String[] args) {
        // 내용을 결합하여 9번 문제를 마무리해 보자 !

        int diceSum = 0;

        for(;;) {
            int dice = (int)(Math.random() * 6) + 1;

            System.out.println("주사위 눈금 = " + dice);

            diceSum += dice;

            if(dice % 2 == 0) {
                // diceSum += dice;
                System.out.println("짝수 입니다.");
                break;
            } else {
                // diceSum += dice;
                // Q: 위의 주석 달린 부분 처럼 하면 안 되는 이유 ?
                // A: 안 될 이유는 딱히 없긴 합니다.
                //    효율성 측면에서 두 번 적어야 한다는 차이가 있습니다.
                //    어차피 양쪽에서 다 진행할 작업이라면
                //    한 번만 적어서 보다 효율적으로 처리하는 부분입니다.
                System.out.println("홀수 입니다.");
            }
        }

        System.out.println("최종 결과 = " + diceSum);
    }
}