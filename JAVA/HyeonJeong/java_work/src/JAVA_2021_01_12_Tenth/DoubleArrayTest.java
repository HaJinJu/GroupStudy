package JAVA_2021_01_12_Tenth;

class DoubleArray {
    int num;
    int num2;
    int[][] arr;
    public DoubleArray(int num, int num2) {
        this.num = num;
        this.num2 = num2;
        arr = new int[num][num2];
    }

    public void printArray() {
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num2; j++) {
                arr[i][j] = (i + 1) * (j + 1);
                System.out.printf("%2d",arr[i][j]);
            }
            System.out.println("");
        }
    }
}

public class DoubleArrayTest {
    public static void main(String[] args) {
        DoubleArray da = new DoubleArray(3,3);
        System.out.println("DoubleArray[3][3] =\n");
        da.printArray();
        //int[][] arr = new int[][];
//        int[][] arr = {
//                {1,0,0},
//                {0,1,0},
//                {0,0,1}
//        };
//
//        for(int i = 0; i < 3; i++) {
//            for(int j = 0; j <3; j++) {
//                // 이중 배열의 경우 안쪽에 있는 녀석이 큰 공간이다.
//                // 바깥쪽에 있는 배열은 큰 공간을 다시 나눈 작은 공간이다.
//                System.out.printf("%2d",arr[i][j]);
//            }
//            System.out.println("");
//        }
//        System.out.println("new를 통해 Heap에 할당하기");
//        int[][] mat = new int[3][3];
//
//        for(int i = 0; i < 3; i++) {
//            for(int j = 0; j < 3; j++) {
//                mat[i][j] = (i + 1) * (j + 1);
//                System.out.printf("%2d",mat[i][j]);
//            }
//            System.out.println("");
//        }
    }
}
