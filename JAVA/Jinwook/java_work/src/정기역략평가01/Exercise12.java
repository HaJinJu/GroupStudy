package 정기역략평가01;

import java.util.Arrays;

class RandomArray {
    private final int MAX = 50;
    private int randNum;
    private int[] arr;


    public void allocRandArr() {

        arr = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            randNum = (int) (Math.random() * 50) + 1;
            arr[i] = randNum;

        }
    }

    public void sortedArr() {
        arr = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            randNum = (int) (Math.random() * 50)+1;
            arr[i] = randNum;
        }

            for (int i = 0; i < arr.length; i++) { // i를 앞에 있는 수, j를 뒤에 있는 수로 선언하고 비교하기.
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {            // 앞에 있는 수 > 뒤에 있는 수 라면 실행.
                        int temp = arr[i];        // 앞에 있는 큰 값을 임시로 저장.
                        arr[i] = arr[j];        // 뒤에 있는 작은 값을 앞으로 이동.
                        arr[j] = temp;            // 앞에 있던 값을 뒤에다 넣음.
                    } else {
                        continue;
                    }
                }
            }

        }
        public void printRanArr(){
            for (int i = 0; i < MAX; i++) {

                System.out.printf("arr[%2d] = %d\n", i, arr[i]);

            }
        }
    }


public class Exercise12 {
    public static void main(String[] args) {
        RandomArray ra = new RandomArray();
        ra.allocRandArr();
        ra.printRanArr();

    }

}
