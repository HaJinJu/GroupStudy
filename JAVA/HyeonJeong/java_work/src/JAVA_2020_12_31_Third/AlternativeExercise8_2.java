public class AlternativeExercise8_2 {
    public static void main(String[] args) {
        int addSum = 0, subSum = 0;
        int sum = 0;

        for(int i = 1; i <31; i++) {
            if(i % 2 == 0 || i % 3 == 0) {
                addSum += i;
                System.out.println("더하는 값 = " + i);
            }
        }
    }
}
