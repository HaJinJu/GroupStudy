package hw_2021_01_08;

public class Constructor_Series {
    int sum;
    int start;
    int end;

    public Constructor_Series(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void printSeries() {
        int count = 1;

        for (int i = start; i <= end; i++) {
            System.out.printf("%3d",i);

            if (count % 5 == 0) {
                System.out.println("");
            }
            count++;
        }
    }

    public void printOrderSeries(int order) {
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % order == 0) {
                System.out.printf("%3d", i);
                count++;

                if (count % 5 == 0) {
                    System.out.println("");

                }
            }
        }
    }

    public int sumOddNum() {
        for(int i = start; i <= end; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}