package FirstRegularTest;

import java.util.ArrayList;

class randomPick{
    int randNum;
    int[] randArr;
    ArrayList<Integer> jNum = new ArrayList<Integer>();
    ArrayList<Integer> hNum = new ArrayList<Integer>();

    public void pickRandArr(){
        randArr = new int[7];
        for(int i = 0; i < randArr.length; i++){
            randNum = (int)(Math.random()*50)+1;
            if(randNum % 2 == 1){
                hNum.add(randNum);
            }else{
                jNum.add(randNum);
            }
            System.out.printf("[%d]공간의 값은 : %d\n",i,randNum);
        }
    }
    public void jjakhol(){
        System.out.print("출력된 배열의 값 중에 홀수는 :");
        System.out.println(hNum);
        System.out.print("출력된 배열의 값 중에 짟수는 :");
        System.out.println(jNum);
    }
}

public class Ninteenth {
    //임의의 난수들을 임의의 배열 크기에 저장하도록 한다.
    //그리고 이 값들을 출력해보자!
    //또한 여기서 짝수만 따로 홀수만 따로 출력할 수 있게 매서드를 작성해보도록 한다.
    public static void main(String[] args) {
        randomPick rp = new randomPick();

        rp.pickRandArr();
        rp.jjakhol();
    }
}
