package Test;

class Matrix {
    private int mat[][];
    private int row, col;
    private int check;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public boolean checkDimension(Matrix A, Matrix B) {
        return (A.row == B.col) && (A.col == B.col);
    }

    public void sumMatrix(Matrix A, Matrix B) {
        if (checkDimension(A, B)) {
            mat = new int[A.row][A.col];

            for (int i = 0; i < A.row; i++) {
                for (int j = 0; j < A.col; j++) {
                    mat[i][j] = A.mat[i][j] + B.mat[i][j];
                }
            }
        } else {
            check = 1;
        }
    }

    public boolean checkMulDimension(Matrix A, Matrix B) {
        return (A.col == B.row);
    }

    public void mulMatrix(Matrix A, Matrix B) {
        if (checkMulDimension(A, B)) {
            mat = new int[A.row][B.col];

            for (int i = 0; i < A.row; i++) {
                for (int j = 0; j < B.col; j++) {
                    for (int k = 0; k < A.col; k++) {
                        mat[i][j] += A.mat[i][k] * B.mat[k][j];
                    }
                }
            }
        } else {
            check = 1;
        }
    }

    public void printMatrix() {
        if (check == 0) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.printf("%3d", mat[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("계산 불가");
        }
    }
}

public class Test11and15 {
    public static void main(String[] args) {
        // 이중 배열을 사용하여 2 by 2 행렬의 덧셈을 프로그래밍해 보자 !
        // 2 by 2 행렬의 곱셈을 수행하도록 프로그래밍해 보자 !
        Matrix A = new Matrix(2, 2);
        Matrix B = new Matrix(2, 2);

        System.out.println("Matrix A");
        A.printMatrix();
        System.out.println("Matrix B");
        B.printMatrix();

        Matrix S = new Matrix(2, 2);
        System.out.println("A + B");
        S.sumMatrix(A, B);
        S.printMatrix();

        System.out.println("A * B");
        S.mulMatrix(A, B);
        S.printMatrix();
    }
}
