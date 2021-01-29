package Third;

public class AlternativeExercise8_2 {
    public static void main(String[] args) {
        // 1 ~ 30 까지의 숫자 중 2 혹은 3의 배수는 더하고 5의 배수는 뺀다.
        // 혼동의 여지를 방지하기 위해
        // 10 처럼 2의 배수 이면서 5의 배수가 되는 경우엔
        // 빼기도 하고 더하기도 하므로 결론적으로 0
        int addsum = 0, subsum = 0;

        for (int i = 1; i < 31; i++) {
            // 더하기 파트
            if (i % 2 == 0 || i % 3 == 0) {
                addsum += i;
                System.out.println("더하는 값 = " + i);
            }
        }

        for (int i = 1; i < 31; i++) {
            // 빼기 파트
            if (i % 5 == 0) {
                subsum += i;
                System.out.println("빼는 값 = " + i);
            }
        }
        System.out.println("총합 = " + addsum);
        System.out.println("빼는 값 = " + subsum);
        System.out.println("결과 = " + (addsum - subsum));
    }
}