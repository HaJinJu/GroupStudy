package hw_2021_01_07;

public class HW11 {
    public static void main(String[] args) {
        // 이 배열에서 짝수가 몇 개 나왔는지 체크하는 매서드를 만든다.
        RandomNumber rn = new RandomNumber();

        rn.prepareRandomArray();
        rn.setRandomArray();
        System.out.printf(
                "\n과연 짝수는 몇개 나왔을까?? = %d개\n", rn.getCountEvenNumber());
        rn.printEmployee();
    }
}
