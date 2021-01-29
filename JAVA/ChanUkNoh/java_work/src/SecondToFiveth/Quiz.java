package SecondToFiveth;

public class Quiz {
    public static void main(String[] args) {
        // A의 주사위와 B의 주사위를 만들고 주사위를 각자 굴려서 더 높은 숫자가 나온 사람이 이기게 만들어보자!
        int A = (int)(Math.random() * 6) + 1;
        
        int B = (int)(Math.random() * 6) + 1;
        
        if (A > B) {
            System.out.println("A승리 B패배");
        } else {
            System.out.println("B승리 A패배");
        }
    }
}