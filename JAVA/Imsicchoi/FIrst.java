package Sixth_Homework;

public class FIrst {
    public static void main(String[] args) {
//        1) 7개 짜리 int 형 배열을 만들어보자!
        int[] arr = new int[7];

        for(int i = 0; i < 7; i++)  {
            arr[i] = i + 1 ;
            System.out.printf("add[%d] = %d\n", i, arr[i]);
        }

    }
}
