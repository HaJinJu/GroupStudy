package hw_2021_01_08;

public class HW07 {
    public static void main(String[] args) {
        // 3 ~ 33 까지의 홀수 합산 결과를 출력해보자!
        System.out.println("3 ~ 33까지 홀수만 더하기!!");

        Constructor_Series cs = new Constructor_Series(3, 33);
        cs.printSeries();
        System.out.printf("\n홀수의 합 = %d\n",cs.sumOddNum());
    }
}
