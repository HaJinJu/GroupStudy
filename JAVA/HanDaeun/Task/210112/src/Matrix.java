public class Matrix {
    private int row, col;
    private int[][] mat;

    private int[][] calA;
    private int[][] calB;
    private int[][] sumArr;
    private int aRow, aCol;
    private int bRow, bCol;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int[row][col];
    }

    public Matrix(int[] arr, int row) {
        this.row = this.col = row;
        mat = new int[this.row][this.col];

        setMatrix(arr, this.row, this.col);
    }

    public Matrix(int[] arr, int row, int col) {
        this.row = row;
        this.col = col;
        mat = new int[this.row][this.col];

        setMatrix(arr, this.row, this.col);
    }

    public Matrix(int[] calA, int aRow, int aCol, int[] calB, int bRow, int bCol) {
        this.aRow = aRow;
        this.aCol = aCol;
        this.calA = new int[this.aRow][this.aCol];

        this.bRow = bRow;
        this.bCol = bCol;
        this.calB = new int[this.bRow][this.bCol];

    }

    public void setMatrix(int[] arr, int row, int col) {
        int divNum = 0;

        for(int i = 0; i < this.row; i++) {
            for(int j = 0; j < this.col; j++) {
                mat[i][j] = arr[i + j + divNum];
            }
            divNum += 2;
        }
    }

    public void allocRandomMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                mat[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    public void addMatrix(int[][] a, int[][] b) {
        if(a.length != b.length) {
            System.out.println("두 행렬의 행과 열의 수가 일치하지 않아 연산이 불가능합니다.");
            return;
        }

        sumArr = new int[a.length][a.length];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                sumArr[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public int[][] getSumArr() {
        return sumArr;
    }

    public void printMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%3d", mat[i][j]);
            }
            System.out.println("");
        }
    }
}
