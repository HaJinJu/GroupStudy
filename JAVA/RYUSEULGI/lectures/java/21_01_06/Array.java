// import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // 배열 생성
        int[] arr = new int[10];
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        
        for(int i =0; i<10; i++){
            arr[i] = i+1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

        for(int i =0; i<array.length; i++){
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }

        // new를 작성하지 않는게 속도는 더 빠름
        // array변수는 arr와 다르게 미리 가ㅄ이 할당되어 있기 때문

        System.out.println(arr.length);

       // 피보나치 수열

        int[]ARRAY = new int[13];

        ARRAY[0] =1;
        ARRAY[1] =1;

        // 초기화
        for(int i =2; i< ARRAY.length; i++){
            ARRAY[i] = ARRAY[i - 1] + ARRAY[i - 2];
        }
        // 출력
        for(int i=0; i < ARRAY.length; i++){
            System.out.printf("ARRAY[%d] = %d\n", i, ARRAY[i]);
        }

        // 피보나치 수열의 n번째 항을 찾는 형태로 변경

        // Scanner scan = new Scanner(System.in);

        // final int value =1;

        // System.out.println("찾으려고 하는 항을 입력하세요");
        // int num = scan.nextInt();


        // if( num <= 0){
        //     System.out.println("error");
        // }else if(num < 3){
        //     System.out.println(value);
        //     return;
        // }

        // int[] ARR = new int[num];

        // ARR[0] = value;
        // ARR[1] = value;

        // for(int i =2; i< num; i++){
        //     ARR[i] = ARR[i - 1] + ARR[i - 2];
        // }
        // System.out.println(ARR[num-1]);

        // scan.close();



    }
}
