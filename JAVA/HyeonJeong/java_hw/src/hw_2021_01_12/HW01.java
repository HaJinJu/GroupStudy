package hw_2021_01_12;

public class HW01 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] arr2 = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9}
        };
        int[][] arr3 = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12}
        };

        Matrix wrong = new Matrix(arr1, 4);
        // 배열 그리고행(row)과 열(col)의 값으로 사각형의 2차 배열로 만들수없는 경우
        wrong.allocate_random_matrix();
        wrong.print_matrix();

        System.out.println("Matrix A:");
        // 배열 그리고 행(row)과 열(col)의 값으로 2차 배열을 만든다.
        Matrix A = new Matrix(arr1, 3, 3);
        A.print_matrix();

        System.out.println("Matrix B:");
        // 2차원 배열과 행(row)의 값을 받아 (arr.length == row)으로 만든다.
        Matrix B = new Matrix(arr2, 3);
        B.print_matrix();

        System.out.println("Matrix C:");
        // 2차원 배열과 행(row)의 값을 받아 (arr.length == row)으로 만든다.
        Matrix C = new Matrix(arr3, 4);
        C.print_matrix();

        System.out.println("R = A + B");
        // 빈 2차원 배열을 할당하고 인자값 입력한 2개의 2차원 배열의
        // 덧셈값을 할당한 배열에 대입한다.
        Matrix R = new Matrix(3, 3);
        R.add_matrix(A, B);
        R.print_matrix();

        System.out.println("A = A + B");
        // 생성자로 만들어 놓은 2차원 배열과 인자값에 입력한 2차원 배열을 더한다.
        A.add_matrix(B);
        A.print_matrix();

        System.out.println("R = A - B");
        // 빈 2차원 배열을 할당하고 인자값 입력한 2개의 2차원 배열의
        // 뺄셈값을 할당한 배열에 대입한다.
        R.sub_matrix(A, B);
        R.print_matrix();

        System.out.println("A = A - B");
        // 생성자로 만들어 놓은 2차원 배열과 인자값에 입력한 2차원 배열을 뺀다.
        A.sub_matrix(B);
        A.print_matrix();

        System.out.println("R = A * B");
        // 빈 2차원 배열을 할당하고 인자값 입력한 2개의 2차원 배열의
        // 곱셈값을 할당한 배열에 대입한다.
        R.mul_matrix(A, B);
        R.print_matrix();
    }
}