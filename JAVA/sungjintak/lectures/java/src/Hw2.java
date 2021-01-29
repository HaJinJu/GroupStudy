import java.util.Random;

public class Hw2 {
    public static void main(String[] args) {
        // 1번문제에서 만든 배열에 랜덤 값을 할당해보자
        Random rand = new Random();


        int[] arr = new int[7];


        for(int i=0; i< arr.length; i++){
            int num = rand.nextInt(7);
            arr[i]=num;

            System.out.printf("arr[%d] = %d\n",i , arr[i]);
        }

    }
}
