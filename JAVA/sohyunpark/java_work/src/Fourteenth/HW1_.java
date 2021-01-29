package Fourteenth;

import java.util.ArrayList;
import java.util.Iterator;

public class HW1_ {
    private ArrayList<String> teamArrayList;

    private String[] teamArr;
    private int numOfPerson;

    private int numOfTeam;

    // name 배열 전체를 받아서 명시해놓은 TEAMNUMBER 수만큼 팀 개수를 정함
    public HW1_(String[] arr, final int TEAMNUMBER) {
        teamArr = arr;

        numOfPerson = arr.length;

        // numOfTeam에 3 대입
        numOfTeam = TEAMNUMBER;

        teamArrayList = new ArrayList<String>();
    }

    public void allocRandomTeam() {
        allocArrayList(teamArrayList, teamArr, numOfPerson);
    }

    public void allocArrayList(
            ArrayList<String> al, String[] arr, int loopNum) {

        boolean isDup = false;

        for (int i = 0; i < loopNum; i++) {
            // 우리는 A 배열, B 배열이 나눠진 케이스를 받으므로
            // 하나의 배열에서 모든 값을 처리하지 않는다.
            // 그러므로 start를 별도로 만들 필요가 없었다.
            // int randNum = (int)(Math.random() * loopNum) + start;
            do {
                int randNum = (int)(Math.random() * loopNum);

                // 0 ~ 16 랜덤 숫자가 ArrayList에 있으면 isDup를 true로 해서 다시 랜덤값 생성
                if (al.contains(arr[randNum])) {
                    isDup = true;
                    continue;
                } else {
                    isDup = false;
                }

                // name 배열에 0~16 랜덤 숫자에 맞는 배열 이름 배열 리스트에 할당시키기
                al.add(arr[randNum]);
            } while (isDup);
        }
    }

    public void printArrayList (ArrayList<String> al) {
        String name;

        Iterator e = al.iterator();

        int cnt = 1;
        int quot = al.size() / numOfTeam; // 17/3=5 quot = 5 (3팀일 경우)
        int remain = al.size() % numOfTeam; // remain = 2

        int randValue = 0;

        while (e.hasNext()) {
            name = (String) e.next();
            System.out.printf("%s ", name);

            // 17명일 때 3팀이면 5 5 7(quot=5, quot+remain=7)->이 remain을 활용한다면..
            //          4팀일 때 4445(quot=4, quot+remain=5)
            //          5팀일 때 33335(quot=3, quot+remian=5)
            if(cnt == quot) {
                System.out.println("");
                cnt = 0;
            }


            cnt++;
        }
    }


    public ArrayList<String> getteamArrayList() {
        return teamArrayList;
    }


}
