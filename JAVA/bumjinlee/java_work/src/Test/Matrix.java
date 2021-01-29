package Test;

public class Matrix {
    private int[][] matrix;
    private int a, b;

    Matrix(int a, int b) {
        this.a = a;
        this.b = b;

        matrix = new int[a][b];
    }

    public void addMatrix(int[][] a, int[][] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                matrix[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public void mulMatrix(int[][] a, int[][] b) {

        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < b[0].length; ++j) {
                for (int k = 0; k < a[0].length; ++k) {
                    matrix[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println("");
        }
    }
}