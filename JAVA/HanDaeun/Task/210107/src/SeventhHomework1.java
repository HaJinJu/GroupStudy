/*
    < Homework 1 >
1 ~ 10 까지 출력하는 클래스내의 매서드를 만들어보자!
*/


class Print {
    final int STARTNUM = 1;
    final int ENDNUM = 10;

    public void numPrint() {
        for(int i = STARTNUM; i <= ENDNUM; i++) {
            System.out.printf("%d ", i);
        }
    }
}

public class SeventhHomework1 {
    public static void main(String[] args) {
        Print pr = new Print();

        pr.numPrint();
    }
}