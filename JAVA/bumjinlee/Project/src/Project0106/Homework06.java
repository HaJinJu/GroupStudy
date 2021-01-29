package Project0106;

public class Homework06 {
    public static void main(String[] args) {
        // 5번 문제에서 출력한 값들을 출력하지 않고
        // 배열에 저장하고 출력하도록 한다.
        /*
        // 1~100까지 숫자중 3의 배수만 출력하기
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println("3의 배수만 출력하기 : " + i);
            }
         */
        int arr[] = new int [100];
        int cnt = 0;

        for(int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                arr[cnt] = i;
                //printf 내부에서 여러 변수를 사용한다면 맨 뒤쪽에서 ++을 해야 가장 마지막에 적용된다.
                System.out.printf("arr[%d] = %d\n", cnt , arr[cnt]);
            }
        }

    }
}
