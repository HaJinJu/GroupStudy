public class CalculateFormula {
    private final int ZERO = 0;
    private final int ONE = 1;
    private final int TWO = 2;
    private final double DECPOINT = 0.0001;

    private double sum;

    public CalculateFormula() {
        sum = ZERO;
    }

    public synchronized void calcFormula(int start, int end) {
        for(int n = start; n <= end; n++) {
            sum += (n * (TWO * n - ONE)) * (n * DECPOINT);
        }
    }

    public double getSum() {
        return sum;
    }
}