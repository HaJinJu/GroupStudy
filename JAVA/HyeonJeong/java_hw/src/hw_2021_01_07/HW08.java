package hw_2021_01_07;

public class HW08 {
    public static void main(String[] args) {
        // 7번 문제를 중복이 허용되지 않도록 만든다.
        RandomNumber rn = new RandomNumber();

        rn.prepareArray(20);
        rn.setRandomNumber(rn.NONDUPLICATE);
        rn.printEmployee();
    }
}
