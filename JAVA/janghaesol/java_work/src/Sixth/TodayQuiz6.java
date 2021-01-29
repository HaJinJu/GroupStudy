package Sixth;

public class TodayQuiz6 {
    //5번 문제에서 출력한 값들을 출력하지 않고
    //   배열에 저장하고 출력하도록 한다.
    public static void main(String[] args) {

        int []arr = new int[100];
        for (int i = 0; i <= arr.length; i++) {
            i++;
            arr[i] = i;
            if (i % 3 == 0) {
                System.out.printf("arr[%d] = %d\n", i, arr[i]);
            }



        }
    }
}