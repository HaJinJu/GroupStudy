public class Exercise7 {
    public static void main(String[] args) {
//      for를 사용해서 2의 배수만 출력하도록 프로그래밍 해보자!
//      방식이 두 가지 정도 있을 수 있는데
//      앞서 소개했던 꼼수와 정석이 있다.

        System.out.println("실제 조건 검사 없이 짝수 판점하기");

        for(int i = 2; i < 11; i += 2) {
            System.out.println("i = " + i);
        }

        System.out.println("if 문을 활요한 짝수 판정");

        int i;
        for(i = 1; i < 11; i++ ){
            if( i % 2 == 0 ){
                System.out.printf("2의 배수 = %d\n",i);
            }
        }
    }
}
