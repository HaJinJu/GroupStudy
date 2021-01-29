package Test;

// 문제 19. 임의의 난수들을 임의의 배열 크기에 저장하고 이 값들을 출력해보자
//         또한 짝수만 따로 홀수만 따로 출력할 수 있게 메서드를 작성

public class Quiz19 {
    public static void main(String[] args) {
        MyArray ma = new MyArray();
        System.out.println("-----랜덤 출력");
        ma.PrintRandomArray();
        System.out.println("");

        System.out.println("-----짝수 출력");
        ma.PrintOddArray(2);
        System.out.println("");

        System.out.println("-----홀수 출력");
        ma.PrintEvenArray(2);
    }
}