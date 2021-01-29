package Twentieth.Homework;
//2. 랜덤한 숫자를 200개 생성한다.
//               숫자의 범위는 20 ~ 60 까지로 제한한다.
//               각각의 숫자들이 몇 개씩 중복되었는지 검사하는 프로그램을 작성해보자!


import java.util.*;

class Randomarray {
    int[] num = new int[200];

    public void arrlist() {
        ArrayList<Integer> list = new <Integer>ArrayList();

        for (int i = 0; i < num.length; i++) {
            list.add((int) (Math.random() * 41) + 20);
        }

        for (int lists : list) ;
        System.out.println("숫자 나열 : "+ list);

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int key : list) hm.put(key, hm.getOrDefault(key, 0) + 1);

        System.out.printf("중복 검사 결과 : " + hm);


    }

}


public class Q2_RandomArray {
    public static void main(String[] args) {
        Randomarray ran = new Randomarray();

        ran.arrlist();


    }
}
