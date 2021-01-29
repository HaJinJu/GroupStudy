package Sixth_Quiz;

public class SixthQuiz1 {
    public static void main(String[] args) {
        //7개 짜리 int 형 배열을 만들어보자!
        int[] arr = new int[7];
        for(int i= 0;i<7;i++){
            arr[i] = i +1;
            System.out.printf("arr[%d] = %d\n",i+1,arr[i]);
        }

    }
}
