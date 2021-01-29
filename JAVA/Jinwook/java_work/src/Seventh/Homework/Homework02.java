package Seventh.Homework;

class Plus {
    int [] arr;
    int sum;
    public void setArr(){
        arr = new int[10];
        sum = 0 ;

        for( int i = 0; i < arr.length ; i ++){
            arr[i] = i  +1 ;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
            sum += arr[i];

        }

        System.out.println("total plus = " + sum);
    }
}

public class Homework02 {
    public static void main(String[] args) {
        Plus pl = new Plus();
        pl.setArr();
        System.out.println(pl);

    }
}
