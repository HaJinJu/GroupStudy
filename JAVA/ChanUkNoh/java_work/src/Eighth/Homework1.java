package Eighth;

class Constructor1 {
    int start;
    int end;
    int i;

    public Constructor1(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void printTen() {
        for (i = start; i <= end; i++) {
            System.out.println("i = " + i);
        }
    }

    public void printThirty() {
        for (i = start; i <= end; i++) {
            System.out.println("i = " + i);
        }
    }

    public void printMultiple() {
        for (i = start; i <= end; i++) {
            if (i % 7 == 0) {
                System.out.println("i = " + i);
            }
        }
    }

    public void printSum() {
        int sum = 0;
        for (i = start; i <= end; i++) {

            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }

}

public class Homework1 {
    public static void main(String[] args) {
        // 1) 생성자를 사용해서 1 ~ 10 까지 출력하는 프로그램을 작성해보자!
        Constructor1 con = new Constructor1(1, 10);

        con.printTen();






        // 6) 특수한 주사위 게임이다.
        //    주사위는 1개 있으며 이 주사위는 정팔면체이다.
        //    주사위를 굴려 가장 큰 숫자가 나온 사람이 이기는 게임이다.
        //    규칙 1) 홀수가 나오면 한 번 더 굴릴 수 있다.
        //    [단, 최초 한 번만 허용된다.]
        //    규칙 2) 홀수가 나와 기회를 한번 더 얻었을 때
        //    그 다음에도 연속해서 홀수가 나오면 0점 처리된다.
        //    규칙 3) 홀수가 나와 기회를 한 번 더 얻었을때 아래의
        //    숫자들은 각각 다른 능력을 가진다.

    }
}
