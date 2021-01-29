package Seventh;

class TwoThree {

    public void setTwoThree() {
        for (int i = 3; i < 34; i++) {
            if ((i % 2 == 0) || (i % 3 ==0)) {
                System.out.println(i);
            }
        }

    }
}

public class HW5 {
    public static void main(String[] args) {
        // 3 ~ 33 까지의 숫자 중 2의 배수 또는 3의 배수인 수를 출력하자
        TwoThree tt = new TwoThree();

        tt.setTwoThree();
    }
}
