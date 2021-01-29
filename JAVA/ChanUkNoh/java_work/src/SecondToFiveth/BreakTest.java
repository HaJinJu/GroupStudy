package SecondToFiveth;

public class BreakTest {
    public static void main(String[] args) {
        final int MAX = 11;
        int i = 0;

        while(i < MAX) {
            System.out.println("i = " + i);
            i++;

            if (i == 5) break;


            
        }
        System.out.println("어디서나 동작함");
    }
}
