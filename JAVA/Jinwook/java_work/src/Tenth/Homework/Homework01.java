package Tenth.Homework;
// 1. 오늘 만든 Matrix 클래스를 개조하여
//    사용자의 배열을 입력받아 행렬을 만들도록 개조해보자
//  ex) numpy 나 matlab이라는 파이썬 가이브러리 혹은 소프트웨어에 존재하는 기능으로 아래와 같은 거시 되게 만드는 것이다
//      실제 matlab의 풀 라이센스 가격은 수십억 !백억 이상 되는 소프트웨어다
//      int[] arr = {1,2,3,4,5,6,7,8,9};
//      Matrix A = new Matrix(arr,3,3);
//      혹은
//      Matrix A = new Matrix(arr,3);
//      둘다 작동되어야 할 것이다.
class ControlArray {
    private int arrNum;
    private int leftNum;
    private int rightNum;
    int[][] arr;
    int inputNum;

    public ControlArray(int arrNum, int leftNum, int rightNum) {
        this.arrNum = arrNum;
        this.leftNum = leftNum;
        this.rightNum = rightNum;

        arr = new int[leftNum][rightNum];
    }


    public void allocInputArr() {

        for (int i = 0; i < arrNum; i++) {
            inputNum = i + 1;
            System.out.println(inputNum);
            for (int j = 0; j < leftNum; j++) {
                for (int k = 0; k < rightNum; k++) {
                    arr[j][k] = (j + k);
                }
            }
        }
    }
    public void printControlArr() {

        for (int j = 0; j < leftNum; j++) {
            for (int k = 0; k < rightNum; k++) {
                System.out.printf("%3d", arr[j][k]);
            }
            System.out.println("");
        }
    }
//    public void delColumn(int arrNum, int leftNum){
//        arr =new int[leftNum][];
//        for(int i = 0; i < arr[].length)
//        arr[0]= new int[1];
//        for()
//
//    }
}




    public class Homework01 {
        public static void main(String[] args) {
            ControlArray ca = new ControlArray(9,3,3);
            ca.allocInputArr();
            ca.printControlArr();


        }
    }
