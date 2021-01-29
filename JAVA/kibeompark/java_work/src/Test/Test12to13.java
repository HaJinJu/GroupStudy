package Test;

class RandomAllocArr {
    private final int RANGE = 50;
    private int[] randArr, check;

    public RandomAllocArr() {
        int randNum;

        randArr = new int[RANGE];
        check = new int[RANGE];

        for (int i = 0; ; ) {
            randNum = (int) (Math.random() * RANGE) + 1;

            if (check[randNum - 1] != 0) {
                continue;
            }

            check[randNum - 1] = 1;
            randArr[i++] = randNum;

            if (i == RANGE) break;
        }
    }

    public void insertSort() {
        int i, j, num;

        for (i = 1; i < RANGE; i++) {
            num = randArr[i];

            for (j = i - 1; j >= 0 && randArr[j] > num; j--) {
                if (randArr[j] > num) {
                    randArr[j + 1] = randArr[j];
                }

                randArr[j] = num;
            }
        }
    }

    public void printArr() {
        int cnt = 1;

        for (int i = 0; i < RANGE; i++) {
            System.out.printf("%3d", randArr[i]);

            if (cnt % 10 == 0) System.out.println();

            cnt++;
        }
    }
}

public class Test12to13 {
    public static void main(String[] args) {
        // 1 ~ 50 까지의 숫자를 임의로 배열에 할당하고 출력해 보자 !
        // 위의 문제에서 할당한 배열을 다시 정렬하여 출력해 보도록 한다.
        RandomAllocArr raa = new RandomAllocArr();

        System.out.println("정렬 전");
        raa.printArr();
        System.out.println();

        System.out.println("정렬 후");
        raa.insertSort();
        raa.printArr();
    }
}
