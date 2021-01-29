package Sixth_Homework;

//3) 1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, 79, ...
//   위 수열에서 20번째 숫자를 찾도록 프로그래밍 해보자!
public class Third {
    public static void main(String[] args) {
        System.out.println("20번째 수열 항 구하기");
        int[] arr = new int[24];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 4;




        for (int i = 2; i < arr.length; i++) {
            arr[i+3] = (arr[i] + arr[i +2]) ;

            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}

