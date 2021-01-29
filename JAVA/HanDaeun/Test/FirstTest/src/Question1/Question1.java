/*
        < Question 1 >
클래스를 사용하여 사용자 입력을 받는 프로그램을 작성해보자!
*/


package Question1;

import ClassList.InputString;

public class Question1 {
    public static void main(String[] args) {
        final String INPUTANITHING = "아무거나 입력해보세요 : ";
        final String PRINTINPUT = "입력하신 내용은 : ";

        InputString in = new InputString();

        in.rcvInputStr(INPUTANITHING);
        System.out.println(PRINTINPUT + in.getInputStr());
    }
}