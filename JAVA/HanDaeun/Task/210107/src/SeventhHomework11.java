/*
    < Homework 11 >
이 배열에서 짝수가 몇 개 나왔는지 체크하는 매서드를 만든다.
*/


class Array2 {
    int[] arr;
    int randNum, checkArr;

    public void setArr() {
        randNum = (int)(Math.random() * 10) + 1;
        arr = new int[randNum];
    }

    public void setCheckArr() {
        checkArr = 0;
    }

    public void arrCheck() {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.printf("arr[%d] = %d\n", i, arr[i]);

            if(arr[i] % 2 == 0) {
                checkArr++;
            }
        }

        System.out.printf("\n이 배열에서 나온 짝수는 총 %d 개 이다.", checkArr);
    }
}

public class SeventhHomework11 {
    public static void main(String[] args) {
        Array2 arr2 = new Array2();

        arr2.setArr();
        arr2.setCheckArr();
        arr2.arrCheck();
    }
}