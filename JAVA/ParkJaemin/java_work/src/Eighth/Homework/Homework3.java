package Eighth.Homework;

class Seventh {

    int start;
    int end;
    int num;

    public Seventh(int start, int end, int num) {
        this.start = start;
        this.end = end;
        this.num = num;
        for (int i = start; i <= end; i++) {
            if (i % num == 0) {
                System.out.println(i);
            }
        }
    }
}


public class Homework3 {
    public static void main(String[] args) {
        System.out.println("5~55까지 숫자중 7의 배수만 출력해보자");
        Seventh C = new Seventh(5, 55, 7);


    }
}

