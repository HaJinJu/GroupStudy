public class ReviewTest {
    public static void main(String[] args) {
        
        // 행렬 난수로 생성 연습
        Review matrix = new Review(3, 3);
        matrix.allocRandomMatrix();
        matrix.printMatrix();

        // 배열을 행렬로 만들기

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int [][] arr2 = {
            {1,2,3,4},
            {2,4,6,8},
            {3,6,9,12}
        };

        // 행만 입력 - 행렬로 변환이 되지 않는 경우
        Review wrong = new Review(arr1, 4);
        wrong.printMatrix();

        // 변환이 되는 경우
        Review mat1 = new Review(arr1, 3);
        mat1.printMatrix();

        // 행과 열 모두 입력
        System.out.println("배열,행,열 모두 입력");
        Review mat2 = new Review(arr1, 3, 3);
        mat2.printMatrix();

        // 4행 3열의 상황
        System.out.println("4행3열");
        Review mat3 = new Review(arr2, 4);
        mat3.printMatrix();

        //행렬의 덧셈, 뺄셈, 곱셈
        Review matrix2 = new Review(3, 3);

        System.out.println("덧셈");
        matrix2.sumMatrix(mat1, mat2);
        matrix2.printMatrix();

        Review matrix3 = new Review(3, 3);

        System.out.println("뺄셈");
        matrix3.subMatrix(mat1, mat2);
        matrix3.printMatrix();

        Review matrix4 = new Review(3, 3);

        System.out.println("곱셈");
        matrix4.mulMatrix(mat1, mat2);
        matrix4.printMatrix();
    }
}
