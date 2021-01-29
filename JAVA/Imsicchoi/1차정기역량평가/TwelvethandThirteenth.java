package FirstRegularTest;
//12. 1 ~ 50 까지의 숫자를 임의로 배열에 할당하고 출력해보자!
//13. 위의 문제에서 할당한 배열을 다시 정렬하여 출력해보도록 한다.

import java.util.Arrays;

class arrFifty {
    private final int RANGESTART = 1;
    private final int RANGEEND = 50;
    private int[] arr, checkDup;
    private final int ARRAYSIZE = 50;

    public void AllocArr() {
        arr = new int[ARRAYSIZE];

    }

    public void AllocRandArr() {
        int arrRange = RANGEEND - RANGESTART + 1;
        int randArrnum = (int) (Math.random() * arrRange) + 1;

        arr = new int[randArrnum];
    }

    public void setRandomArr() {
        int arrContents = RANGEEND - RANGESTART + 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arrContents) + 1;

        }
    }

    public void printArr() {
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
            cnt++;
            if (cnt % 10 == 0) {
                System.out.println("");
            }
        }
    }

    public int[] organize(){
        Arrays.sort(arr);
        return arr;


    }

    public static class Twelveth {
        public static void main(String[] args) {
            arrFifty af = new arrFifty();

            af.AllocArr();
            af.setRandomArr();
            af.printArr();
            af.organize();

        }
    }
}
