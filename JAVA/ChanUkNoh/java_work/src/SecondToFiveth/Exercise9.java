package SecondToFiveth;

public class Exercise9 {
    public static void main(String[] args) {
        int dice = (int)((Math.random()) * 6) + 1;
        int sum = 0;
        sum += dice;
        System.out.println("first-roll: " + dice + ", sum: " + sum);

        if(dice % 2 == 1) {

            for(;;) {
                dice = (int)(Math.random() * 6) + 1;
                sum += dice;
                System.out.println("re-roll: " + dice + ", sum: " + sum);
                if(dice % 2 == 0) break;
            }
        }
    }
}
