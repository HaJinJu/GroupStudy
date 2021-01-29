package Class20210112;

public class Calculate {
    private int[][] arrA = {{5, 2, 3, 8, 21},
                            {6, 10, 11, 9, 4}};
    private int[][] arrB = {{6, 1, 55, 17, 31},
                            {9, 15, 8, 29, 63}};
    public Calculate(){
    }
    public void addition() {
        for (int i = 0; i < arrA.length; i++) {

            for (int j = 0; j < arrA[i].length; j++) {
                arrA[i][j] += arrB[i][j];
                System.out.printf("arrA[%d][%d] + arrB[%d][%d] = %d\n", i, j, i, j, arrA[i][j]);
            }
        }
    }
    public void Subtract(){
        for(int i = 0; i < arrA.length; i++) {

            for (int j = 0; j < arrA[i].length; j++) {
                arrA[i][j] -= arrB[i][j];
                System.out.printf("arrA[%d][%d] - arrB[%d][%d] = %d\n", i, j, i, j, arrA[i][j]);
            }
        }
    }
    public void multiplication(){
        for(int i = 0; i < arrA.length; i++) {

            for (int j = 0; j < arrA[i].length; j++) {
                arrA[i][j] *= arrB[i][j];
                System.out.printf("arrA[%d][%d] x arrB[%d][%d] = %d\n", i, j, i, j, arrA[i][j]);
            }
        }
    }
}
