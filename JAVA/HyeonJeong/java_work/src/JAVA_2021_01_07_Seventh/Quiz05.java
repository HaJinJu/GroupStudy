package JAVA_2021_01_07_Seventh;

import java.util.Arrays;

class Fibonacci {
    int[] arr;

    public void setArr() {
        arr = new int[(int)(Math.random() * 10) + 10];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
    }

    @Override
    public String toString() {
        return "Fibonacci" +
                "=" + Arrays.toString(arr) ;
    }
}

public class Quiz05 {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        fib.setArr();
        System.out.println(fib);
    }
}
