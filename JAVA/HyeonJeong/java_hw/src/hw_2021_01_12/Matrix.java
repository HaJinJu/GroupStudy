package hw_2021_01_12;

public class Matrix {
    private int row, col;
    private int[][] matrix;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;

        matrix = new int[row][col];
    }

    public Matrix(int[][] arr, int row) {
        if(change_for_element(arr, row)) {
            matrix = new int[row][col];

            // 4 by 3      ===>     3 by 4
            // 1 2 3 4              1 2 3
            // 2 4 6 8              4 2 4
            // 3 6 9 12             6 8 3
            //                      6 9 12
            int totalLen = row * col;
            int[] tmp = new int[totalLen];

            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[0].length; j++) {
                    tmp[i * arr[0].length + j] = arr[i][j];
                }
            }

            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    matrix[i][j] = tmp[i * col + j];

                    //        j: 0 1 2 0 1 2 0 1 2
                    //        i: 0 0 0 1 1 1 2 2 2
                    //      arr: 0 1 2 3 4 5 6 7 8
                    //-----------------------------
                    // i*col+j : 0 1 2 3 4 5 6 7 8
                    // 0*3+0 = 0, 0*3+1 = 1, 0*3+2 = 2...
                    // 2*3+0 = 6, 2*3+1 = 7, 0*3+2 = 8
                }
            }
        }
    }

    public Matrix(int[] arr, int row) {
        if(change_for_element(arr, row)) {
            matrix = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    // 0 ~ 8:
                    // i                     = 0 ~ 2     x
                    // j                     = 0 ~ 2     x
                    // i + j                 = 0 ~ 4     x
                    // (i + 1)               = 1 ~ 3     x
                    // (i + 1) * j           = 0 ~ 6     x
                    // (i + 1) * (j + 1)     = 1 ~ 9     x
                    // (i + 1) * (j + 1) - 1 = 0 ~ 8     x
                    // (i + 1) * 3 + j       = 3 ~ 9 + j x
                    // i * 3 + j             = 0 ~ 8     o
                    matrix[i][j] = arr[i * col + j];
                }
            }
        }
    }

    public Matrix(int[] arr, int row, int col) {
        if(change_for_element(arr, row, col)) {
            System.out.println("A 처리 테스트");
            // 실제로 이 매서드 내의 모든 코드는
            // 단일 배열에서 넘어온 값들을 행렬로 변환한다는 취지를 가짐
            // 그러므로 동일하게 중복되는 코드들이 발생할 것이고
            // 별도의 매서드로 분리하여 관리할 수 있음
            matrix = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = arr[i * col + j];
                }
            }
        }
    }

    private boolean is_avilable_matrix(int length, int row) {
        if(length % row == 0) {
            this.row = row;
            this.col = length / row;
        } else {
            System.out.printf("행렬로 변환할 수 없습니다.\n");
            System.out.printf("올바른 차원을 입력하세요.\n");
            System.out.printf("혹은 적절한 숫자(행)를 입력하세요\n");
            return false;
        }
        return true;
    }

    private boolean change_for_element(int[] arr, int row, int col) {
        int length = arr.length;

        boolean result = (length == row * col ? true : false);

        if(result) {
            this.row = row;
            this.col = col;
        }

        return result;
    }

    private boolean change_for_element(int[][] arr, int num) {
        int row = arr.length;
        int col = arr[0].length;
        int length = row * col;

        return is_avilable_matrix(length, num);
    }

    private boolean change_for_element(int[] arr, int row) {
        int length = arr.length;

        /*
        if(len % row == 0) {
            this.row = row;
            this.col = len / row;
        } else {
            System.out.printf("행렬로 변환할 수 없습니다.\n");
            System.out.printf("올바른 차원을 입력하세요.\n");
            System.out.printf("혹은 적절한 숫자(행)를 입력하세요\n");
            return false;
        }
         */

        return is_avilable_matrix(length, row);
    }

    private boolean check_dimension(Matrix mat) {
        int row = mat.get_row();
        int col = mat.get_col();

        return (this.row == row) && (this.col == col);
    }

    private boolean check_dimension(Matrix A, Matrix B) {
        int Arow = A.get_row();
        int Brow = B.get_row();
        int Acol = A.get_col();
        int Bcol = B.get_col();

        return (Arow == Brow) && (Acol == Bcol);
        //
    }

    public void add_matrix(Matrix mat) {
        if(check_dimension(mat)) {
            int[][] srcMat = mat.get_matrix();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    this.matrix[i][j] = this.matrix[i][j] + srcMat[i][j];
                }
            }
        }
    }

    public void add_matrix(Matrix A, Matrix B) {
        if(check_dimension(A, B)) {
            int[][] matA = A.get_matrix();
            int[][] matB = B.get_matrix();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = matA[i][j] + matB[i][j];
                }
            }
        }
    }

    public void sub_matrix(Matrix mat) {
        if(check_dimension(mat)) {
            int[][] srcMat = mat.get_matrix();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    this.matrix[i][j] = this.matrix[i][j] - srcMat[i][j];
                }
            }
        }
    }

    public void sub_matrix(Matrix A, Matrix B) {
        if(check_dimension(A, B)) {
            int[][] matA = A.get_matrix();
            int[][] matB = B.get_matrix();

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    matrix[i][j] = matA[i][j] - matB[i][j];
                }
            }
        }
    }

    // n by m * n by m - 성립 불가
    // n by m * m by n: n by n
    public boolean check_mul_dimension(Matrix A, Matrix B) {
        int B_row = B.get_row();
        int A_col = A.get_col();

        return (B_row == A_col);
    }

    public void mul_matrix(Matrix A, Matrix B) {
        if(check_mul_dimension(A, B)) {
            int[][] matA = A.get_matrix();
            int[][] matB = B.get_matrix();

            // 00   01   02      00   01   02
            // 10   11   12      10   11   12
            // 20   21   22      20   21   22
            // 00 * 00 + 01 * 10 + 02 * 20: [0][0]
            // 00 * 01 + 01 * 11 + 02 * 21: [0][1]
            // 00 * 02 + 01 * 12 + 02 * 22: [0][2]

            // 10 * 00 + 11 * 10 + 12 * 20: [1][0]
            // 10 * 01 + 11 * 11 + 12 * 21: [1][1]
            // 10 * 02 + 11 * 12 + 12 * 22: [1][2]

            // 20 * 00 + 21 * 10 + 22 * 20: [2][0]
            // 20 * 01 + 21 * 11 + 22 * 21: [2][1]
            // 20 * 02 + 21 * 12 + 22 * 22: [2][2]
            matrix[0][0] = matA[0][0] * matB[0][0] +
                    matA[0][1] * matB[1][0] +
                    matA[0][2] * matB[2][0];
            matrix[0][1] = matA[0][0] * matB[0][1] +
                    matA[0][1] * matB[1][1] +
                    matA[0][2] * matB[2][1];
            matrix[0][2] = matA[0][0] * matB[0][2] +
                    matA[0][1] * matB[1][1] +
                    matA[0][2] * matB[2][2];
            // 10 * 00 + 11 * 10 + 12 * 20: [1][0]
            // 10 * 01 + 11 * 11 + 12 * 21: [1][1]
            // 10 * 02 + 11 * 12 + 12 * 22: [1][2]
            matrix[1][0] = matA[1][0] * matB[0][0] +
                    matA[1][1] * matB[1][0] +
                    matA[1][2] * matB[2][0];
            matrix[1][1] = matA[1][0] * matB[0][1] +
                    matA[1][1] * matB[1][1] +
                    matA[1][2] * matB[2][1];
            matrix[1][2] = matA[1][0] * matB[0][2] +
                    matA[1][1] * matB[1][2] +
                    matA[1][2] * matB[2][2];
            // 20 * 00 + 21 * 10 + 22 * 20: [2][0]
            // 20 * 01 + 21 * 11 + 22 * 21: [2][1]
            // 20 * 02 + 21 * 12 + 22 * 22: [2][2]
            matrix[2][0] = matA[2][0] * matB[0][0] +
                    matA[2][1] * matB[1][0] +
                    matA[2][2] * matB[2][0];
            matrix[2][1] = matA[2][0] * matB[0][1] +
                    matA[2][1] * matB[1][1] +
                    matA[2][2] * matB[2][1];
            matrix[2][2] = matA[2][0] * matB[0][2] +
                    matA[2][1] * matB[1][2] +
                    matA[2][2] * matB[2][2];
        }
    }

    public void allocate_random_matrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    public int get_row() {
        return row;
    }

    public int get_col() {
        return col;
    }

    public int[][] get_matrix() {
        return matrix;
    }

    // n by n 행렬의 판별식
    // ex) 3 by 3
    // 1    2    3
    // 4    5    6  =====>
    // 7    8    9
    //
    // 1 * {(5 * 9) - (6 * 8)} +
    // 2 * {(6 * 7) - (4 * 9)} +
    // 3 * {(4 * 8) - (5 * 7)}
    // 이 결과가 0 이 아니면 역행렬이 존재한다.

    public void print_matrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println("");
        }
    }
}