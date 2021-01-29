package JAVA_2020_12_29_First;

public class DataTypeTest {
    public static void main(String[] args) {
        char ch = 'a';
        double kg = 49.5;
        int age = 18;
        boolean isMan = false;
        // Boolean의 변수명을 사용할때 is00을 사용한다.

        System.out.println(ch + 1);
        System.out.println(ch + kg);
//		System.out.println(ch + isMan);
//		주석 단축키 'ctrl'+'/'
        System.out.println("4" + "4");
        System.out.println('4' + '4');
        System.out.println(4 + 4);
        char ch2 = '4' + '4';
        System.out.println(ch2);

//		System.out.println(true + true);
        System.out.println((4 > 5) == true);
        System.out.println((4 > 5) == false);
    }
}
