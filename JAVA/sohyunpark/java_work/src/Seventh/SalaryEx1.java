package Seventh;

public class SalaryEx1 {
    public static void main(String[] args) {
        // 4명의 직원 - 급여 최소 2400 이상
        // 이들간의 차이 : 최대 1200
        // 각각의 랜덤한 연봉 출력

        int Salary[] = new int[4];

        for (int i = 0; i < 4; i++) {
            // Math.random * 1201 : 0 ~ 1200
            Salary[i] = (int)(Math.random() * 1201) + 2400;
            System.out.println("스타트업 멤버의 연봉 = " + Salary[i]);
        }
    }
}