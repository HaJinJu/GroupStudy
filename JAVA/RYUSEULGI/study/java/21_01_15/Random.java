// 알고리즘 풀기 위해서 전략세우기
// 요구사항을 하나씩 해결하는 방법으로 접근하기
// (문제) 인원을 랜덤으로 4개팀 구성하기
// 1) 랜덤사용 2) 총 인원 파악 3) a,b조 2개의 입력배열이 필요 4) 몇 개의 팀으로 구성 
// 5) 상황이 바뀐다면 어떨까? 6) 17명을 어떻게 4개의 팀으로 나눌까? 7) 중복 판정하는 루틴 추가
// 요구사항 분석하는 연습하기

import java.util.ArrayList;
import java.util.Iterator;

class CreateTeam {

    private ArrayList<String> AteamArrList;
    private ArrayList<String> BteamArrList;

    private String[] AteamArr;
    private String[] BteamArr;

    private int AnumOfPerson;
    private int BnumOfPerson;

    private int numOfTeam;

    boolean needException;

    public CreateTeam(String[] arrA) {
        AteamArr = arrA;
    }

    public CreateTeam(String[] arrA, String[] arrB, final int TEAMNUMBER) {
        AteamArr = arrA;
        BteamArr = arrB;

        AnumOfPerson = arrA.length;
        BnumOfPerson = arrB.length;

        numOfTeam = TEAMNUMBER;

        AteamArrList = new ArrayList<>();
        BteamArrList = new ArrayList<>();
    }

    public void allocRandTeam() {
        allocArrayList(AteamArrList, AteamArr, AnumOfPerson);
        allocArrayList(BteamArrList, BteamArr, BnumOfPerson);
    }

    public void allocArrayList(ArrayList<String> al, String[] arr, int loopNum) {

        boolean isDup = false;

        for (int i = 0; i < loopNum; i++) {
            // 랜덤하게 수 배치
            // 포함하고 있다면 true 포함하고 있지 않다면 false
            do {
                int randNum = (int) (Math.random() * loopNum);
                if (al.contains(arr[randNum])) {
                    isDup = true;
                    continue;
                } else {
                    isDup = false;
                    al.add(arr[randNum]);
                }
            } while (isDup);
        }
    }

    public void printArrList(ArrayList<String> al) {

        Iterator<String> e = al.iterator();
        String name;
        int cnt = 1;
        int quot = al.size() / numOfTeam;
        int remain = al.size() % numOfTeam;
        boolean needException = (remain > 0) ? true : false;
        int randValue = 0;

        while (e.hasNext()) {
            name = (String) e.next();
            System.out.printf("%s", name);

            if (needException) {
                randValue = (int) (Math.random() * 2);
                needException = false;
            }

            if ((cnt % (quot + randValue)) == 0) {
                System.out.println("");

                if (cnt == 4) {
                    randValue = 1;
                } else {
                    randValue = 0;
                }
                cnt = 0;
            }
            cnt++;
        }
        System.out.println("");
    }

    // print 하기 위해 getter 이용
    public ArrayList<String> getAteamArrList() {
        return this.AteamArrList;
    }

    public ArrayList<String> getBteamArrList() {
        return this.BteamArrList;
    }
}

public class Random {
    public static void main(String[] args) {

        final int TEAMNUMBER = 4;
        String[] nameA = { "고동영", "장해솔", "류슬기", "박재민", "한다은", "최현정", "오진욱", "조진형", "이정현" };
        String[] nameB = { "이범진", "박소현", "탁성진", "노찬욱", "박기범", "하진주", "이승윤", "최임식" };
        CreateTeam createTeam = new CreateTeam(nameA, nameB, TEAMNUMBER);
        createTeam.allocRandTeam();
        createTeam.printArrList(createTeam.getAteamArrList());
        createTeam.printArrList(createTeam.getBteamArrList());
    }
}
