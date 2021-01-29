package Eighth.Homework;

class multiplication {
    int dan1;
    int dan2;
    int num1;
    int num2;


    public multiplication
            (int dan1, int dan2, int num1, int num2) {
        this.dan1 = dan1;
        this.dan2 = dan2;
        this.num1 = num1;
        this.num2 = num2;

        for (int i = dan1; i < dan2; i++) {
            System.out.println(i + "단을 출력합니다.");
            for (int j = num1; j < num2; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}

public class Homework10 {
    public static void main(String[] args) {

        System.out.println("구구단을 시작해보자");

        multiplication A = new multiplication
                (2, 10, 1, 10);


    }
}
