package SecondToFiveth;

public class Quiz3 {
    public static void main(String[] args) {
        // 1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, 79 ....
        // 위 수열에서 20번째 숫자를 찾도록 프로그래밍해보자!
        // n = n-3 n-1
        final int TARGET = 20;

        int current = 1;
        int next = 1;
        int nextNext = 3;
        int nextNextNext = 0;

        int i = 1;

        while (i < TARGET) {
            nextNextNext = current + nextNext;
            current = next;
            next = nextNext;
            nextNext = nextNextNext;
            i++;
        }
        System.out.println(current);
    }
}
