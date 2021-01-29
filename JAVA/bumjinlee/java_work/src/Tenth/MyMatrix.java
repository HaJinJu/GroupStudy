package Tenth;

public class MyMatrix {
    final int array2Matrix = 0;
    final int calcMatrix = 1;
    final int add = 2;
    final int subtract = 3;
    final int multiple = 4;

    private int[][] mat;
    private int i, j;
    private int column, row;
    private int[] userArr;

    public MyMatrix(int row, int column) {
        this.row    = row;
        this.column = column;

        mat = new int[row][column];
    }

    public MyMatrix(int[] userArr, int row, int column) {
        this.row    = row;
        this.column = column;

        this.userArr = userArr;
        mat = new int[row][column];
    }

    public MyMatrix(int[] userArr, int square) {
        this.row     = square;
        this.column  = square;

        this.userArr = userArr;
        mat = new int[row][column];
    }

    public int[][] getMat() {
        return mat;
    }

    public void array2Matrix() {

        if (row * column != userArr.length) {
            printError(array2Matrix); // 예외 처리는 초기화 단계에서 해주는게 좋다.
                                      // 조건을 만족하지 못하면 값을 할당하지도
                                      // 못하도록
            return;
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                mat[i][j] = userArr[i * row + j];
            }
        }
    }

    public void calcMatrix(int[][] matLeft, int[][] matRight, int calcOrder) {

        switch (calcOrder) {

            case add:
                if (matLeft.length != matRight.length) {
                    printError(calcMatrix);
                    return;
                }
                for (i = 0; i < row; i++) {
                    for (j = 0; j < column; j++) {
                        mat[i][j] = matLeft[i][j] + matRight[i][j];
                    }
                }
                break;

            case subtract:
                if (matLeft.length != matRight.length) {
                    printError(calcMatrix);
                    return;
                }
                for (i = 0; i < row; i++) {
                    for (j = 0; j < column; j++) {
                        mat[i][j] = matLeft[i][j] - matRight[i][j];
                    }
                }
                break;

            case multiple:
                int leftRow = matLeft.length;
                int leftColumn = matLeft[0].length;

                int rightRow = matRight.length;
                int rightColumn = matRight[0].length;

                mat = new int[leftRow][rightColumn];
                int key = 0;
                int a;

                for (i = 0; i < leftRow; i++) {

                    for (a = 0; a < rightColumn; a++) {

                        for (j = 0; j < rightRow; j++) {
                            key += (matLeft[i][j] * matRight[j][a]);
                        }
                        mat[i][a] = key;
                        key = 0;
                    }
                }
                break;
            default:
                break;
        }
    }

    public void printMatrix() {

        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.printf("%5d", mat[i][j]);
            }
            System.out.println("");
        }
    }

    private void printError(int errorCode) {

        switch (errorCode) {
            case array2Matrix:
                System.out.printf("Error Occurred\n" +
                        "Required array length: %d\n" +
                        "Provided array length: %d\n", row * column, userArr.length);
                break;

            case calcMatrix:
                System.out.println("Require: same matrix size");
                break;

            default:
                break;
        }

    }

    public void allocRandomMatrix() {
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                mat[i][j] = (int)(Math.random() * 10);
            }
        }
    }
}
//
