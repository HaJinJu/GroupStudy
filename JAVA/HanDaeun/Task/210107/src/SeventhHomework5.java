/*
    < Homework 5 >
3 ~ 33 까지의 숫자중 2 의 배수 또는 3 의 배수인 수를 출력해보자!
*/


class Find3 {
    final int STARTNUM = 3;
    final int ENDNUM = 33;
    final int TARGETNUM1 = 2;
    final int TARGETNUM2 = 3;

    public void numFind() {
        System.out.printf("%d ~ %d 까지의 숫자 중 %d 의 배수 또는 %d 의 배수 = \n", STARTNUM, ENDNUM, TARGETNUM1, TARGETNUM2);

        for(int i = STARTNUM; i <= ENDNUM; i++) {
            if(i % TARGETNUM1 == 0 || i % TARGETNUM2 == 0)
                System.out.printf("%d ", i);
        }
    }
}

public class SeventhHomework5 {
    public static void main(String[] args) {
        Find3 f3 = new Find3();

        f3.numFind();
    }
}