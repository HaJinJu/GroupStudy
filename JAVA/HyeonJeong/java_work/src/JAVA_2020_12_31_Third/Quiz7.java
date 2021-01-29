public class Quiz7 {
    public static void main(String[] args) {
//      1 ~ 10 까지의 숫자중 7을 만나면 종료하도록 출력해보자!
        final int MAX = 11;
        int i = 1;

        while(i < MAX) {
            System.out.println("i = " + i++);

            if(i == 7) {

                break;
            }
        }
    }
}
