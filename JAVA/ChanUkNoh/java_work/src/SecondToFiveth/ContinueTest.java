package SecondToFiveth;

public class ContinueTest {
    public static void main(String[] args) {
        final int MAX = 11;
        int i = 0;

        while(i < MAX) {
            i++;

            if (i == 5) {

                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("어디서나 동작함");
    }
}
