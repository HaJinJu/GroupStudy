package Seventh;

class Two {

    public void setTwo() {
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}

    public class HW3 {
        public static void main(String[] args) {
            // 1 ~ 10 까지의 숫자 중 2의 배수 출력하는 메소드 만들어보자
            Two tw = new Two();

            tw.setTwo();
        }
}

