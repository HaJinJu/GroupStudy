package Seventh;

class Multiple {

    public void printMultiple() {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("1 ~ 20 까지의 숫자 중 2의 배수 = " + i);
            }
        }
    }

}

public class Homework3 {
    public static void main(String[] args) {
        // 3. 1 ~ 20 까지의 숫자 중 2의 배수를 출력하도록 매서드를 만들어보자!
        Multiple mul = new Multiple();

        mul.printMultiple();
    }
}
