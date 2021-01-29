package SecondToFiveth;

public class Exercise7 {
    public static void main(String[] args) {
        int i;

        for(i = 2; i < 11; i += 2) {
            System.out.println("i = " + i);
        }

        for(i = 0; i < 11; i++) {
            if(i % 2 == 0) {
                System.out.println(("i = " + i));
            }
        }
    }
}
