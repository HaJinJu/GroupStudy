public class DiceHomework {
    public static void main(String[] args) {
//      주사위를 10번 굴려서 홀수는 더하고 짝수는 뺀다.
//      10번 굴린 이후의 주사위 눈금을 구하도록 프로그래밍 해보자!
//      (주사위 눈금의 총합을 구하면 된다.)
        System.out.println("주사위를 10번 굴려서 홀수는 더하고 짝수는 뺀다.");

        int addSum = 0, subSum = 0;


        for(int i = 0; i < 10; i++) {
            int dice = (int)(Math.random() * 6) + 1;
            System.out.println("주사위 눈금값 = " + dice);

            if (dice % 2 == 1) {
                addSum += dice;
            } else {
                subSum -= dice;
            }
        }
        System.out.println("홀수의 총합 = " + addSum);
        System.out.println("짝수의 총합 = " + subSum);
        System.out.println("10번 굴린 주사위 눈금의 합: " + (addSum + subSum));
    }
}
