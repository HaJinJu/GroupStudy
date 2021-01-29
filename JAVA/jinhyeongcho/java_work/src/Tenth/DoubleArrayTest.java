package Tenth;

class DoubleArray{
     int start;
     int end;
    int[][] mat;


    public DoubleArray(int start, int end){
        this.start = start;
        this.end = end;
        mat = new int[start][end];
    }

    public void allocRandomDoubleArray(){
        for (int i = 0; i < start; i++){
            for (int j =0 ; j<end; j++){
                mat[i][j] = (int) (Math.random()*10);
            }
        }
    }
    public void printArray(){
         //mat = new int[start][end];
        for (int i =0; i <start;i++){
            for(int j =0; j <end;j++){

                System.out.printf("%3d",mat[i][j]);
            }
            System.out.println("");
        }
    }


}

public class DoubleArrayTest {
    public static void main(String[] args) {
        //int[][] arr new int[][];
        int [][] arr = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        //  [0] [1] [2]
        //---------------------
        // | 1 | 0 | 0 |            [0]
        //---------------------
        // | 0 | 1 | 0 |            [1]
        //---------------------
        // | 0 | 0 | 1 |            [2]
        //---------------------

        for (int i =0; i <3; i++){
            for (int j = 0; j <3; j++){
                // 이중 배열의 경우 안쪽에 있는 녀석이 큰공간이다.
                // 바깥쪽에 있는 배열은 큰 공간을 다시 나눈 작은 공간이다.
                System.out.printf("%2d",arr[i][j]);
            }
            System.out.println("");
        }
        System.out.println("new를 통해 Heap에 할당하기");

        int[][] mat = new int[3][3];

        for (int i =0; i <3;i++){
            for(int j =0; j <3;j++){
                mat[i][j] = (i +1) * (j +1);
                System.out.printf("%2d",mat[i][j]);
            }
            System.out.println("");
        }

        System.out.println("클래스를 통해 할당하기");

        DoubleArray da = new DoubleArray(3,3);

        da.printArray();

        da.allocRandomDoubleArray();
        da.printArray();

    }
}


/* 연습문제 1.

    위의 이중 배열을 클래스를 통해 초기화 하도록 프로그래밍 해보자!
  ex)DoubleArray(3, 3) 형식으로 동작하고
    printArray()를 통해 결과를 확인하도록 한다.

 */