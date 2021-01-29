package Test;

class MyArray {
    private int randNum;
    private int[] numArr;

    public MyArray() {
        randNum = (int) (Math.random() * 10) + 1;
        numArr = new int[randNum];
    }

    public void PrintRandomArrayQuiz3() {
        System.out.println("Quiz 3번");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10) + 1;
            System.out.printf("arr[%d] %d \n", i, numArr[i]);
        }
    }
    
    public void PrintRandomArray() {
        System.out.println("Quiz 19번");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10) + 1;

            System.out.printf("numArr[%d], = %d \n", i, numArr[i]);
        }
    }

    public void PrintOddArray(int oddNum) {
        System.out.println("Quiz 19번");
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10) + 1;
            if (numArr[i] % oddNum == 0) {

                System.out.printf("numArr[%d], = %d \n", i, numArr[i]);
            }
        }
    }

    public void PrintEvenArray(int evenNum) {
        System.out.println("Quiz 19번");
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % evenNum != 0) {

                System.out.printf("numArr[%d], = %d \n", i, numArr[i]);
            }
        }
    }
}