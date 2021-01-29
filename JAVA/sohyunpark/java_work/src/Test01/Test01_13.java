package Test01;

public class Test01_13 {
    public static void main(String[] args) {
        // 12번 문제에서 할당한 배열을 다시 정렬하여 출력해보도록 한다.
        RandomArray ra = new RandomArray(1,10);

        ra.setArray();
        ra.sortArray();
        ra.printArray();
    }
}
