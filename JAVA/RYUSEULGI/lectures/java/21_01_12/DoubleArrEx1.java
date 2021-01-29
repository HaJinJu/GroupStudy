class Example {

    int[][] arr;
    int arrNum;

    public Example(int arrNum) {
        this.arrNum = arrNum;

        arr = new int[arrNum][arrNum];
    }

    public void doubleArr() {
        for (int i = 0; i < arrNum; i++) {
            for (int j = 0; j < arrNum; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
    }

    public void ranDoubleArr() {
        for (int i = 0; i < arrNum; i++) {
            for (int j = 0; j < arrNum; j++) {
                arr[i][j] = (int) (Math.random() * 4);
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < arrNum; i++) {
            for (int j = 0; j < arrNum; j++) {
                System.out.printf("%d", arr[i][j]);
            }
            System.out.println("");
        }
    }
}

public class DoubleArrEx1 {
    public static void main(String[] args) {

        Example ex = new Example(3);
        ex.doubleArr();
        ex.printArr();

        System.out.println("랜덤");
        ex.ranDoubleArr();
        ex.printArr();
    }
}
