package Fourteenth;

import java.util.ArrayList;
import java.util.Iterator;

public class CreateTeam {
    private ArrayList<String> AteamArrayList;
    private ArrayList<String> BteamArrayList;

    private String[] AteamArr; // A조 이름 배열
    private String[] BteamArr; // B조 이름 배열

    private int AnumOfPerson;
    private int numOfTeam;

    private int BnumOfPerson; // 인스턴스 변수 호출

    public CreateTeam(String[] arrA, String[] arrB, final int TEAMNUMBER) {
        AteamArr = arrA; // A팀 배열
        BteamArr = arrB; // B팀 배열

        AnumOfPerson = arrA.length; //  A조 인원 수 = A조 인원 배열의 길이
        BnumOfPerson = arrB.length; // B조 인원 수  = B조 인원 배열의 길이

        numOfTeam = TEAMNUMBER; // 팀 수 = 팀 넘버 2

        AteamArrayList = new ArrayList<String>(); // A조원 이름 배열의 배열 리스트 0~8까지 각자 이름
        BteamArrayList = new ArrayList<String>(); // B조원 이름 배열의 배열 리스트 0~7까지 각자 이름
        // 초기
    }

    public void allocRandomTeam() {
        // 랜덤으로 팀 할당 하는 메서드

        // 1) 배열을 백업 받았으므로 랜덤값을 뽑아서
        //    해당 값을 인덱스로 특정 인물을 추출하여 ArrayList에 설정한다.

        /*
        for(int i = 0; i < AnumOfPerson; i++) {
            int randNum = (int)(Math.random() * AnumOfPerson);
            AteamArrayList.add(AteamArr[randNum]);
        }
        for(int i = 0; i < BnumOfPerson; i++) {
            int randNum = (int)(Math.random() * BnumOfPerson) + AnumOfPerson;
            BteamArrayList.add(BteamArr[randNum]);
        }
         */

        allocArrayList(
                AteamArrayList, AteamArr, AnumOfPerson
        ); // A조 어레이리스트, A조 인원 배열,  A조 사람의 수정 ㅡ> allocArrayList에 입력 // 소괄호는 입력을 담는 상자( 0~8 배열, 방틀의 갯수 9)
        allocArrayList(
                BteamArrayList, BteamArr, BnumOfPerson
        );
    }

    public void allocArrayList(
            ArrayList<String> al,
            String[] arr,
            int loopNum) { // loopnum - a,b조 배열의 길이 (수)
        // a조 인원수에 대한 배열의 길이, b조 인원수에 대한 배열의 길이 -> a/b를 나눠서 하는게 아니라 하나의 길이

        boolean isDup = false;

        for(int i = 0; i < loopNum; i++) {
            // 우리는 A 배열, B 배열이 나눠진 케이스를 받으므로
            // 하나의 배열에서 모든 값을 처리하지 않는다.
            // 그러므로 start를 별도로 만들 필요가 없었다.
            // int randNum = (int)(Math.random() * loopNum) + start;
            do { // do-while문은 한번은 실행해야한다.
                int randNum = (int)(Math.random() * loopNum);

                if(al.contains(arr[randNum])) { // 랜덤 배열 객체 al이 존재한다면~ 있으면 참, 없으면 거짓
                    // al. arr 배열의 요소를 가지고 있다면~, al이 주체가 되어 if문 조건을 설정 [n]값이 있냐?
                    isDup = true;
                    continue; // 중복일 경우 다시 랜덤 값을 할당하여 중복이 아닐때까지 진행
                } else {
                    isDup = false; // 중복이 아닐 경우 while문을 빠져 나간다. 
                }

                al.add(arr[randNum]); // 랜덤값 배열 만큼 string 객체를 리스트에 추가 // 랜드넘에 있는
            } while(isDup); // 중복이면 while문을 계속 반복한다.
        }
    }

    public void printArrayList(ArrayList<String> al) { // 어레이리스트를 출력한다 //겟터를 통해 얻은 값을
        String name;
        // Iterator = 중복이 안된 위 String 객체 리스트(이름)를 한번 순회 할 수 있는
        // 정보를 획득 함.
        Iterator e = al.iterator(); // Iterator e(어레이리스트  객체를 반환(얻을 수 있다.)
        // e를 통해 순회할 수 있는 정보가 있다면
        int cnt = 1;
        int divNum;
        int quot = al.size() / numOfTeam; // 각 팀에 quot명을 팀으로 만듬 // 총 인원과 만들려는 팀의 갯수가 맍지 않는 경우를 판별하기위한 변수
                                          // a - 9명, b - 8명 ,  팀수 - 2개
        int remain = al.size() % numOfTeam; //  quot의 나머지

        boolean needException = // 예외적인 경우를 구별하기위해 만듬
                (remain > 0) ? true : false; // 팀 수 나머지가 영보다 크다면 참 아니면 거짓

        int randValue = 0; // randValue값 초기화
        // 현재 발생하는 문제
        // 1) 매 반복마다 randValue가 0, 1, 0, 1 스위칭되고 있음짓

        // 순회할 수 있는가 ?
        // 데이터가 없으면 루프 진행 x
        // 데이터가 하나라도 있으면 루프 진행
        while(e.hasNext()) {
            // 존재하는 값을 가져와서 Integer 형식으로 저장합니다. // 순회 할 수 있는거야? 위에 이터레이터를 보고
            name = (String) e.next(); // 순회 할 수 있다면 값을 나(e.next)한테 주고 name으로 대입하여 출력
            System.out.printf("%s ", name);// 이터레이터에서 가져온 객체 e에서 읽어올 요소가 있는지 확인한다.(이름) 나열

            // 현재 케이스에서는 무조건 앞에 5명이 나온다.
            // 그러므로 이것도 랜덤하게 4, 5 혹은 5, 4가 나오게 해줘야 한다.
            // needException은 A조에서 4,5 혹은 5,4로 랜덤으로 선택, 0~1값 한번만 출력하고 false출력하여 if문을 빠져나간다.
            if(needException) {
                randValue = (int)(Math.random() * 2); //인원에 대한 배치 0이면 4명 배치 아니면 1이면 5명 배치, remain값이 트루면 randvalue로 대입
                needException = false; // if문을 끝내기 위해 false
            }

            /*
            System.out.printf("cnt = %d, quot + randValue = %d\n",
                    cnt, quot + randValue);
             */
            // 4%4=0, 5%5=0이라면 // 4명이 될 경우 실행
            if((cnt % (quot + randValue)) == 0) { // quot =4 (9/2) + randValue(나머지가 1일경우가 또는 나머지가 0일 경우)
                System.out.println("");

                if(cnt == 4) {// if는 A팀이 4명이 될 경우 실행
                    randValue = 1;
                } else { // else는 A팀이 5명이 될 경우 실행
                    randValue = 0;
                }

                cnt = 0;
            }

            cnt++; // cnt 초기값이 0이므로 if문 조건이 충족될때까지 증
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