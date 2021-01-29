public class InfinityLoopTest {
    public static void main(String[] args) {
//      조건이 없다? 무 조 건
        for(;;) {
            System.out.println("가즈아 ~");
        }
/*
        조건이나 초기화 없이 증감식 만으로 무한for문이 가능하
        int i = 1;
        for(;; i++) {
            System.out.println("i = " + i);
        }
 */
    }
}
