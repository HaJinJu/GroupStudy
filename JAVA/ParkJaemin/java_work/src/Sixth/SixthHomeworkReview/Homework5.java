package Sixth.SixthHomeworkReview;

public class Homework5 {
    public static void main(String[] args) {
//        //1 ~ 100 까지 숫자중 3 의 배수만 출력해보자!
        int num = 3;

        while (num < 100) {
            if (num % 3 == 0) {
                System.out.println("3의 배수는 = " + num++);
            }
            num++;
        }


    }
}



