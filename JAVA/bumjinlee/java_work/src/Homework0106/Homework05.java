package Homework0106;

public class Homework05 {
    public static void main(String[] args) {
        // 1~100까지 숫자중 3의 배수만 출력하기

        for(int i = 1; i <= 100; i++){

            if(i % 3 == 0){
                System.out.println("3의 배수만 출력하기 : " + i);
            }
        }
    }
}
