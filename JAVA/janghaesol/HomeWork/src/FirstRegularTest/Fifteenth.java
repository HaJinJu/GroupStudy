package FirstRegularTest;

class XarryUtility {
    int[][] arrone;
    int[][] arrTwo;
    int[][] mix;


    public void randomArrFirst() {
        arrone = new int[2][2];
        for (int i = 0; i < arrone.length; i++) {
            for (int j = 0; j < arrone[i].length; j++) {
                arrone[i][j] = (int) (Math.random() * 10) + 1;
                System.out.printf("%3d", arrone[i][j]);
            }
            System.out.println("");
        }
    }

    public void randomArrSecond() {
        arrTwo = new int[2][2];
        for (int i = 0; i < arrTwo.length; i++) {
            for (int j = 0; j < arrTwo[i].length; j++) {
                arrTwo[i][j] = (int) (Math.random() * 10) + 1;
                System.out.printf("%3d", arrTwo[i][j]);
            }
            System.out.println("");
        }
    }

    public void mixArr() {
        mix = new int[2][2];
        mix[0][0] = arrone[0][0]*arrTwo[0][0]+arrone[0][1]*arrTwo[1][0];
        mix[0][1] = arrone[0][0]*arrTwo[0][1]+arrone[0][1]*arrTwo[1][1];
        mix[1][0] = arrone[1][0]*arrTwo[0][0]+arrone[1][1]*arrTwo[1][0];
        mix[1][1] = arrone[1][0]*arrTwo[0][1]+arrone[1][1]*arrTwo[1][1];
        for (int i = 0; i < mix.length; i++) {
            for (int j = 0; j < mix[i].length; j++) {
                System.out.printf("%5d", mix[i][j]);
            }
            System.out.println("");
        }
    }
}
public class Fifteenth {
    //2 by 2 행렬의 곱셈을 수행하도록 프로그래밍 해보자!
    public static void main(String[] args) {
        XarryUtility xx = new XarryUtility();

        xx.randomArrFirst();
        xx.randomArrSecond();
        xx.mixArr();

    }
}
