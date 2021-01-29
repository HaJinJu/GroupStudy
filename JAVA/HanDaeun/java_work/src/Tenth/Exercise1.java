package Tenth;

class DoubleArray {
    private int row;
    private int col;
    private int[][] arr;

    public DoubleArray(int row, int col) {
        this.row = row;
        this.col = col;

        arr = new int[row][col];
    }

    public void printArray() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = (i + 1) * (j + 1);
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println("");
        }
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        DoubleArray da = new DoubleArray(3, 3);

        da.printArray();

        Matrix mat = new Matrix(3, 3);
        mat.allocRandomMatrix();
        mat.printMatrix();
    }
}