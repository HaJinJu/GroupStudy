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

    private int numOfTeam;

    // arrA로 nameA 배열 받고, arrB로 nameB 받고
    public CreateTeam(String[] arrA, String[] arrB, final int TEAMNUMBER) {
        // 받은 arrA(nameA)를 AteamArr 배열로 대입(B도 마찬가지)
        AteamArr = arrA;
        BteamArr = arrB;

        // nameA조 길이를 AnumOfPerson으로 대입 -> 9 (B는 8)
        AnumOfPerson = arrA.length;
        BnumOfPerson = arrB.length;

        // numOfTeam에 2 대입
        numOfTeam = TEAMNUMBER;

        // AteamArrayList, BteamArrayList 초기화
        AteamArrayList = new ArrayList<String>();
        BteamArrayList = new ArrayList<String>();
    }

    public void allocRandomTeam() {
        // 문제 풀 때 어떤식으로 접근을 해야할까요?
        // 1. 우선 이 문제를 풀기 위한 전략을 세워야 한다.
        // 2. 문제가 요구하는 사항을 파악해야 한다.
        // 3. 요구 사항을 하나 하나 각개 격파한다.

        // 위의 방식을 따라서 현재 문제에 대한 요구 사항을 파악해보자
        // 문제 : 우리반 사람들을 4개의 팀으로 랜덤하게 할당한다.
        // 1) 랜덤을 사용해야 한다.(Math.random() 혹은 Random 클래스)
        // 2) 우리반 사람들이 몇 명 있는가 ? 17명
        // 2-2) 현재 교차 대면 수업을 하므로
        //      A조, B조가 구별되어 있는 상태다.
        //      A조는 A조 내에서 분할, B조도 B조 내에서 분할
        //      입력 배열이 1개가 아니고 2개의 입력 배열이 필요하다.
        // 2-3) 현재 케이스는 굉장히 특수한 케이스이므로
        //      일반적인 상황에서 배열 1개면 충분할 것이다.
        // 3) 몇 개의 팀으로 구성해야 하는가 ? 4개의 팀
        // 4) 만약 상황이 바뀐다면 n개의 팀도 가능할까 ? 여기까지 고려하면 좋음
        // 5) 그렇다면 17명을 어떻게 4개의 팀으로 나눌까 ?
        //    17 나누기 4를 하고 랜덤한 특정 번호에 5명을 배치하게 해볼까 ?
        // 6) 랜덤한 팀원수를 가지는 팀을 분할 했다면
        //    이제 실제 random 값을 추출하여
        //    ArrayList에 정보를 배치한다.
        // 7) 중복이 되면 안되므로 중복을 판정하는 루틴이 추가적으로 필요하다.

        // 프로젝트 : ~~을 만들어서 돈을 법시다.
        // * : ~을 어떻게 만들까?
        // 앞으로 숙제할 때 요구사항을 분석하는 연습해보자

        // 1. 배열을 백업 받았으므로 랜덤값을 뽑아서
        //    해당 값을 인덱스로 특정 인물을 추출하여 ArrayList에 설정한다.

//        for(int i = 0; i < AnumOfPerson; i++) {
//            int randNum = (int)(Math.random() * AnumOfPerson);
//
//            AteamArrayList.add(AteamArr[randNum]);
//        }
//
//        for(int i = 0; i < BnumOfPerson; i++) {
//            int randNum = (int)(Math.random() * BnumOfPerson) + AnumOfPerson;
//
//            BteamArrayList.add(BteamArr[randNum]);
//        }

        allocArrayList(AteamArrayList, AteamArr, AnumOfPerson);
        allocArrayList(BteamArrayList, BteamArr, BnumOfPerson);
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
                // A조의 경우 0 ~ 8
                // B조의 경우 0 ~ 7
                int randNum = (int)(Math.random() * loopNum);

                // 0 ~ 8 랜덤 숫자가 ArrayList에 있으면 isDup를 true로 해서 다시 랜덤값 생성
                if (al.contains(arr[randNum])) {
                    isDup = true;
                    continue;
                } else {
                    isDup = false;
                }

                // A조 배열에 0~8 랜덤 숫자에 맞는 배열 이름 배열 리스트에 할당시키기
                al.add(arr[randNum]);
            } while (isDup);
            // 루프 다 돌고 AteamArrayList 결과 : ex)
            // | 8 |->| 2 |->| 3 |->| 1 |->| 7 |->| 5 |->| 6 |->| 0 |->| 4 |
            // |"8번째 이름"|->|"2번째 이름"|->|"3번째 이름"|->..->|"4번째 이름"|
        }
    }

        public void printArrayList (ArrayList<String> al) {
            String name;
            // AteamArrayList를 순회할 수 있는 정보를 얻음
            Iterator e = al.iterator();

            int cnt = 1;
            int quot = al.size() / numOfTeam; // quot = 4 (A팀일 경우)
            int remain = al.size() % numOfTeam; // remain = 1 (A팀일 경우)
            boolean needException = (remain > 0) ? true : false; // true 대입

            int randValue = 0;
            // 현재 발생하는 문제
            // 1) 매 반복마다 randValue가 0, 1, 0, 1 스위칭되고 있음

            // 순회할 수 있는가?
            // 데이터가 없으면 루프 진행 x
            // 데이터가 하나라도 있으면 루프 진행 o
            while (e.hasNext()) {
                // 이름은 루프 한 번에 하나씩 읽어들임
                name = (String) e.next();
                System.out.printf("%s ", name);

                // 현재 케이스에서는 무조건 앞에 5명이 나온다.
                // 그러므로 이것도 랜덤하게 4, 5 혹은 5, 4가 나오게 해줘야 한다.
                if (needException) {
                    // true일 때만 실행되므로 한 번 실행 끝.
                    randValue = (int) (Math.random() * 2);
                    needException = false;
                }

                /*
                System.out.println("cnt = " + cnt);
                System.out.println("quot + randValue = " + (quot + randValue));
                 */


                // randValue가 0이라면,
                // cnt = 4일 때 (cnt % (quot + randValue)) == 0 성립 -> 1팀이 4명
                // 그 후, randValue는 1, cnt = 0으로 대입
                // 그 다음 cnt = 5일 때 (cnt % (quot + randValue)) == 0 성립 -> 2팀이 5명
                // randValue는 0, cnt = 0으로
                // 나머지 3팀, 4팀도 동일하게 루프 수행-> 각각 4명씩
                if ((cnt % (quot + randValue)) == 0) {
                    System.out.println("");

                    if (cnt == 4) {
                        randValue = 1;
                    } else {
                        randValue = 0;
                    }

                    // 엔터 치고 나서 다시 cnt 값 0으로 초기화
                    cnt = 0;
                }

                cnt++;
            }

            System.out.println("");
        }

        public ArrayList<String> getAteamArrayList() {
            return AteamArrayList;
        }

        public ArrayList<String> getBteamArrayList() {
            return BteamArrayList;
        }

    }