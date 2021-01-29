public class TenthTask1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Matrix mat1 = new Matrix(arr, 3);
        Matrix mat2 = new Matrix(arr, 3, 3);

        System.out.println("1번 행렬 입니다.");
        mat1.printMatrix();

        System.out.println("\n2번 행렬 입니다.");
        mat2.printMatrix();
    }
}
