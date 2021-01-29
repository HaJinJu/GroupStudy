package Seventeenth;

public class DoubleArray {
    private int row,col;
    private int [][] mat;
    private int [][] tmp;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int[][] getMat() {
        return mat;
    }

    public DoubleArray(int row, int col){
        this.row = row;
        this.col = col;
        mat = new int[row][col];

    }
    public void setMat(){

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
            mat[i][j] = (int)(Math.random()*5)+1;
                System.out.printf("%2d", mat[i][j]);
             }
            System.out.println("");
        }


    }

    public void addMatrix(DoubleArray mat) {

        int[][] srcMat = mat.getMat();

        for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    this.mat[i][j] = this.mat[i][j] + srcMat[i][j];
                }
        }

    }

    public void multiMatrix(DoubleArray mat){
        int[][] srcMat = mat.getMat();
        tmp =new int[row][col];
        int mat2 = 0;

        for (int i = 0; i < row; i++) {

            for (int k = 0; k < col; k++) {

                for (int j = 0; j < col; j++) {
                    mat2 += (this.mat[i][j] * srcMat[j][k]);
                }
                tmp[i][k]= mat2;
                mat2 = 0;

            }
        }
   }

    public void printMatrix() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%2d", mat[i][j]);
            }
            System.out.println("");
        }
    }
    public void printMatrix2() {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%3d", tmp[i][j]);
            }
            System.out.println("");
        }
    }




}
