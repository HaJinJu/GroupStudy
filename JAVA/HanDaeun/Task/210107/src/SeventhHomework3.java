/*
    < Homework 3 >
1 ~ 20 까지의 숫자중 2 의 배수를 출력하도록 매서드를 만들어보자!
*/


class Find1 {
    final int STARTNUM = 1;
    final int ENDNUM = 20;
    final int TARGETNUM = 2;

    public void numFind() {
        System.out.printf("%d ~ %d 까지의 숫자 중 %d 의 배수 = \n", STARTNUM, ENDNUM, TARGETNUM);

        for(int i = STARTNUM; i <= ENDNUM; i++) {
            if(i % TARGETNUM == 0)
                System.out.printf("%d ", i);
        }
    }
}

public class SeventhHomework3 {
    public static void main(String[] args) {
        Find1 f1 = new Find1();

        f1.numFind();
    }
}