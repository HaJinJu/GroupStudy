package SelfStudying;

public class Continue {
    public static void main(String[] args) {
        int i;
        int maxNum = 100;
        int sum = 0;
        for(i = 0; i <= 100; i ++){
            if((i % 2 == 0)|| (i % 3 == 0)) {
                continue;
            }
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
