package Twelfth.TwelfthHomework;

import java.util.Scanner;

public class Player {
    private String myClass;
    private int grade;
    private int typeOfClass;
    private String id;

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setTypeOfClass(int typeOfClass) {
        this.typeOfClass = typeOfClass;
    }

    public Player() {
        Scanner scan = new Scanner(System.in);
        System.out.println("아이디를 입력해주세요");
        String id = scan.next();
        this.id = id;
        myClass = "모험가";
        grade = 0;
        typeOfClass = 0;

        System.out.println(id + " 님 환영합니다.");
    }

    public String getMyClass() {
        return myClass;
    }

    public int getGrade() {
        return grade;
    }

    public int getTypeOfClass() {
        return typeOfClass;
    }
}
