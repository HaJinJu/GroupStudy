package Eighth.Homework;

class Number {
    int start;
    int end;


    public Number(int start, int end) {
        this.start = start;
        this.end = end;

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }


}


public class Homework {
    public static void main(String[] args) {
        System.out.println("1~10까지 출력해보자");
        Number A = new Number(1, 10);


    }
}

