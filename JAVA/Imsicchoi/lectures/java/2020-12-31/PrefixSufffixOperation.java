public class PrefixSufffixOperation {
    public static void main(String[] args) {
        int num = 3;

        System.out.println("전위 연산자:" + (++num));
        System.out.println("전위 연산자:" +(++num));
        System.out.println("결과:" + num);

        num = 3;

        System.out.println("후위 연산자:"+ (num++));
        System.out.println("후위 연산자:"+ (num++));
        System.out.println("결과:" + num);

    }
}
