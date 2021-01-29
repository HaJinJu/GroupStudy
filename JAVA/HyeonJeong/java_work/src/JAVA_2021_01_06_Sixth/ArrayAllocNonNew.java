package JAVA_2021_01_06_Sixth;

public class ArrayAllocNonNew {
    public static void main(String[] args) {

        //-------------------------------------------
        // | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |  미리 할당한
        //-------------------------------------------
        //  [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //array.length => 현재 배열의 원소 개수를 구한다.

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }
    }
}
