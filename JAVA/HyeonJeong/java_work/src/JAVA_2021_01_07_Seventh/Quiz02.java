package JAVA_2021_01_07_Seventh;

import java.util.Arrays;

class SalaryCalculator {
    int[] WorkersAccount; //빈 배열 생
    int workers;

    public SalaryCalculator(int workers) { // 생성자로 초기화 회사원의 수만큼 배열 할
        WorkersAccount = new int [workers];
        this.workers = workers;
    }

    public void setRandomPayment() {

        for(int i = 0; i < workers; i++) {
            WorkersAccount[i] = (int)(Math.random() * 1201) +2400;
            // 회사원[0] = 랜덤급여, 회사원[1] = 랜덤급여
        }
    }

    public void printWorkersPayment() {
        for(int i = 0; i < workers; i++) {
            System.out.printf("사원%d 연봉 = %d만원\n",i+1 ,WorkersAccount[i]);
        }
    }


}

public class Quiz02 {
    public static void main(String[] args) {
        SalaryCalculator sc = new SalaryCalculator(4); //클래스를 사용할때는 new를 선언한

        sc.setRandomPayment();
        sc.printWorkersPayment();
    }
}
