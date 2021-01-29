package Test;

import java.util.ArrayList;
import java.util.Iterator;

public class CreateTeamOfTest20 {
    ArrayList<String> teamArrayList;
    ArrayList<String> AteamArrayList;
    ArrayList<String> BteamArrayList;

    private String[] teamArr;
    private String[] AteamArr;
    private String[] BteamArr;

    private int numOfPerson;
    private int AnumOfPerson;
    private int BnumOfPerson;

    private int numOfTeam;

    public CreateTeamOfTest20(String[] arr, final int TEAMNUMBER) {
        teamArr = arr;

        numOfPerson = arr.length;

        numOfTeam = TEAMNUMBER;

        teamArrayList = new ArrayList<String>();
    }

    public CreateTeamOfTest20(String[] arrA, String[] arrB, final int TEAMNUMBER) {
        AteamArr = arrA;
        BteamArr = arrB;

        AnumOfPerson = arrA.length;
        BnumOfPerson = arrB.length;

        numOfTeam = TEAMNUMBER;

        AteamArrayList = new ArrayList<String>();
        BteamArrayList = new ArrayList<String>();
    }

    public void allocRandomTeam1() {
        allocArrayList(teamArrayList, teamArr, numOfPerson);
    }

    public void allocRandomTeam2() {
        allocArrayList(AteamArrayList, AteamArr, AnumOfPerson);
        allocArrayList(BteamArrayList, BteamArr, BnumOfPerson);
    }

    public void allocArrayList(
            ArrayList<String> al,
            String[] arr,
            int loopNum) {

        boolean isDup = false;

        for (int i = 0; i < loopNum; i++) {
            do {
                int randNum = (int) (Math.random() * loopNum);

                if (al.contains(arr[randNum])) {
                    isDup = true;
                    continue;
                } else {
                    isDup = false;
                }

                al.add(arr[randNum]);
            } while (isDup);
        }
    }

    public void printArrayList(ArrayList<String> al) {
        String name;

        Iterator e = al.iterator();

        int cnt = 1;
        int remainCnt = 0;
        int remainTeam = numOfTeam;
        int randValue = 0;

        int quot = al.size() / numOfTeam;
        int remain = al.size() % numOfTeam;
        boolean needException = (remain > 0) ? true : false;

        while (e.hasNext()) {
            name = (String) e.next();
            System.out.printf("%s ", name);

            if (remain == 0) {
                randValue = 0;
            } else if (needException) {
                randValue = (int) (Math.random() * 2);

                if (remain - remainCnt >= remainTeam - remainCnt) {
                    randValue = 1;
                }

                if (remain == remainCnt) randValue = 0;

                if (randValue == 1) remainCnt++;

                needException = false;
            }

            if ((cnt % (quot + randValue)) == 0) {
                System.out.println();

                needException = true;
                randValue = 0;
                cnt = 0;
                remainTeam--;
            }

            cnt++;
        }
        System.out.println();
    }

    public ArrayList<String> getTeamArrayList() {
        return teamArrayList;
    }

    public ArrayList<String> getAteamArrayList() {
        return AteamArrayList;
    }

    public ArrayList<String> getBteamArrayList() {
        return BteamArrayList;
    }
}
