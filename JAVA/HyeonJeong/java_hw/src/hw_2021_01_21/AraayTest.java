package hw_2021_01_21;

import java.util.Arrays;

public class AraayTest {

    private int[] array;
    private int randomNum;

    public AraayTest(int num) {

        array = new int[num];
    }

    public AraayTest() {
        int randomNum = (int)(Math.random() * 10) + 1;
        // 난수 0이 나오는것을 피하기 위해 + 1 을 하였다.

        array = new int[randomNum];
    }

    public int[] setArray() {
        for(int i = 0; i < array.length; i++) {
            randomNum = (int)(Math.random() * 50) + 1;
            array[i] = randomNum;
        }
        return array;
    }

    public int[] insortNum() {
        Arrays.sort(array);
        return array;
    }

    public void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public void printOddNum(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("");
    }

    public void printEvenNum(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("");
    }
}
