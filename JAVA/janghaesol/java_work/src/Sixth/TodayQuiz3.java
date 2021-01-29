package Sixth;

public class TodayQuiz3 {
    public static void main(String[] args) {

    //1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, 79, ...
    //   위 수열에서 20번째 숫자를 찾도록 프로그래밍 해보자!
    int[] arr = new int[20];

    arr[0] = 1;
    arr[1] = 1;
    arr[2] = 3;
        for(int i =3; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 3];
            //5          4           1


        System.out.printf("arr[%d] = %d\n", i, arr[i] );
    /*
    int[] arr = new int[20];

    arr[0] = 1;
    arr[1] = 1;

        for(int i =2; i < n; i++){
        arr[i] = arr[i - 1] + arr[i - 2];
        System.out.printf("arr[%d] = %d\n", n, arr[n -1]);

    // 첫번째 항 + 세번째 항 = 네번째
    // 두번째 항 + 네번째 항 = 다섯번째
    // 1, 1, 3, 4, 5, 8, 12, 17, 25, 37, 54, 79, ...
    final int TARGET = 20;
    final int ALREADY = 3;

    int loop = 0;
    int first = 1, second = 1, third = 3, res = 0;

        while(loop < TARGET - ALREADY) {
        res = first + third;
        first = second;
        second = third;
        third = res;

        loop++;
    }

        System.out.println("res = " + res);

     */
}
}
}
