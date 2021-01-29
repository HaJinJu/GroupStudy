package Project0107;

class OutPut1 {
    final int Hold = 10;

    public void Num() {
        for (int i = 1; i<=Hold; i++){
            System.out.println("1부터 10까지 출력 = " + i);
        }
    }
}
public class Homework01{
    //1) 1 ~ 10 까지 출력하는 클래스내의 매서드를 만들어보자!
    public static void main(String[] args) {
        OutPut1 num = new OutPut1();
        num.Num();
    }
}