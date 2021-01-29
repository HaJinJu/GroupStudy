public class ContinueTest {
    public static void main(String[] args) {
        final int MAX = 11;
        int i = 1;
        while (i < MAX) {

            i++;
            if (i == 5) {
                System.out.println("걸렷다!");
                continue;
            }
            System.out.println("i = " + (i -1));
        }
        System.out.println("이건 어디서나 등장하는 녀석");
    }
}
