package jan0126;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Second {
    public static void main(String[] args) {
        int randNum;
        ArrayList<Integer> colEct = new ArrayList<Integer>();
        ArrayList<String> samPle = new ArrayList<String>();
        ArrayList<String > pick = new ArrayList<String>();
        for (int i = 0; i < 200; i++) {
            randNum = (int) (Math.random() * 60) + 20;
            samPle.add(randNum);
            for (int j = 20; j < 81; j++) {
                if (samPle.get(i).equals(samPle.get(j))) {
                    pick.add(samPle.get(i));
                    System.out.println("중복값있음 : [" + samPle + "]");
                }
            }
        }

//            colEct.add(randNum);
//        }
//        System.out.println(colEct);
//
//        HashSet<Integer> dupcnt = new HashSet<Integer>();


//        if(dupcnt.contains(colEct)){
//
//        }
//
//
//
//
//        dupcnt.addAll(colEct);
//        dupcnt.retainAll(colEct);
//        for (int i =0; i < colEct.size(); i++){
//            dupcnt.add(colEct.iterator());
//            System.out.println();
//
//        }
      //  System.out.println(dupcnt);



//        HashSet<Integer> dupcnt = new HashSet<Integer>();
//
//        for(int i =0; i < colEct.size(); i++){
//            if(dupcnt.contains(colEct.get(i))){
//                dupcnt.put(colEct.get(i),dupcnt.get(colEct.get(i))+1);
//            }else{
//                dupcnt.put(colEct.get(i), 1);
//            }
//        }
//        System.out.println(colEct);
//        System.out.println(dupcnt);

        //랜덤한 숫자를 200개 생성한다.
        //숫자의 범위는 20~60까지로 제한.
        //각각의 숫자들이 몇 개씩 중복되었는지 검사하는 프로그램을 만들어보자(collection문제)

    }
}
