package Homework.Seventh;

class OnetoTen {
    public void Print() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class Homework1 {
    public static void main(String[] args) {
        // 1) 1 ~ 10 까지 출력하는 클래스 내의 메서드를 만들어 보자 !
        OnetoTen ot = new OnetoTen();

        ot.Print();
    }
}
