public class ForExercise9 {
    public static void main(String[] args) {
       int diceSum = 0;
        for (; ;) {
        int dice = (int) (Math.random() * 6) + 1;

        System.out.println("주사위 결과는 = + " + dice);
      diceSum += dice;

            if (dice % 2 == 1) {
                System.out.println("홀수 입니다.");
            } else {


                System.out.println("짝수 입니다.");
                break;





            }System.out.println("결과값 :" + diceSum);
        }

    }
}







