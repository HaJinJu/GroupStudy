package hw_2021_01_21;

import java.util.Scanner;

public class Test_02 {
    public static void main(String[] args) {
        System.out.println(
                "클래스를 사용하여 사용자 입력으로 점수를 받고 평균을 산출하는 프로그램을 작성해보자!\n");

        final int SUBJECTNUM = 3;

        ScannerTest st = new ScannerTest();

        st.insertScore();
        System.out.printf("평균점수: %.2f", st.calculateAverage(SUBJECTNUM));

    }
}
