package JAVA_2020_12_29_First;

public class IfTest {
    public static void main(String[] args) {
        int korean = 70;
        int english = 40;
        String test;
//		결과가 true false인 조건식을 넣어야한다.
        if (korean >= 60 && english >= 60) {
            test = "통과";
        } else {
            test = "과락";
        }
        System.out.println("korean: "+korean+", english: "+english+", 결과: "+test);
    }
}
