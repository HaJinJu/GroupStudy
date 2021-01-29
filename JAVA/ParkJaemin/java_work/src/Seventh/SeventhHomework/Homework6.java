package Seventh.SeventhHomework;

class fibonacci {

    public void fibonacci() {
        final int TARGET = 17;
        int first = 1;
        int second = 1;
        int num;

        for (int i = 3; i < TARGET+1; i++) {
            num = first + second;
            first = second;
            second = num;
            System.out.printf("%d항 = %d\n", i, num);
        }
    }

}

public class Homework6 {
    public static void main(String[] args) {

        fibonacci fib = new fibonacci();

        fib.fibonacci();


    }

}

