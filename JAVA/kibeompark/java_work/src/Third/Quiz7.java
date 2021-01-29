package Third;

public class Quiz7 {
    public static void main(String[] args) {
        // 1 ~ 10 까지의 숫자 중 7을 만나면 종료하도록 출력해 보자 !
        final int TARGET = 11;
        int i = 1;

        while (i < TARGET) {
            if (i == 7) {
                break;
            }
            System.out.println("i = " + i);

            i++;
        }
    }
}