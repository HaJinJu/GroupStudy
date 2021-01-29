package Test01;

class RandomArray {
    private int randomNum, start, end;
    private int[] randomArr, checkDup, arr;

    public RandomArray(int start, int end) {
        this.start = start;
        this.end = end;

        randomArr = new int[end];
        checkDup = new int[end];

        arr = new int[end];
        for(int i = 0; i < end; i++) {
            arr[i] = i + 1;
        }
    }

    public void setArray() {
        int cnt = 1;
        for (int i = 1; ; ) {
            int randomNum = (int) (Math.random() * end) + 1;

            if (checkDup[randomNum - 1] != 0) {
                continue;
            }

            randomArr[cnt - 1] = randomNum;

            checkDup[randomNum - 1] = 1;
            //System.out.printf("arr[%d] = %d\n", i++, randomNum);
            System.out.printf("arr[%d] = %d\n", i++, randomArr[cnt - 1]);

           if (cnt == end) {
                break;
            }
            cnt++;
        }


    }

    public void sortArray() {
        System.out.println("\n정렬 후 출력\n");
        int i, j, numKey, arrNumKey;
        for(i = 1; i < end; i++) {
            numKey = randomArr[i]; // 배열 값 번호
            arrNumKey = arr[i]; // 배열 인덱스 번호

            for(j = i - 1; (j != -1) && (randomArr[j] > numKey); j--) {
                randomArr[j + 1] = randomArr[j];
                arr[j + 1] =  arr[j];
            }

            randomArr[j + 1] = numKey;
            arr[j + 1] = arrNumKey;
        }
    }

    public void printArray() {
        for(int i = 0; i < end; i++) {
            System.out.printf("arr[%d] = %d\n", arr[i], randomArr[i]);
        }
    }
}

public class Test01_12 {
    public static void main(String[] args) {
        // 1 ~ 50까지의 숫자를 임의로 배열에 할당하고 출력해보자
        RandomArray ra = new RandomArray(1, 50);

        ra.setArray();
    }
}
