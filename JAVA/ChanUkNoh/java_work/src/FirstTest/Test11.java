package FirstTest;

class Matrix {
    // Test 11번, 15번

    private int row, col;
    private int[][] mat;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                mat[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    private boolean checkMulDimension(Matrix A, Matrix B) {
        int Acol = A.getCol();
        int Brow = B.getRow();

        return Acol == Brow;
    }

    private boolean checkDimension(Matrix A, Matrix B) {
        int Arow = A.getRow();
        int Acol = A.getCol();

        int Brow = B.getRow();
        int Bcol = B.getCol();

        return (Arow == Brow) && (Acol == Bcol);
    }

    public void addMatrix(Matrix A, Matrix B) {
        if (checkDimension(A, B)) {
            int[][] matA = A.getMat();
            int[][] matB = B.getMat();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = matA[i][j] + matB[i][j];
                }
            }
        }
        System.out.println("계산할 수 없는 행렬입니다.");
    }

    public void multiplyMatrix(Matrix A, Matrix B) {
        if (checkMulDimension(A, B)) {

            int Arow = A.getRow();

            int Brow = B.getRow();
            int Bcol = B.getCol();

            mat = new int[Arow][Bcol];

            int[][] matA = A.getMat();
            int[][] matB = B.getMat();

            int key = 0;

            int a;

            for (int i = 0; i < Arow; i++) {

                for (a = 0; a < Bcol; a++) {

                    for (int j = 0; j < Brow; j++) {
                        key += (matA[i][j] * matB[j][a]);
                    }
                    mat[i][a] = key;

                    key = 0;
                }
            }
        } else {
            System.out.println("계산할 수 없는 행렬입니다.");
        }
    }

    public void printMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.println("");
        }
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int[][] getMat() {
        return mat;
    }
}

public class Test11 {
    public static void main(String[] args) {
        Matrix A = new Matrix(2, 2);
        Matrix B = new Matrix(2, 2);

        System.out.println(
                "************************덧셈*************************");

        Matrix R = new Matrix(2, 2);
        R.addMatrix(A, B);

        System.out.println("A: ");
        A.printMatrix();

        System.out.println("B: ");
        B.printMatrix();

        System.out.println("A + B: ");
        R.printMatrix();

        System.out.println(
                "************************곱셈*************************");

        Matrix R2 = new Matrix(2, 2);
        R2.multiplyMatrix(A, B);

        System.out.println("A: ");
        A.printMatrix();

        System.out.println("B: ");
        B.printMatrix();

        System.out.println("A X B: ");
        R2.printMatrix();
    }
}
