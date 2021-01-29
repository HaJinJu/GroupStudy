public class BreakTest {
    public static void main(String[] args) {
        final int MAX = 10;
        int i = 1;
        while (i < MAX) {
            System.out.println("i = " + i++);
            if (i < MAX) {
//
                if (i == 5) {
                    System.out.println("걸렷다");
                    break;

                }

            }
        }
        System.out.println("이건 어디서나 동작하는 녀석");
    }
}


