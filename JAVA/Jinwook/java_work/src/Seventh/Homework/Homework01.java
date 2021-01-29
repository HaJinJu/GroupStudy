package Seventh.Homework;
class Num{

    int [] arr;
    public void setArr(){

        arr = new int[10];

        for( int i = 0; i < 10 ; i ++){
            arr[i] = i  +1 ;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

    }
}
public class Homework01 {
    public static void main(String[] args) {
        Num nu = new Num();
        nu.setArr();
        System.out.println(nu);



    }

        }
