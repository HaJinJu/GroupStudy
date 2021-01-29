package JAVA_2021_01_12_Tenth;

public class Exercise01 {
    public static void main(String[] args) {
        Matrix mat = new Matrix(3, 3);

        mat.allocRandomMatrix();
        mat.printMatrix();

        System.out.println("");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Matrix mat2 = new Matrix(arr, 3, 3);
        mat2.printMatrix();

        System.out.println("");

        Matrix mat3 = new Matrix(arr, 3);
        mat2.printMatrix();
    }
}
