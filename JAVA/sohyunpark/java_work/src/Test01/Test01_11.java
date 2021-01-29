package Test01;

class TwoMatrix {
    private int[][] A;
    private int[][] B;
    private int[][] sum, multi;

    public TwoMatrix() {
        A = new int[2][2];
        B = new int[2][2];
        sum = new int[2][2];
        multi = new int[2][2];
    }

    public void setMatrix() {
        System.out.println("<행렬 A>");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = (int) (Math.random() * 10);
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println("");
        }

        System.out.println("\n<행렬 B>");
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

    public void multiMatrix(int[][] arr, int[][] arr2) {
        System.out.println("\n<행렬의 곱셈>");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 2; k++) {
                    multi[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
//        arr[0][0] = arr1[0][0]*arr2[0][0] + arr1[0][1]*arr2[1][0];
//        arr[0][1] = arr1[0][0]*arr2[0][1] + arr1[0][1]*arr2[1][1];
//        arr[1][0] = arr1[1][0]*arr2[0][0] + arr1[1][1]*arr2[1][0];
//        arr[1][1] = arr1[1][0]*arr2[0][1] + arr1[1][1]*arr2[1][1];
    }

    public void printMatrix(int[][] arr) {
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println("");
        }
    }

    public int[][] getA() {
        return A;
    }

    public int[][] getB() {
        return B;
    }

    public int[][] getMulti() {
        return multi;
    }
}

public class Test01_11 {
    public static void main(String[] args) {
        // 이중 배열을 사용하여 2 by 2 행렬의 덧셈을 프로그래밍 해보자
        TwoMatrix tm = new TwoMatrix();

        tm.setMatrix();
        tm.addMatrix(tm.getA(), tm.getB());
    }
}
