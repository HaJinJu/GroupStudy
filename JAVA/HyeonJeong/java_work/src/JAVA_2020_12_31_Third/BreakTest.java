public class BreakTest {
    public static void main(String[] args) {
        final int MAX = 11;
        int i = 1;

        while(i < MAX) {
            System.out.println("i = " + i++);

            if(i == 5) {
                System.out.println("걸렸다!");
                // 반복 내에서 break 하는 순간 반복 자체를 종료함
                break;
            }
        }

        System.out.println("이건 어디서나 동작하는 녀석");
    }
}
