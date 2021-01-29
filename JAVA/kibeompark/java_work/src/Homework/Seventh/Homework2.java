package Homework.Seventh;

class OnetoTenSum {
    int sum;

    public int Sum() {
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        return sum;
    }

    public void Print() {
        System.out.println("1부터 10까지의 합 = " + Sum());
    }
}

public class Homework2 {
    public static void main(String[] args) {
        // 2) 1 ~ 10 까지의 숫자를 더한 결과를 출력하도록 메서드를 만들어 보자 !
        OnetoTenSum ots = new OnetoTenSum();

        ots.Print();
    }
}
