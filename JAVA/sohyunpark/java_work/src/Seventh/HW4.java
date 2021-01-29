package Seventh;

class Six {

    public void setSix() {
        for (int i = 1; i < 21; i++) {
            if ((i % 2 == 0) && (i % 3 ==0)) {
                System.out.println(i);
            }
        }

    }
}

public class HW4 {
    public static void main(String[] args) {
        // 1 ~ 20 까지의 숫자 중 2의 배수이고 3의 배수인 수를 출력해보자
        Six si = new Six();

        si.setSix();
    }
}
