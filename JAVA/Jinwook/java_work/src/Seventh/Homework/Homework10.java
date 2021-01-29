package Seventh.Homework;


//        }
public class Homework10 {
    public static void main(String[] args) {
        final int ARRSIZE = 30;
        int [] arr = new int[ARRSIZE];
        for(int i = 0 ; i < arr.length; i ++){
            arr[i] = (int)(Math.random()*80)+1;
            System.out.printf("arr[%d] = %d\n", i+1, arr[i]);
        }

    }
}
