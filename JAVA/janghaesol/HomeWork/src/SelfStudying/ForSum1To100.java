package SelfStudying;

public class ForSum1To100 {
    public static void main(String[] args) {

        int i;
        int sum = 0;
        int maxNum = 100;

        for (i = 1; i <= maxNum; i++) {
            sum += i;
        }
        System.out.println("1부터 100까지의 합은 : " + sum);
    }
}
