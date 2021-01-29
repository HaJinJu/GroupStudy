package FirstTest;

import java.util.Arrays;

class RandomArr {
    // Test 3번 19번

    private int[] randArr;
    private int randNum;

    public RandomArr(int end) {
        randNum = (int)(Math.random() * end) + 1;

        int randIndex = randNum;
        int randValue;

        randArr = new int[randIndex];

        for (int i = 0; i < randIndex; i++) {
            randNum = (int)(Math.random() * end) + 1;
            randValue = randNum;
            randArr[i] = randValue;
        }
    }

    @Override
    public String toString() {
        return "RandomArr{" +
                "randArr=" + Arrays.toString(randArr) +
                '}';
    }

    public void printDividedArr2OddAndEvenNum() {
        for (int i = 0; i < randArr.length; i++) {

            if (randArr[i] % 2 == 0) {
                System.out.println("짝수: " + randArr[i]);
            } else {
                System.out.println("홀수: " + randArr[i]);
            }

        }
    }
}

public class Test3 {
    public static void main(String[] args) {
        RandomArr ra = new RandomArr(20);

        System.out.println(ra);

        ra.printDividedArr2OddAndEvenNum();
    }
}
