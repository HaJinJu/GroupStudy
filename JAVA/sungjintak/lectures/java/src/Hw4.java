import java.util.Random;

public class Hw4 {
    public static void main(String[] args) {
        //float 형 배열에 랜덤 값 3개를 입력해보자
        Random rand = new Random();

        float[] arr = new float[3];

        for(int i=0; i < arr.length; i++){
            int num = rand.nextInt(6);
            arr[i] = num;

            System.out.printf("arr[%d] = %f\n",i , arr[i]);
        }

    }
}
