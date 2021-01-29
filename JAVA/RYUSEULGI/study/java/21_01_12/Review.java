public class Review {

    private int row;
    private int col;
    private int[][] mat;

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    public int[][] getMat() {
        return this.mat;
    }

    public Review(int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int[row][col];
    }

    public void allocRandomMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.println("");
        }
    }

    // Review class 사용
    public boolean checkDimension(Review mat1, Review mat2) {
        int rowA = mat1.getRow();
        int rowB = mat2.getRow();
        int colA = mat1.getCol();
        int colB = mat2.getCol();

        return (rowA == rowB) && (colA == colB);
    }

    public boolean checkMulDimension(Review mat1, Review mat2) {
        int rowB = mat2.getRow();
        int colA = mat1.getCol();

        return rowB == colA;
    }

    public void sumMatrix(Review mat1, Review mat2) {
        if (checkDimension(mat1, mat2)) {
            int[][] matA = mat1.getMat();
            int[][] matB = mat2.getMat();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = matA[i][j] + matB[i][j];
                }
            }
        }
    }

    public void subMatrix(Review mat1, Review mat2) {
        if (checkDimension(mat1, mat2)) {
            int[][] matA = mat1.getMat();
            int[][] matB = mat2.getMat();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j] = matA[i][j]  matB[i][j];
                }
            }
        }
    }

    public void mulMatrix(Review mat1, Review mat2) {
        if (checkMulDimension(mat1, mat2)) {
            int[][] matA = mat1.getMat();
            int[][] matB = mat2.getMat();

            mat[0][0] = matA[0][0] * matB[0][0] + matA[0][1] * matB[1][0] + matA[0][2] * matB[2][0];

            mat[0][1] = matA[0][0] * matB[0][1] + matA[0][1] * matB[1][1] + matA[0][2] * matB[2][1];

            mat[0][2] = matA[0][0] * matB[0][2] + matA[0][1] * matB[1][2] + matA[0][2] * matB[2][2];

            mat[1][0] = matA[1][0] * matB[0][0] + matA[1][1] * matB[1][0] + matA[1][2] * matB[2][0];

            mat[1][1] = matA[1][0] * matB[0][1] + matA[1][1] * matB[1][1] + matA[1][2] * matB[2][1];

            mat[1][2] = matA[1][0] * matB[0][2] + matA[1][1] * matB[1][2] + matA[1][2] * matB[2][2];

            mat[2][0] = matA[2][0] * matB[0][0] + matA[2][1] * matB[1][0] + matA[2][2] * matB[2][0];

            mat[2][1] = matA[2][0] * matB[0][1] + matA[2][1] * matB[1][1] + matA[2][2] * matB[2][1];

            mat[2][2] = matA[2][0] * matB[0][2] + matA[2][1] * matB[1][2] + matA[2][2] * matB[2][2];
        }
    }

    // -----------------------------------------------------------------

    private boolean checkDivideEmt(int len, int row) {
        if (len % row == 0) {
            this.row = row;
            this.col = len / row;
        } else {
            System.out.println("행렬로 변환 불가한 배열입니다.");
            return false;
        }
        return true;
    }

    private boolean checkAvailable(int[] arr, int row) {
        int len = arr.length;
        return checkDivideEmt(len, row);
    }

    private void sortMatrix(int[] arr, int row) {
        mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = arr[i * col + j];

            }
        }
    }

    public Review(int[] arr, int row) {
        if (checkAvailable(arr, row)) {
            sortMatrix(arr, row);
        }
    }

    // -----------------------------------------------------------------

    private boolean checkAvailable(int[] arr, int row, int col) {
        int len = arr.length;

        // boolean result = (len == row * col ? true : false);
        boolean result = (len == row * col);

        if (result) {
            this.row = row;
            this.col = col;
        }
        return result;
    }

    private void sortMatrix(int[] arr, int row, int col) {
        mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = arr[i * col + j];
            }
        }
    }

    public Review(int[] arr, int row, int col) {
        if (checkAvailable(arr, row, col)) {
            sortMatrix(arr, row, col);
        }
    }

    // -----------------------------------------------------------------

    private boolean checkAvailable(int[][] arr, int num) {
        row = arr.length;
        col = arr[0].length;
        int len = row * col;

        return checkDivideEmt(len, num);
    }

    private void sortMatrix(int[][] arr, int row) {
        mat = new int[row][col];

        int totalLen = row * col;
        int[] tmp = new int[totalLen];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                tmp[i * arr[0].length + j] = arr[i][j];
                // System.out.printf("tmp[%d] = %d\n",
                // i * arr[0].length + j,
                // tmp[i * arr[0].length + j]);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = tmp[i * col + j];
            }
        }
    }

    public Review(int[][] arr, int row) {
        if (checkAvailable(arr, row)) {
            sortMatrix(arr, row);
        }
    }

}