package SecondToFiveth;

public class Q {
    public static void main(String[] args) {
        int i = 1;

        while(i < 11)  {
            if (i == 7) break;
            System.out.println(i);

            i++;
        }

        i = 1;

        while(i < 11) {
            i++;
            if (i == 9 ) continue;
            System.out.println(i-1);
        }
    }
}
