public class Dice_Homework {
    public static void main(String[] args) {
        int addsum = 0, subsum = 0;
        for (int dice = 1; dice < 11 ;dice++) {

//            System.out.println((int) (Math.random() * 6) + 1);
            int diceres = (int) (Math.random() * 6) + 1;
            if (dice % 2 == 0) {
                subsum -= diceres;
                System.out.println("짝수주사위 =" + diceres);
            }
            if (dice % 2 == 1) {
                addsum += diceres;
                System.out.println("홀수주사위 = " + diceres);
            }
            System.out.println("합차 =" + (addsum + subsum));
        }


    }
}





