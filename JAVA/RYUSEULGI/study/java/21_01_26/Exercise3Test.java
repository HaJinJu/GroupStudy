class Calc extends Thread {
    public void run() {
        double sum = 0;

        Exercise3.performanceCheckStart();

        for (int i = 1; i <= 1000000; i++) {
            synchronized (Exercise3Test.performance) {
                sum += (i + (i - 1)) * (0.0001 * i);
            }
        }
        Exercise3.performanceCheckEnd();
        System.out.println("sum = " + sum);
        Exercise3.printPerformance();
    }
}

public class Exercise3Test {

    public static Exercise3 performance = new Exercise3();

    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.start();
    }
}