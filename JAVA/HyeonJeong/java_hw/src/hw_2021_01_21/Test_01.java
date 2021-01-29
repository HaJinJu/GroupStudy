package hw_2021_01_21;

import java.util.Scanner;

public class Test_01 {
    public static void main(String[] args) {
        System.out.println(
                "클래스를 사용하여 사용자 입력을 받는 프로그램을 작성해보자!\n");

        ScannerTest st = new ScannerTest();

        st.insertString();
        st.insertInteger();
    }
}
