package First;

public class DataTypeTest {
    public static void main(String[] args) {
        char ch = 'a';
        double kg = 49.5;
        int age = 18;
        boolean isMan = false;
        // 4 + 4. ==> i + d ==> d + d ==> d
        System.out.println(ch + 1);
        System.out.println(ch + kg);
//		System.out.println(ch + isMan);
        System.out.println("4" + "4");
        System.out.println(4 + 4);
        System.out.println('4' + '4');

        char ch2 = '4' + '4';
        System.out.println(ch2);

//		System.out.println(true + true);
        System.out.println((4 > 5) == true);
        System.out.println((4 > 5) == false);
    }
}