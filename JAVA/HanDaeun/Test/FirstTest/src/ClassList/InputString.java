package ClassList;

import java.util.Scanner;

public class InputString {
    Scanner scan;
    private String inputStr;

    // 생성자 : 스캔 준비
    public InputString() {
        setScan();
    }

    public void setScan() {
        scan = new Scanner(System.in);
    }

    // inputMsg 를 통해 무엇을 입력할지 알려주고 입력값은 inputStr 에 저장
    public void rcvInputStr(String inputMsg) {
        System.out.print(inputMsg);
        inputStr = scan.nextLine();
    }

    public String getInputStr() {
        return inputStr;
    }
}