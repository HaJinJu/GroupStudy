package hw_2021_01_21;

public class MatrixTest {
    private float[][] map;
    private int[][] matrix;
    private int row, col;

    MatrixTest(int row, int col) {
        this.row = row;
        this.col = col;

        matrix = new int[row][col];
    }

    public void setMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
                System.out.printf("%4d",matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public void setPoint() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                map[i][j] = (float)(Math.random() * 10);
                System.out.printf("%4d",map[i][j]);
            }
            System.out.println("");
        }

    }

    private boolean checkCalculateAvailable(int[][] A) {
        int row = A.length;
        int col = A[0].length;

        return (this.row == row) && (this.col == col);
    }

    private boolean checkCalculateAvailable(int[][] A, int[][] B) {
        int Arow = A.length;
        int Brow = B.length;
        int Acol = A[0].length;
        int Bcol = B[0].length;

        return (Arow == Brow) && (Acol == Bcol);
    }

    public void addMatrix(int[][] A) {
        if(checkCalculateAvailable(A)) {
            int[][] addMatA = A;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = matrix[i][j] + addMatA[i][j];
                }
            }
        }
    }

    public void addMatrix(int[][] A, int[][] B) {
        if(checkCalculateAvailable(A, B)) {
            int[][] addMatA = A;
            int[][] addMatB = B;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = addMatA[i][j] + addMatB[i][j];
                }
            }
        }
    }

    public boolean checkMulAvailable(int[][] A, int[][] B) {
        int Brow = B.length;
        int Acol = A[0].length;

        return (Brow == Acol);
    }

    public void mulMatirx(int[][] A, int[][] B) {
        if(checkMulAvailable(A, B)) {
            int[][] mulMatA = A;
            int[][] mulMatB = B;

            for (int i = 0; i < A.length; ++i) {
                for (int j = 0; j < B[0].length; ++j) {
                    for (int k = 0; k < A[0].length; ++k) {
                        matrix[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        }
    }

    public void printMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
