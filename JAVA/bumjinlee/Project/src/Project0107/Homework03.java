package Project0107;
//1 ~ 20 까지의 숫자중 2 의 배수를 출력하도록 매서드를 만들어보자!
class OutPut3 {
    final int Hold = 20;

    public void TwoX() {
        for (int i = 1; i<=Hold; i++) {
            if(i % 2==0) {
                System.out.println("2의 배수 : " + i);
            }
        }
    }
}

public class Homework03 {
    public static void main(String[] args) {
        OutPut3 num = new OutPut3();
        num.TwoX();
    }
}
