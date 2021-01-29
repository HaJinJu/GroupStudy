package Twentieth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class DupInspection {
    int [] randNum;
    int i;
    ArrayList<Integer> str = new ArrayList<>();



    public void numberSet(int setNum){
        randNum =new int[setNum];
        for (i =0 ;i< randNum.length;i++){
            randNum[i]=(int)(Math.random()*41)+20;
            //System.out.printf("%d번 배열 수:%d\n",i,randNum[i]);
            str.add(randNum[i]);
        }
        for (int lists : str) ;
        System.out.print(str);
    }
    public void hashDup(){
        HashMap<Integer, Integer> hm = new HashMap<>();
        //hashmap 중 getorDefault(key, Default-value)메서드인데 뜻이 찾는 키가 존재한다면
        //찾는 키의 값을 반환하고 없다면 기본 값을 반환하다는 뜻
        //Default 값 반환하고 +1씩 해서 카운트.
        for (int list2 : str) hm.put(list2, hm.getOrDefault(list2, 0) + 1);
        System.out.printf("결과 : " + hm);
    }

}
