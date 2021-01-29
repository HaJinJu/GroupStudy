public class Quiz3 {
    public static void main(String[] args) {
        int num = 2;
        int sum = 0;
        while ((num < 20)) {

            if (num % 2 == 0) {
                System.out.println("num = " + num);
                sum += num;

            }
            num++;
        }

        System.out.println("2 ~ 19까지 짝수들의 합 =" + sum);
    }

}
