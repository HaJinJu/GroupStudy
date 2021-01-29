package Seventh;

class RandomSalary {
    //    2) 위의 1번 문제를 이젠 클래스를 활용하여 만들어보자!
    final int STAFF = 4;
    int[] loop = new int[STAFF];

    public void salaryDispenser() {
        for (int i = 0; i < loop.length; i++) {
            loop[i] = (int)(Math.random() * 1201) + 2400;
            System.out.printf("직원 %d의 연봉: %d\n", i, loop[i]);
        }
    }
}

public class Exercise2 {
    public static void main(String[] args) {

        RandomSalary rs = new RandomSalary();

        rs.salaryDispenser();
    }
}
