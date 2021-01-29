package Twentieth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class RandNumArrayList {
    private int[] randNumArr;
    private int randLen;
    private int randNum;
    ArrayList<Integer> randArrayList = new ArrayList<Integer>();


    public RandNumArrayList() {
        randLen = (int) (Math.random() * 10);
        randNumArr = new int[randLen];

    }
    public void RandNumAndArrayList(){
        for (int i = 0; i < randLen; i++) {
            randNum = (int) (Math.random() * 5) + 1;
            randNumArr[i] = randNum;
            randArrayList.add(randNumArr[i]);
        }
        System.out.println(randArrayList);

    }


    public void DupRandNumAndArrayList() {
        int cnt = 0;
        boolean checkNum = false;
        Set<Integer> checkDup = new TreeSet<>();

        for (Integer s : randArrayList) {

            if (!checkDup.add(s)) {
//                cnt++;
//
//                    System.out.printf("DUP: %d , %d\n", s, cnt);
//

                    //변경해야할 사항 = 같은 숫자가 여러번 반복되면 여러번 출력됨
                    //카운트 세주는거 미리 나온거 확인후 카운트 1씩 올라감
                //[3, 3, 5, 3, 2, 1, 3]
                //DUP: 3 , 1
                //DUP: 3 , 2
                //DUP: 3 , 3
            }
        }
    }
}
public class ComprehensiveExercise2 {
    public static void main(String[] args) {
        RandNumArrayList ral = new RandNumArrayList();
        ral.RandNumAndArrayList();
        ral.DupRandNumAndArrayList();

    }
    // 2. 랜덤한 숫자를 200개 생성한다 숫자의 범위는 20~60까지로 제한
    //    각각의 숫자들이 몇 개씩 중복되었는지 검사하는 프로그램 작성(컬렉션)



}
