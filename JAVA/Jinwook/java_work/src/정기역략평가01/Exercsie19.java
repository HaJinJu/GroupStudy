package 정기역략평가01;

import java.util.ArrayList;

class RandomArrAndNum {

    private int[] randArr;
    private int randNum1;
    private int randNum2;
    ArrayList<Integer> even = new ArrayList<Integer>();
    ArrayList<Integer> odd = new ArrayList<Integer>();

    public RandomArrAndNum() {

        randNum1 = (int) (Math.random() * 10) + 1;
        randArr = new int[randNum1];

    }

    public void allocRandArrNum() {

        for (int i = 0; i < randArr.length; i++) {

            randNum2 = (int) (Math.random() * 50)+ 1;
            randArr[i] = randNum2;
            System.out.printf("arr[%2d] = %d\n", i, randArr[i]);



        }
    }


    public void divideRandNum(){


        for (int i = 0; i < randArr.length; i++) {

            if(randArr[i] % 2 == 0){
                even.add(randArr[i]);

            }else {
                odd.add(randArr[i]);
            }
        }
        System.out.println("짝수: " + even);
        System.out.println("홀수: " + odd);
    }

}


public class Exercsie19 {
    public static void main(String[] args) {
        RandomArrAndNum raan = new RandomArrAndNum();
        raan.allocRandArrNum();
        raan.divideRandNum();


    }
}
