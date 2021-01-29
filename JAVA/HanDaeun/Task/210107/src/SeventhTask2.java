/*
    < 연습 문제 2 >

위의 1 번 문제를 이젠 클래스를 활용하여 만들어보자!

 */


class SalaryCalculator {
    final int EMPLOYEE = 4;
    int[] salary = new int[EMPLOYEE];

    public void setRandomSalary() {
        for(int i = 0; i < EMPLOYEE; i++) {
            salary[i] = (int)(Math.random() * 1201) + 2400;

            System.out.printf("%d 번 직원의 연봉 = %d\n", i+1, salary[i]);
        }
    }
}


public class SeventhTask2 {
    public static void main(String[] args) {
        SalaryCalculator sc = new SalaryCalculator();

        sc.setRandomSalary();
    }
}
