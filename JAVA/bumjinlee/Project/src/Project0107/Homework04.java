package Project0107;
//1 ~ 20 까지의 숫자중 2 의 배수이고 3 의 배수인 수를 출력해보자!
class OutPut4 {
    final int Hold = 20;

    public void TwoXANDThreeX() {
        for (int i = 1; i<=Hold; i++) {
            if(i % 2==0 && i % 3==0) {
                System.out.println("2의 배수 & 3의 배수 : " + i);
            }
        }
    }
}

//1 ~ 20 까지의 숫자중 2 의 배수이고 3 의 배수인 수를 출력해보자.
public class Homework04 {
    public static void main(String[] args) {
        OutPut4 num = new OutPut4();
        num.TwoXANDThreeX();
    }
}
