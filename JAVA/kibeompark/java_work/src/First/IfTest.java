package First;

public class IfTest {
    public static void main(String[] args) {
        int kor = 70;
        int eng = 40;
        String str;

        if (kor >= 60 && eng >= 60) {
            str = "합격";
        } else {
            str = "불합격";
        }
        System.out.println("kor : " + kor + " , eng : " + eng + ", 결과 : " + str);
    }
}