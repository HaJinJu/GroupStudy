public class Matrix {

    private int row;
    private int col;
    private int[][] arr;
    private int[][] arr2;
    private int[][] result;

    int numLen;
    int[] numberArr;
    int[][] matrixA;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;

        arr = new int[row][col];
        arr2 = new int[row][col];
    }

    public Matrix(int numLen) {
        this.numLen = numLen;

        numberArr = new int[numLen];

        for (int i = 0; i < numLen; i++) {
            numberArr[i] = (int) (Math.random() * 9);
        }
    }

    // 임의로 생성된 배열
    public void userArr() {
        for (int i = 0; i < numLen; i++) {
            System.out.printf("%2d", numberArr[i]);

        }
    }

    public void userArr2Matrix(int row) {
        this.row = row;
        
        int device = numLen / row;

        matrixA = new int[device][device];

        for (int i = 0; i < device; i++) {
            for (int j = 0; j < device; j++) {
                // i j devide활용하기
                // matrixA[i][j] = numberArr[];
                System.out.printf("%2d",matrixA[i][j]);
            }
            System.out.println("");
        }
    }

    public void twoRandomMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (int) (Math.random() * 4);
                arr2[i][j] = (int) (Math.random() * 4);
            }
        }
    }

    // 배열출력하는게 코드가 같으니 반복문 사용하여 리팩토링 하기
    public void printTwoMatrix() {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println("");
        }

        System.out.println("---------");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%2d", arr2[i][j]);
            }
            System.out.println("");
        }
    }

    public void sumMatrix() {
        System.out.println("---------");

        result = new int[3][3];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {

                result[i][j] = arr[i][j] + arr2[i][j];
                System.out.printf("%2d", result[i][j]);

            }
            System.out.println("");
        }
    }

    public void subMatrix() {

        System.out.println("---------");

        result = new int[arr.length][arr[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {

                result[i][j] = arr[i][j] - arr2[i][j];
                System.out.printf("%2d", result[i][j]);

            }
            System.out.println("");
        }
    }

    public void mutiplyMatrix() {

        System.out.println("---------");

        result = new int[arr.length][arr[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {

                result[i][j] = arr[i][j] * arr2[i][j];
                System.out.printf("%2d", result[i][j]);

            }
            System.out.println("");
        }
    }

}