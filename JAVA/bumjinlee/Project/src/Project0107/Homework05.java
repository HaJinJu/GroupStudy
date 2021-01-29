package Project0107;
//5) 3 ~ 33 까지의 숫자중 2 의 배수 또는 3 의 배수인 수를 출력해보자!

class OutPut5 {
    final int Hold = 33;

    public void TwoXORThreeX() {
        for (int i = 3; i<=Hold; i++) {
            if(i % 2==0 || i % 3==0) {
                System.out.println("2의 배수 OR 3의 배수 : " + i);
            }
        }
    }
}
public class Homework05 {
    public static void main(String[] args) {
        OutPut5 num = new OutPut5();
        num.TwoXORThreeX();
    }
}
