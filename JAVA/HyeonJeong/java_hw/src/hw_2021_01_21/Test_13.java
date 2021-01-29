package hw_2021_01_21;

public class Test_13 {
    public static void main(String[] args) {
        System.out.println(
                "12번 문제에서 할당한 배열을 다시 정렬하여 출력해보도록 한다\n");

        final int TEN = 10;

        AraayTest at = new AraayTest(TEN);

        int[] test_13 = at.setArray();
        at.printArray(test_13);

        System.out.println("----------------------------정렬!");

        at.insortNum();
        at.printArray(at.insortNum());

    }
}
