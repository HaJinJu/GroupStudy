package Class20210112;

public class DobleArrEx1 {
    private int row, col;
    private int[][] mat;

    public DobleArrEx1(int row, int col) {
        this.row = row;
        this.col = col;

        mat = new int[row][col];
    }

    public void allocRandom() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                mat[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    public void print() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%3d", mat[i][j]);
            }
            System.out.println("");
        }
    }
}




