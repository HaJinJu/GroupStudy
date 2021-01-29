package Fourteenth;

import java.util.ArrayList;
import java.util.Iterator;

public class CreateTeam {
    private ArrayList<String> AteamArrayList;
    private ArrayList<String> BteamArrayList;

    private String[] AteamArr;
    private String[] BteamArr;

    private int AnumOfPerson;
    private int BnumOfPerson;

    // 몇 개의 팀으로 나눌 것인가?
    private int numOfTeam;

    public CreateTeam(String[] arrA, String[] arrB, final int TEAMNUMBER) {
        AteamArr = arrA;
        BteamArr = arrB;

        AnumOfPerson = arrA.length;
        BnumOfPerson = arrB.length;

        numOfTeam = TEAMNUMBER;

        AteamArrayList = new ArrayList<String>();
        BteamArrayList = new ArrayList<String>();
    }

    public void allocRandomTeam() {

        allocArrayList(AteamArrayList, AteamArr, AnumOfPerson);
        allocArrayList(BteamArrayList, BteamArr, BnumOfPerson);
    }

    public void allocArrayList(ArrayList<String> al,
                               String[] arr, int loopNum) {
        boolean isDup;
        int randNum;

        for (int i = 0; i < loopNum; i++) {

            do {
                randNum = (int) (Math.random() * loopNum);

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
        int zeroCnt = 0;

        // numOfTeam 개의 팀에 quot 명을 팀으로 만듬
        int quot = al.size() / numOfTeam;
        // 총 인원과 만드려는 팀의 갯수가 맞지 않는 경우를 판별하기 위한 변수
        // quot 의 나머지
        int remain = al.size() % numOfTeam + 1;
        System.out.println(remain);

        // 예외처리가 필요한 경우 true 를 반환
        boolean needException = (remain > 0) ? true : false;

        // 예외 적용 팀을 할당하기 위한 변수 선언
        // 예외가 없을 시에는 기본 코드에 영향을 주면 안되기 때문에
        // 값을 0으로 초기화한다.
        int randValue = 0;

        while (e.hasNext()) {
            name = (String) e.next();
            // name 을 일렬로 출력
            System.out.printf("%s ", name);

            // 예외 케이스의 경우
            // 예외를 적용하는 팀에게는 randValue 에 1을 적용 하고
            // 예외를 적용하지 않는 팀에게는 randValue 에 0을 적용해
            // 예외 팀이 한 번 더 출력되도록 한다.

            // 전략: 예외 케이스의 경우를 찾아 예외 케이스를 적용해야한다.
            //      remain 만큼의 예외가 필요하고 remain 이 모두 소모되면
            //      예외케이스를 적용하지 않는다. (초기화는 비예외케이스로 초기화하고 예외케이스에만 적용)
            //      하지만 randValue 가 모두 0이나오는 경우도 있기 때문에 처리해야함
            //      zeroCnt 를 만들어 비예외 케이스가 필요한 경우의 수(numOfTeam - remain) 보다 크면
            //      예외를 적용한다.
            if (remain > 0) {
                if (needException) {
                    randValue = (int) (Math.random() * 2);
                    if (randValue == 1) remain--;
                    if ((zeroCnt) >= (numOfTeam - remain)) randValue = 1;
                    if (randValue == 0) zeroCnt++;

                    needException = false;
                }
            }

            // cnt 가 한 반 인원수 + 예외 인원수 만큼 증가하면 줄 바꿈
            if ((cnt % (quot + randValue)) == 0) {
                System.out.println("");

                needException = true;
                randValue = 0;
                cnt = 0;
            }
            cnt++;
        }
    }

    public ArrayList<String> getAteamArrayList() {
        return AteamArrayList;
    }

    public ArrayList<String> getBteamArrayList() {
        return BteamArrayList;
    }
}
