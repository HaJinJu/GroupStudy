package JAVA_2021_01_11_Ninth;

class GuGuDan {
    int start, end;

    public GuGuDan() {
        start = 2;
        end = 9;
    }

    public GuGuDan(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void printGuGuDan() {
        final int START = 1;
        for(int i = START; i < end; i++) {
            for(int j = START; j <= 9; j++) {
                System.out.printf("%d X %d = %2d\n", i, j, i * j);
            }
            System.out.println("");
        }
    }
}

public class HW10_Answer {
    public static void main(String[] args) {
        GuGuDan gugudan = new GuGuDan(2,9);

        gugudan.printGuGuDan();
    }
}
