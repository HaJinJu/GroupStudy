import  java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("연습문제 3.\n숫자를 입력해주세요: ");
        int num = scan.nextInt();
        System.out.println("입력받은 값: " + num);

        System.out.println("\n연습문제 4.");
        if(num % 5 == 1){
            System.out.println(num + " = 5로 나누었을때, 나머지가 1인 숫자");
        } else {
            System.out.println(num + " = 5로 나누었을때, 나머지가 1이 아닌 숫자");
        }

        System.out.print("\n연습문제 5.\n숫자를 입력하세요: ");
        int num3 = scan.nextInt();
        if((num3 & (num3 - 1)) == 0 ){
            System.out.println("2의 거듭제곱입니다.");
        } else {
            System.out.println("2의 거듭제곱이 아닙니다.");
        }

        System.out.println("\n연습문제 6.");
        System.out.print("1000 ~ 2000의 값을 입력하세요: ");
        int num2 = scan.nextInt();


//        if(num2 <= 1470) {
//            System.out.println("후진");
//        }else if(num2 >= 1530) {
//            System.out.println("전진");
//        }else{
//            System.out.println("정지");
        if(num2 > 2000){ //num2가 2000보다 크다면
            System.out.println("잘못된 값 입력!");
        }else if(num2 > 1529) { // num2 1530 보다 크다면 && 2000 보다 작거나 같다면
            System.out.println("전진");
        }else if(num2 > 1470) { // num2 1470 보다 크다면 && 1530 보다 작거나 같다면
            System.out.println("정지");
        }else if(num2 > 999) { // num2 999 보다 크다면 && 1470 보다 작거나 같다면
            System.out.println("후진");
        }else{ // num2가 999보다 작거나 같다면
            System.out.println("잘못된 값 입력!");
        }
    }
}
