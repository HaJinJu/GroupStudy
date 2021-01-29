package 정기역략평가01;


class DementionalArr {
    private int row;
    private int col;
    private int[][] arrA = {{1, 2}, {3, 4}};
    private int[][] arrB = {{1, 2}, {3, 4}};
    private int[][] mat;

    public DementionalArr(int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int[row][col];

    }

    public void addArr() {
        arrA = getArrB();
        arrB = getArrA();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = arrA[i][j] + arrB[i][j];
            }
        }
    }


    public void mulArr() {
        arrA = getArrA();
        arrB = getArrB();
        mat = new int[arrA.length][arrA[0].length];


        mat[0][0] = arrA[0][0] * arrB[0][0] +
                arrA[0][1] * arrB[1][0];
        mat[0][1] = arrA[0][0] * arrB[0][1] +
                arrA[0][1] * arrB[1][1];


        mat[1][0] = arrA[1][0] * arrB[0][0] +
                arrA[1][1] * arrB[1][0];
        mat[1][1] = arrA[1][0] * arrB[0][1] +
                arrA[1][1] * arrB[1][1];


    }

    public int[][] getArrA() {
        return arrA;
    }

    public int[][] getArrB() {
        return arrB;
    }

    public void printArr() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%4d", mat[i][j]);
            }
            System.out.println("");
        }
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        DementionalArr da = new DementionalArr(2,2);
        da.addArr();
        da.printArr();
    }
}
