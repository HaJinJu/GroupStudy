package SecondToFiveth;

public class Quiz2 {
    public static void main(String[] args) {
        // 피보나치 수열을 프로그래밍으로 구현해보자! 구체적으로 13번째 항의 숫자를 구하도록 만들어보자!
//        (n-1) + (n-2) = n
        final int TARGET = 13;

        int current = 1;
        int next = 1;
        int nextNext;

        int i = 1;
        while(i < TARGET) {
            nextNext = current + next;
            current = next;
            next = nextNext;

            i++;
        }
        System.out.println(current);
    }
}