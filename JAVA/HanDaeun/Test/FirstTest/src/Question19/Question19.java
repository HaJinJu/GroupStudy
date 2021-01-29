/*
        < Question 19 >
임의의 난수들을 임의의 배열 크기에 저장하도록 한다.
그리고 이 값들을 출력해보자!
또한 여기서 짝수만 따로 홀수만 따로 출력할 수 있게 매서드를 작성해보도록 한다.
*/


package Question19;

import ClassList.AllocArray;

public class Question19 {
    public static void main(String[] args) {
        AllocArray randArr = new AllocArray();

        randArr.AllocRandomArray();
        randArr.setRandomArrayValue();
        randArr.printArray();

        randArr.printEvenArrayValue();
        randArr.printOddArrayValue();
    }
}