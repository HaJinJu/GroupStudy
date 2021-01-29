package Sixth_Homework;
import java.util.Random;
public class Second {
    public static void main(String[] args) {
//        1) 7개 짜리 int 형 배열을 만들어보자!
//        2) 1번 문제에서 만든 배열에 랜덤 값을 할당해보자!
        int[] arr = new int[7];
        Random rand = new Random();
        int randNum = rand.nextInt();

        for(int i = 0; i < 7; i++)  {
            arr[i] = randNum ;
            System.out.printf("add[%d] = %d\n", i, arr[i]);
        }

    }
}
