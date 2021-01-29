package SecondToFiveth;

public class WhileTest {
    public static void main(String[] args) {

        int i = 1;

        while(i < 20) {
            System.out.println(i);
            i++;
        }

        i = 2;

        while(i < 20) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
            i++;
        }

        i = 2;
        int j = 0;
        while(i < 20) {

            if(i % 2 == 0) {
                j += i;
            }
            i++;
        }
        System.out.println(j);
    }
}