package Sixth;

public class TodayQuiz2 {
    //7개 짜리 int 형 배열을 만들어보자!
    //1번 문제에서 만든 배열에 랜덤 값을 할당해보자!
    public static void main(String[] args) {


            int random = (int) (Math.random()*6) + 1;
            System.out.println("랜덤 값은 : " + random);
            int[] arr = new int[7];

            for(int i = 0;i < random; i++){
                arr[i] = i+1;
                System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
