package Eighth;

public class ExtraQuiz1 {
    public static void main(String[] args) {
        System.out.printf("\n" +
                "1) 3 의 배수는 더하고 5 의 배수는 뺀다.\n" +
                "   덧셈만한 최종 결과값과 뺄셈만한 최종 결과를 확인해보자!\n" +
                "   마지막으로 두 값의 합을 return(반환)하도록 매서드를 만들어보자!\n");

        NumberStudy test = new NumberStudy();
        test.setNum(30);
        test.setTotalSum();
    }
}
