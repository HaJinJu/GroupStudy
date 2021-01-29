/*
        < Question 13 >
위의 문제에서 할당한 배열을 다시 정렬하여 출력해보도록 한다.
*/


package Question13;

import ClassList.AllocArray;

public class Question13 {
    public static void main(String[] args) {
        AllocArray arr = new AllocArray();

        arr.AllocArr();
        arr.setRandomNoDupArrayValue();
        arr.printArray();

        arr.insertionSort();
        arr.printArray();
    }
}