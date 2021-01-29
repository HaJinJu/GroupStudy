/*
        < Question 3 >
클래스를 사용하여 임의의 난수 배열을 생성하도록 프로그램을 작성한다.
*/


package Question3;

import ClassList.AllocArray;

public class Question3 {
    public static void main(String[] args) {
        AllocArray randArr = new AllocArray();

        randArr.AllocRandomArray();
        randArr.setRandomArrayValue();
        randArr.printArray();
    }
}