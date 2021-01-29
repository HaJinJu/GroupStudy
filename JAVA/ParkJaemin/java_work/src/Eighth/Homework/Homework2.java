package Eighth.Homework;

class Number2 {
    int start;
    int end;

    public Number2(int start, int end) {
        this.start = start;
        this.end = end;
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("3~33까지 출력해보자");
        Number2 B = new Number2(3, 33);


    }
}
