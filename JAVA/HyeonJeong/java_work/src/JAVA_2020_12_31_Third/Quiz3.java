public class Quiz3 {
    public static void main(String[] args) {
//      2 ~ 19 사이의 숫자중 짝수의 합을 구해보자
        int sum = 0;
        int num = 2;

        while(num < 20) {
            if (num % 2 == 0){
                System.out.println("짝수인 숫자= " + num);
//              sum = sum + num 과 동의어
                sum += num;
//              sum = sum - num
//              sum -= num

//              sum = sum * num
//              sum *= num

//              sum = sum / num
//              sum /= num

//              sum = sum % num
//              sum %= num
            }
            num++;
        }

//      2 ~ 18
//      2 4 6 8 10 12 14 16 18
        System.out.println("2 ~ 19까지 짝수들의 합 = " + sum );
    }
}
