/*
        < Question 12 >
1 ~ 50 까지의 숫자를 임의로 배열에 할당하고 출력해보자!
*/


package Question12;

import ClassList.AllocArray;

public class Question12 {
    public static void main(String[] args) {
        AllocArray arr = new AllocArray();

        arr.AllocArr();
        arr.setRandomNoDupArrayValue();
        arr.printArray();
    }
}