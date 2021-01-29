public class OpTest {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a;
        System.out.println(a + " , " + b);
        a = 5;
        int c = a = a + 1;
        System.out.println(a + " , " + c);

        a = 5;
        b = a++;
        System.out.println(a + " , " + b);

        a = 5;
        c = a;
        a = a + 1;
        System.out.println(a + " , " + c);

        a = 5;
        a++;
        System.out.println(a);

        a = 5;
        ++a;
        System.out.println(a);

        a = 5;
        System.out.println(a++);
        System.out.println("a===>" + a);

        a = 5;
        System.out.println(++a);
        System.out.println("a===>" + a);

/*		int a = 5;
		int b = --a;
		System.out.println(a + " , " + b);
		a = 5;
		int c = a = a - 1;
		System.out.println(a + " , " + c);
*/

        boolean isMan = false;

        String sexStr = (isMan) ? "남자" : "여자";
        System.out.println(sexStr);

        a = 5;
        b = 4;
        c = 3;
        int y = 7;

        c = a *= b /= y += 6;
        System.out.println(c);
    }
}