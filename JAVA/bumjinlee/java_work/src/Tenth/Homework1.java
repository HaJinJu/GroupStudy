package Tenth;

import java.util.Scanner;

public class Homework1 {
    // 이중 배열과 클래스를 활용한 연습문제

    // 1. 오늘 만든 MyMatrix 클래스를 개조하여 사용자의 배열을 입력받아
    //    행렬을 만들도록 개조해보자.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        MyMatrix mat = new MyMatrix(arr, 3, 3);

        mat.array2Matrix();
        mat.printMatrix();
    }
}
//