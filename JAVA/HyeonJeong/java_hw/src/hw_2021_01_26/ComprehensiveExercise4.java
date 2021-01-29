package JAVA_2021_01_26_Twentieth;

public class ComprehensiveExercise4 {
    public static void main(String[] args) {
        System.out.println("4. 1 ~ 10억번의 루프를 돈다.\n" +
                           "위의 숫자는 표기상 n0 ... n1000000000 으로 표기하도록 한다.\n" +
                           "아래 코드를 for 문으로 돌리고 thread를 활용하여 성능을 개선해보자!\n" +
                           "nX * [Math.pow(10, -15) * nX] * sin( nX * pi / 180 ) +\n" +
                           "n(X+1) * [Math.pow(10, -15) * n(X+1)] * sin( n(X+1) * pi / 180 ) +\n" +
                           "......");

    }
}
