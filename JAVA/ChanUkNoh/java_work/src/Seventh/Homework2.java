package Seventh;

class Sum {
    public int sum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public void print() {
        System.out.println("1 ~ 10 까지의 숫자 합 = " + sum());
    }
}

public class Homework2 {
    public static void main(String[] args) {
        // 2. 1 ~ 10 까지의 숫자를 더한 결과를 출력하도록 매서드를 만들자!

        Sum s = new Sum();

        s.print();
    }
}
