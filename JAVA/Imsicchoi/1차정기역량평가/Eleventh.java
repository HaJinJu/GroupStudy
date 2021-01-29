package FirstRegularTest;
//11. 이중 배열을 사용하여 2 by 2 행렬의 덧셈을 프로그래밍 해보자!
class Matrix{
    private int [][]A;
    private int [][]B;
    private int [][]sum;

    public Matrix(){
        A = new int[2][2];
        B = new int[2][2];
        sum = new int[2][2];
    }
    public void setMatrix() {
        System.out.println("행렬A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = (int) (Math.random() * 10);
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println("");
        }
        System.out.println("행렬B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = (int) (Math.random() * 10);
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println("");
        }
    }
    public void addMatrix(int[][] arr, int[][] arr2) {
        System.out.println("\n<행렬의 덧셈>");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = arr[i][j] + arr2[i][j];
                System.out.printf("%3d", sum[i][j]);
            }
            System.out.println("");
        }
    }
        public void printMat(int[][] arr){
            for (int i = 0 ;i < 2; i++){
                for(int j = 0; j < 2; j++){
                    System.out.printf("%3d",arr[i][j]);
                }
                System.out.println("");
            }
        }
        public int [][] getA(){
        return A;
        }
        public int [][] getB(){
        return B;
        }
    }

public class Eleventh {
    public static void main(String[] args) {
        Matrix M = new Matrix();

        M.setMatrix();
        M.addMatrix(M.getA(),M.getB());
    }
}
