package SecondToFiveth;

public class Exercise8 {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for(i = 1; i <= 30; i++) {

            if(i % 2 == 0 || i % 3 == 0) {
                sum += i;
            }
            if(i % 5 == 0) {
                sum -= i;
            }
            System.out.println("현재 iterate: " + i + ", 현재 sum: " + sum);
        }
        System.out.println(sum);
    }
}