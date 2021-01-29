package FirstTest;

import java.util.Arrays;
import java.util.HashSet;

class AllocArr {
    // Test 12번 13번

    private final int RANGE = 50;
    private int[] arr;
    private int[] dupCheck;

    public AllocArr() {
        int randNum;

        arr = new int[RANGE];
        dupCheck = new int[RANGE];

        for (int i = 0;;) {
            randNum = (int)(Math.random() * RANGE);
            if (dupCheck[randNum] == 1) continue;

            arr[i] = randNum + 1;
            dupCheck[randNum] = 1;

            i++;

            if (i == RANGE) break;
        }
    }

    public void sortArr() {
        int numKey;
        int i, j;

        for (i = 1; i < RANGE; i++) {
            numKey = arr[i];

            for(j = i - 1; (j != -1) && (arr[j] > numKey); j--) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = numKey;
        }
    }

    @Override
    public String toString() {
        return "AllocArr{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}

public class Test12 {
    public static void main(String[] args) {
        AllocArr aa = new AllocArr();

        System.out.println(aa);

        aa.sortArr();

        System.out.println(aa);
    }
}
