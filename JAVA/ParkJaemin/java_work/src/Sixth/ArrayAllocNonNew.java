package Sixth;

public class ArrayAllocNonNew {
    public static void main(String[] args) {
        // 속도는 new를 사용하지 않는 케이스가 더 빠르다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 변칙수

        //--------------------------------------------
        // | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 미리 할당한 값
        // ------------------------------------------
        //  [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]

        // arr.length - 현재 배열의 원소 개수를 구한다.
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}
