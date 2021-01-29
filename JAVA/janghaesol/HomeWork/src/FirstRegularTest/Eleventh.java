package FirstRegularTest;
class doubArr{
    int[][] arr1;
    int[][] arr2;
    int maxSize;
    int eachNum;


    public void firstArr(){
        eachNum = (int)(Math.random()*10);
        maxSize = 2;
       arr1 = new int[2][2];
       for(int i = 0 ; i < arr1.length; i ++){
           for(int j = 0; j < arr1[i].length;j++){
               arr1[i][j] = eachNum;
               eachNum += 1;
               System.out.printf("%3d",arr1[i][j]);
           }
           System.out.println("");
        }
    }

    public void secondArr(){
        eachNum = (int)(Math.random()*10);
        maxSize = 2;
        arr2 = new int [2][2];
        for(int i = 0 ; i < arr2.length; i ++){
            for(int j = 0; j < arr2[i].length;j++){
                arr2[i][j] = eachNum;
                eachNum += 2;
                System.out.printf("%3d",arr2[i][j]);
            }
            System.out.println("");
        }
    }

    public void sumArr(int[][] arr1, int[][] arr2) {
        int[][] sumFB = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[0].length; j++) {
                sumFB[i][j] = arr1[i][j] + arr2[i][j];
                System.out.printf("%5d",sumFB[i][j]);
            }
            System.out.println("");
        }
    }
}

public class Eleventh {
    //이중 배열을 사용하여 2 by 2 행렬의 덧셈을 프로그래밍 해보자!
    public static void main(String[] args) {
        doubArr dA = new doubArr();
        dA.firstArr();
        dA.secondArr();
        dA.sumArr(dA.arr1, dA.arr2);
    }
}
