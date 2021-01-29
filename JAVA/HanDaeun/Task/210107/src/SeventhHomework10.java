/*
    < Homework 10 >
랜덤한 개수의 배열을 만든다. (범위는 적당히 알아서 지정하자)
*/


class Array1 {
    int[] arr;
    int randNum;

    public void setArr() {
        randNum = (int)(Math.random() * 10) + 1;
        arr = new int[randNum];
    }

    public void arrPrint() {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}

public class SeventhHomework10 {
    public static void main(String[] args) {
        Array1 arr1 = new Array1();

        arr1.setArr();
        arr1.arrPrint();
    }
}