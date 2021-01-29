/*
    < Homework 2 >
1 ~ 10 까지의 숫자를 더한 결과를 출력하도록 매서드를 만들어보자!
*/


class Sum {
    final int STARTNUM = 1;
    final int ENDNUM = 10;
    int sum;

    public void setSum() {
        sum = 0;
    }

    public void numSum() {
        for(int i = STARTNUM; i <= ENDNUM; i++) {
            sum += i;
        }

        System.out.printf("%d ~ %d 까지의 숫자를 더한 결과 = %d", STARTNUM, ENDNUM, sum);
    }
}

public class SeventhHomework2 {
    public static void main(String[] args) {
        Sum s = new Sum();

        s.setSum();
        s.numSum();
    }
}