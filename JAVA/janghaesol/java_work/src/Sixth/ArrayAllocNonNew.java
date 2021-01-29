package Sixth;

public class ArrayAllocNonNew {
    public static void main(String[] args) {
        //속도는 new를 사용하지 않은 케이스가 더 빠름.
        int[] arr = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*
        -----------------------------------------
        | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |  미리 할당한
        -----------------------------------------
        [0] [1] [2] [3] [4] [5] [6] [7] [8]  [9]

         */

        for (int i = 0; i < arr.length; i++) {
                //arr.length : 현재 배열의 원소 개수를 구한다.
            arr[i] = i + 1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

    }
}
