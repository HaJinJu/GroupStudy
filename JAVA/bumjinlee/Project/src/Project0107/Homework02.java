package Project0107;

class OutPut2 {
    final int Hold = 10;
    int sum;
    public void PlusNum() {
        for (int i = 1; i<=Hold; i++){
            sum += i;
            System.out.printf("%d, = %d\n", i, sum);
        }
    }
}
public class Homework02{
    public static void main(String[] args) {
        //2) 1 ~ 10 까지의 숫자를 더한 결과를 출력하도록 매서드를 만들어보자!
            OutPut2 num = new OutPut2();
            num.PlusNum();
    }
}