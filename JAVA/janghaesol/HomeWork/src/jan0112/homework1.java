/*
package jan0112;
class pricelessMatrix {
    private final int maxRow, Max, space;
    private final int[][] zip;
    private final int[] array;


    public pricelessMatrix(int space, int maxRow, int Max) {
        this.space = space;
        this.maxRow = maxRow;
        this.Max = Max;
        array = new int[space];
        zip = new int[maxRow][Max];
    }

    public void GiveNum{
    int[][] zip = new int[3][3];

        for(int i = 0; i < maxRow; i++) {
            for (int j = 0; j < Max; j++) {
                zip[i][j] = (i + 1) * (j + 1);
                System.out.printf("%2d", zip[i][j]);
            }
            System.out.println("");
        }



    public void printpricelessMatrix(){
        int[][] zip = new int[maxRow][Max];
        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < Max; j++) {
                zip[i][j] = (i + 1) * (j + 1);
                System.out.printf("%d", zip[i][j]);
            }
            System.out.println("");


        }
    }
}









class pricelessMatrix {
    private final int maxRow, Max;
    private int fisrt, second, third;
    private final int[][] zip;
    

    public pricelessMatrix(int maxRow, int Max) {
        this.maxRow = maxRow;
        this.Max = Max;

        //zip = new int[][]{{first, second},{first,second,third}};
        zip = new int[maxRow][Max];
    }
    
    public static void arrayMatrix(int first,int second, int third) {
        int[][] array = { {{1,2,3,4,5,6,7,8,9},}};

    }
    public void printpricelessMatrix() {

        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < Max ; j++) {
                
                System.out.printf("%d", zip[i][j]);
            }
            System.out.println("");



            }

 */
    /*
    public void pricelessMatrixA(){

        for (int i = 0; i < maxRow; i++) {
            for (int j = 0; j < Max; j++) {
                mat[i][j] = maxRow,Max;
            }
        }
    }
*/


    /*
    오늘 만든 Matrix 클래스를 개조하여
   사용자의 배열을 입력받아 행렬을 만들도록 개조해보자!
   실제 matlab의 풀 라이센스 가격은
   수십억 ~ 백억 이상 되는 소프트웨어다.
ex) numpy나 matlab이라는 파이썬 라이브러리
    혹은 소프트웨어에 존재하는 기능으로
    아래와 같은 것이 되게 만드는 것이다.

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Matrix A = new Matrix(arr, 3, 3);
    혹은
    Matrix A = new Matrix(arr, 3);
    둘 다 동작이 되어야 할 것이다.
     */




