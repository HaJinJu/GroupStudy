package ClassList;

public class Matrix {
    private final int ZERO = 0;
    private final int ONE = 1;
    // 1 ~ 20 사이의 랜덤한 수를 행렬에 저장
    private final int VRANGESTART = 1;
    private final int VRANGEEND = 10;

    private int row, col;
    private int[][] mat;
    private int[][] matAdd, matMul;


    // 생성자 (행, 열) 입력받아 생성
    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int[row][col];
    }

    // 생성자 (이중 배열) 입력받아 생성
    public Matrix(int[][] mat) {
        row = mat.length;
        col = mat[0].length;

        this.mat = mat;
    }

    // 랜덤한 값을 행렬에 저장
    public void setRandomMatValue() {
        int valueRange = VRANGEEND - VRANGESTART + ONE;

        for(int i = ZERO; i < row; i++) {
            for(int j = ZERO; j < col; j++) {
                mat[i][j] = (int)(Math.random() * valueRange) + VRANGESTART;
            }
        }
    }

    // 덧셈이 가능한지 확인
    private boolean checkPossibleAdd(Matrix mat) {
        int row = mat.getRow();
        int col = mat.getCol();

        return (this.row == row) && (this.col == col);
    }

    // 곱셈이 가능한지 확인
    private boolean checkPossibleMul(Matrix mat) {
        int row = mat.getRow();

        return (this.col == row);
    }

    // 행렬의 덧셈
    public void addMatrix(Matrix mat) {
        if(checkPossibleAdd(mat)) {
            matAdd = new int[row][col];
            int[][] matB = mat.getMat();

            for(int i = ZERO; i < row; i++) {
                for(int j = ZERO; j < col; j++) {
                    matAdd[i][j] = this.mat[i][j] + matB[i][j];
                }
            }
        }
    }

    // 행렬의 곱셈
    public void mulMatrix(Matrix mat) {
        if(checkPossibleMul(mat)) {
            matMul = new int[row][mat.getCol()];
            int[][] matB = mat.getMat();

            for (int i = ZERO; i < row; i++) {
                for (int j = ZERO; j < mat.getCol(); j++) {
                    for (int k = ZERO; k < col; k++) {
                        matMul[i][j] += this.mat[i][k] * matB[k][j];
                    }
                }
            }
        }
    }

    public void printMatrix() {
        for(int i = ZERO; i < row; i++) {
            for(int j = ZERO; j < col; j++) {
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.println();
        }
        System.out.println();
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

    public int[][] getMatAdd() {
        return matAdd;
    }

    public int[][] getMatMul() {
        return matMul;
    }
}