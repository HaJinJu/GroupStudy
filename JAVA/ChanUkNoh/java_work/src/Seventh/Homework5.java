package Seventh;

class OrMultiple {

    public void printOrMultiple() {

        for(int i = 3; i <= 33; i++) {

            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println("3 ~ 33까지의 숫자 중" +
                        "2의 배수 또는 3의 배수인 수 = " + i);
            }
        }
    }
}

public class Homework5 {
    public static void main(String[] args) {
        // 5. 3 ~ 33까지의 숫자중 2의 배수 또는 3의 배수인 수를 출력 해보자!
        OrMultiple om = new OrMultiple();

        om.printOrMultiple();

    }
}
