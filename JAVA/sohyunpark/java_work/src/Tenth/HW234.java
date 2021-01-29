package Tenth;

class MatrixEx {
    private int row, col;
    private int[][] mat1, mat2, sum, sub, multi;

    public MatrixEx(int row, int col) {
        this.row = row;
        this.col = col;

        mat1 = new int[row][col];
        mat2 = new int[row][col];
        sum = new int[row][col];
        sub = new int[row][col];
        multi = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat1[i][j] = (int) (Math.random() * 10);
                mat2[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%3d", mat1[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%3d", mat2[i][j]);
            }
            System.out.println("");
        }
    }

    public void addMatrix() {
        System.out.println("\n행렬 덧셈");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                System.out.printf("%3d", sum[i][j]);
            }
            System.out.println("");
        }
    }

    public void subMatrix() {
        System.out.println("\n행렬 뺄셈");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sub[i][j] = mat1[i][j] - mat2[i][j];
                System.out.printf("%3d", sub[i][j]);
            }
            System.out.println("");
        }
    }

    public void multiMatrix() {
        System.out.println("\n행렬 곱셈");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < col; k++) {
                    multi[i][j] = mat1[i][k] * mat2[k][j] + mat1[i][j] * mat2[j][j];
                    //    0  1        확실             확실       확실 확실       확실
                }
                System.out.printf("%3d", multi[i][j]);

            }
            System.out.println("");
        }
    }
}

public class HW234 {
    public static void main(String[] args) {
        MatrixEx me = new MatrixEx(2, 2);

        me.printMatrix();
        me.addMatrix();
        me.subMatrix();
        me.multiMatrix();
    }
}
