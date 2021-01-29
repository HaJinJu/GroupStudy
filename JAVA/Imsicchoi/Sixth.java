package Sixth_Homework;

public class Sixth { public static void main(String[] args) {
// 6) 5번 문제에서 출력한 값들을 출력하지 않고
//   배열에 저장하고 출력하도록 한다.
    int[] arr = new int[100];

    for (int i = 0; i < 100; i++) {
        arr[i] = i + 1;
        if (arr[i] % 3 == 0) {
            System.out.printf("add[%d] = %d\n", i, arr[i]);
        }

    }
}
}

