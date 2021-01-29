public class quiz7 {
    public static void main(String[] args) {
//        1~ 10 까지의 숫자중 7을 만나면 종료하도록 추력해보자!
        final int MAX = 10;
        int i = 1;

        while (i < MAX) {
            if (i == 7) {
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
    }
}

