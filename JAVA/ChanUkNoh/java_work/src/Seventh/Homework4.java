package Seventh;

class AndMultiple {

    public void printAndMultiple() {

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("1 ~ 20 까지의 숫자 중 2의 배수이며 " +
                        "3의 배수인 수 = " + i);
            }
        }
    }
}

public class Homework4 {
    public static void main(String[] args) {
        // 4. 1 ~ 20 까지의 숫자 중 2의 배수이며 3의 배수인 수를 출력해보자!

        AndMultiple am = new AndMultiple();

        am.printAndMultiple();
    }
}
