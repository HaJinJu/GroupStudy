package Project0107;
//6) 피보나치 수열을 배열 없이 만들어서 출력해보도록 만든다.
public class Homework06 {
    public static void main(String[] args) {
        int first = 1, second = 1;
        int loop = 20;
        int res = 0;

        for(int i = 0; i < loop - 2; i++) {
            res = first + second;
            first = second;
            second = res;
            System.out.println(res);
        }

        System.out.printf("%d 번째 항은 = %d\n", loop, res);
    }
}
