package ClassList;

import java.util.HashSet;

public class AllocArray {
    private final String PRINTSORT = "\n오름차순으로 정렬할 경우 :";
    private final String PRINTEVEN = "\n\n짝수인 수만 출력할 경우 :";
    private final String PRINTODD = "\n\n홀수인 수만 출력할 경우 :";
    private final int ZERO = 0;
    private final int ONE = 1;
    private final int EVEN = 2;
    private final int LINEBREAK = 5;

    private final int ARRAYSIZE = 50;
    // 1 ~ 20 사이의 랜덤한 수의 배열 생성
    private final int ARANGESTART = 1;
    private final int ARANGEEND = 20;
    // 1 ~ 50 사이의 랜덤한 수를 배열에 저장
    private final int VRANGESTART = 1;
    private final int VRANGEEND = 50;

    private int[] arr;
    private HashSet<Integer> checkDup;


    // 특정한 크기의 배열을 생성
    public void AllocArr() {
        arr = new int[ARRAYSIZE];
    }

    // 랜덤한 크기의 배열을 생성
    public void AllocRandomArray() {
        int arrRange = ARANGEEND - ARANGESTART + ONE;
        int randArrNum = (int)(Math.random() * arrRange) + ARANGESTART;

        arr = new int[randArrNum];
    }

    // 랜덤한 값을 배열에 저장
    public void setRandomArrayValue() {
        int valueRange = VRANGEEND - VRANGESTART + ONE;

        for(int i = ZERO; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * valueRange) + VRANGESTART;
        }
    }

    // 랜덤한 값을 중복없이 배열에 저장
    public void setRandomNoDupArrayValue() {
        int valueRange = VRANGEEND - VRANGESTART + ONE;
        int randNum;
        checkDup = new HashSet<>();

        for(int i = ZERO; i < arr.length; ) {
            randNum = (int)(Math.random() * valueRange) + VRANGESTART;

            if(!checkDup.contains(randNum)) {
                arr[i++] = randNum;
                checkDup.add(randNum);
            }
        }
    }

    // 삽입정렬 사용하여 오름차순 정렬
    public void insertionSort() {
        int i, j;
        int key;

        System.out.println(PRINTSORT);

        for(i = ONE; i < arr.length; i++) {
            key = arr[i];

            for(j = i - ONE; j >= ZERO; j--) {
                if(arr[j] > key) {
                    arr[j + ONE] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + ONE] = key;
        }
    }

    public void printArray() {
        int cnt = ZERO;

        for(int i = ZERO; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
            cnt++;

            if(cnt % LINEBREAK == ZERO) {
                System.out.println();
            }
        }
    }

    // 짝수인 수만 출력
    public void printEvenArrayValue() {
        System.out.println(PRINTEVEN);

        int cnt = ZERO;

        for(int i = ZERO; i < arr.length; i++) {
            if(arr[i] % EVEN == ZERO) {
                System.out.printf("%4d", arr[i]);
            } else {
                System.out.print("    ");
            }
            cnt++;

            if(cnt % LINEBREAK == ZERO) {
                System.out.println();
            }
        }
    }

    // 홀수인 수만 출력
    public void printOddArrayValue() {
        System.out.println(PRINTODD);

        int cnt = ZERO;

        for(int i = ZERO; i < arr.length; i++) {
            if(arr[i] % EVEN != ZERO) {
                System.out.printf("%4d", arr[i]);
            } else {
                System.out.print("    ");
            }
            cnt++;

            if(cnt % LINEBREAK == ZERO) {
                System.out.println();
            }
        }
    }
}