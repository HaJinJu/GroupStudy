package Seventh;

class Print {
    public void oneToTen() {

        for(int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }
}

public class Homework1 {
    // 1. 1 ~ 10 까지 출력하는 메서드를 만들어 보자
    public static void main(String[] args) {
        Print p = new Print();

        p.oneToTen();
    }
}
