package Tenth;

public class Matrix {
    private int row, col;
    private int[][] mat;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int[row][col];
    }

    public Matrix(int[][] arr, int row) {
        if(checkAvailable(arr, row)) {
            mat = new int[row][col]; // 4 3

            // 4 by 3      ===>      3 by 4
            // 1 2 3 4               1 2 3
            // 2 4 6 8               4 2 4
            // 3 6 9 12              6 8 3
            //                       6 9 12
            int totallen = row * col; // 12
            int[] tmp = new int[totallen];

            System.out.println("arr.length = " + arr.length); // 3
            for(int i = 0; i < arr.length; i++) { // 3
                for(int j = 0; j < arr[0].length; j++) { // 4
                    tmp[i * arr[0].length + j] = arr[i][j];
                }
            } // 1차원 배열로

            for(int i = 0; i < row; i++) { // 4
                for (int j = 0; j < col; j++) { // 3
                    mat[i][j] = tmp[i * col + j];
                }
            } // 2차원 배열
        }
    }

    public Matrix(int[] arr, int row) {
        if(checkAvailable(arr, row))  {
            mat = new int[row][col];

            for (int i = 0; i < row; i++){
                for (int j = 0; j < col; j++) {
                    mat[i][j] = arr[i * col + j];
                }
            }
        }
    }

    public Matrix(int[] arr, int row, int col) {
        if(checkAvailable(arr, row, col)) {
            System.out.println("A 처리 테스트");
            // 실제로 이 메서드 내의 모든 코드는
            // 단일 배열에서 넘어온 값들을 행렬로 변환한다는 취지를 가짐
            // 그러므로 동일하게 중복되는 코드들이 발생할 것이고
            // 별도의 매서드로 분리하여 관리할 수 있음
            mat = new int[row][col];

            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    mat[i][j] = arr[i * col + j];
                }
            }
        }
    }

    private boolean checkDivdeElement(int len, int row) { // 12 4
        if (len % row == 0) {
            this.row = row; // 4
            this.col = len / row; // 3
        } else {
            System.out.printf("행렬로 변환할 수 없습니다.\n");
            System.out.printf("올바른 차원을 입력하세요.\n");
            System.out.printf("혹은 적절한 숫자(행)를 입력하세요.\n");
            return false;
        }

        return true;
    }

    private boolean checkAvailable(int[] arr, int row, int col) {
        int len = arr.length;

        boolean res = (len == row * col ? true : false);

        if(res) {
            this.row = row;
            this.col = col;
        }
        return res;
    }

    private boolean checkAvailable(int[][] arr, int num) {
        int row = arr.length; // 3
        int col = arr[0].length; // 4
        int len = row * col; // 12
        System.out.printf("[][] row = %d, col = %d\n", row, col);

        return checkDivdeElement(len, num); // 12 4
    }

    private boolean checkAvailable(int[] arr, int row) {
        int len = arr.length;

        return  checkDivdeElement(len, row);
    }

    public boolean checkDimension(Matrix A, Matrix B) {
        int Arow = A.getRow();
        int Brow = B.getRow();
        int Acol = A.getCol();
        int Bcol = B.getCol();

        return (Arow == Brow) && (Acol == Bcol);
    }

    public boolean checkDimension(Matrix mat) {
        int row = mat.getRow();
        int col = mat.getCol();

        return (this.row == row) && (this.col == col);
    }

    public void addMatrix(Matrix A, Matrix B) {
        if(checkDimension(A, B)) {
            int[][] matA = A.getMat();
            int[][] matB = B.getMat();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = matA[i][j] + matB[i][j];
                }
            }
        }
    }

    public void addMatrix(Matrix mat) {
        if(checkDimension(mat)) {
            int[][] srcMat = mat.getMat();

            for (int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    this.mat[i][j] = this.mat[i][j] + srcMat[i][j];
                }
            }
        }
    }

    public void subMatrix(Matrix A, Matrix B) {
        if(checkDimension(A, B)) {
            int[][] matA = A.getMat();
            int[][] matB = B.getMat();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col;j++) {
                    mat[i][j] = matA[i][j] - matB[i][j];
                }
            }
        }
    }

    public void subMatrix(Matrix mat) {
        if(checkDimension(mat)) {
            int[][] srcMat = mat.getMat();

            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    this.mat[i][j] = this.mat[i][j] - srcMat[i][j];
                    //      A      =        A       -      B
                }
            }
        }
    }

    // n by m * n by m - 성립 불가
    // n by m * m by n : n by n
    public boolean checkMulDimension(Matrix A, Matrix B) {
        int Acol = A.getCol();
        int Brow = B.getRow();

        return (Brow == Acol);
    }

    public void mulMatrix(Matrix A, Matrix B) {
        if(checkMulDimension(A, B)) {
            int[][] matA = A.getMat();
            int[][] matB = B.getMat();

            // 00   01   02      00   01   02
            // 10   11   12      10   11   12
            // 20   21   22      20   21   22
            // 00 * 00 + 01 * 10 + 02 * 20 : [0][0]
            // 00 * 01 + 01 * 11 + 02 * 21 : [0][1]
            // 00 * 02 + 01 * 12 + 02 * 22 : [0][2]

            // 10 * 00 + 11 * 10 + 12 * 20 : [1][0]
            // 10 * 01 + 11 * 11 + 12 * 21 : [1][1]
            // 10 * 02 + 11 * 12 + 12 * 22 : [1][2]

            // 20 * 00 + 21 * 10 + 22 * 20 : [2][0]
            // 20 * 01 + 21 * 11 + 22 * 21 : [2][1]
            // 20 * 02 + 21 * 12 + 22 * 22 : [2][2]
            mat[0][0] = matA[0][0] * matB[0][0] +
                    matA[0][1] * matB[1][0] +
                    matA[0][2] * matB[2][0];
            mat[0][1] = matA[0][0] * matB[0][1] +
                    matA[0][1] * matB[1][1] +
                    matA[0][2] * matB[2][1];
            mat[0][2] = matA[0][0] * matB[0][2] +
                    matA[0][1] * matB[1][2] +
                    matA[0][2] * matB[2][2];
            mat[1][0] = matA[1][0] * matB[0][0] +
                    matA[1][1] * matB[1][0] +
                    matA[1][2] * matB[2][0];
            mat[1][1] = matA[1][0] * matB[0][1] +
                    matA[1][1] * matB[1][1] +
                    matA[1][2] * matB[2][1];
            mat[1][2] = matA[1][0] * matB[0][2] +
                    matA[1][1] * matB[1][2] +
                    matA[1][2] * matB[2][2];
            mat[2][0] = matA[2][0] * matB[0][0] +
                    matA[2][1] * matB[1][0] +
                    matA[2][2] * matB[2][0];
            mat[2][1] = matA[2][0] * matB[0][1] +
                    matA[2][1] * matB[1][1] +
                    matA[2][2] * matB[2][1];
            mat[2][2] = matA[2][0] * matB[0][2] +
                    matA[2][1] * matB[1][2] +
                    matA[2][2] * matB[2][2];
        }
    }


    public void allocRandomMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                mat[i][j] = (int)(Math.random() * 10);
            }
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