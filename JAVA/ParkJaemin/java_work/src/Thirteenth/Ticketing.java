package Thirteenth;

import java.util.ArrayList;
import java.util.Iterator;

public class Ticketing {
    private int numOfHuman; // 사람의 수
    private int numOfTicket; // 티켓의 수

    private int[] personNumberArr; // 사람의 수 배열
    private int[] ticketNumberArr; // 티켓의 수 배열

    private ArrayList<Integer> personArrayList; // ArrayList사람
    private ArrayList<Integer> ticketArrayList; // ArrayList티켓

    public Ticketing(int numOfHuman, int numOfTicket) { // 티켓팅 이라는 생성자 호출
        this.numOfHuman = numOfHuman;
        this.numOfTicket = numOfTicket;

        // 사실 현재 케이스에서는 배열만 쓰거나
        // ArrayList만 쓰는것이 좋지만
        // 약간 손 볼 곳이 많으므로
        // 그냥 둘 다 할당하도록 한다.
        personNumberArr = new int[50]; // 전체 사람 50명
        ticketNumberArr = new int[20]; // 전체 티켓 20명

        personArrayList = new ArrayList<Integer>(); //int 타입의 ArrayList(사람)
        ticketArrayList = new ArrayList<Integer>(); //int 타입의 ArrayList(티켓)
    }

    public int allocRandomPersonNumber() { // 사람의 번호 임의 할당
        boolean isDup = false; // 중복이면 false
        int randNum; // 난수

        do { // do-while 문 활용
            randNum = (int) (Math.random() * 50);
            // 랜덤 값 할당 전체 50명 사람의 번호
            if (personNumberArr[randNum] != 0) {
                isDup = true; // 중복이 아니라면 if문을 벗어난다.
            } else {
                isDup = false;
                personNumberArr[randNum] = 1;
            }
        } while (isDup);

        return randNum; // 중복이면 다시 번호 할당?
    }

    public void allocTicket(int personNum) { // 전체 50명 중 20장의 티켓을 할당
        boolean isDup = false;// boolean의 기본값
        int randNum;

        do {
            randNum = (int) (Math.random() * 20) + 1;
            // 랜덤 값 할당 - 전체 티켓 20장
            if (ticketNumberArr[randNum - 1] != 0) {
                isDup = true; // 중복이 아닐 경우 if문을 벗어난다.
            } else {
                isDup = false;
                ticketNumberArr[randNum - 1] = personNum;
                // 티켓 20장 중복일 경우 다시 와일을 통해 랜덤 값 재할당? = 50명
            }
        } while (isDup);
    }

    public void ticketingTicket() {
        // 1) 랜덤한 중복되지 않는 0 ~ 49까지의 값으로 사람 번호 매기기
        // 2) 랜덤한 중복되지 않는 0 ~ 19까지의 값으로 예매하기
        int personNum;
        //int cnt = 1;

        for (int i = 0; i < numOfTicket; i++) {
            personNum = allocRandomPersonNumber();
            //System.out.printf("%3d", personNum);

            //if(cnt % 5 == 0) {
            //    System.out.println("");
            //}

            //cnt++;

            allocTicket(personNum); // 인원수만큼 티켓 할당
        }
    }


    public int allocArrayListRandomPersonNumber() { // 사람들 번호 무작위 어레이 리스트 할당
        boolean isDup = false; // 중복이면 false
        int randNum;

        do {
            randNum = (int) (Math.random() * 50); // 50명 랜덤번호 randnum에 할당

            // 현재 ArrayList에 randNum이 있나요 ?
            if (personArrayList.contains(randNum)) {
                //.contains는 randNum에 중복이 포함되어 있는지 확인하는 함수인가?
                isDup = true;
            } else {
                isDup = false;
                personArrayList.add(randNum);
            }
        } while (isDup);

        return randNum; // 중복일 경우 다시 호출한 randNum으로 그냥 되돌아간다.
    }

    public void ticketingArrayListTicket() { // 티켓팅을 한 사람들의 어레이 리스트 메서드
        int personNum;

        for (int i = 0; i < numOfTicket; i++) { // 티켓의 수만큼 for문 가동
            personNum = allocArrayListRandomPersonNumber();
            // 랜덤 할당된 사람의 수만큼 티켓 할당(50명중 20명)

            ticketArrayList.add(personNum); // 50명 중 랜덤으로 20명이 티켓팅에 성공 add
        }
    }

    /*
    public void printPersonNumber() {
        int cnt = 1;
        for(int i = 0; i < personNumberArr.length; i++) {
            System.out.printf("%3d", personNumberArr[i]);
            if(cnt % 5 == 0) {
                System.out.println("");
            }
            cnt++;
        }
    }
     */

    public void printTicketArrayList() { // 티켓 어레이 리스트 20장 출력 메서드
        int cnt = 1; // 초기값 1
        Integer ticketNum; // 티겟 번호
        // Iterator = ticketArrayList를 한번 순회 할 수 있는 정보를 획득
        // 50명중 20명이 티켓팅한 정보 획득
        Iterator e = ticketArrayList.iterator(); // Iterator 객체를 반환

        while (e.hasNext()) {// hasNext()를 통해 읽어올 요소가 있는지 확인
            ticketNum = (Integer) e.next(); // 해당 e=tickeArrayList의 정보를 ticketNum에 저장(대입)
            System.out.printf("%3d", ticketNum); // 20명의 티켓팅한 사람들의 번호 출력
            if (cnt % 5 == 0) { // 5명씩 출력 후 줄 바꿈
                System.out.println("");
            }

            cnt++;
        }
    }

    public void printArr(int[] arr) {//50명중 티켓을 받은 20명을 배열로 출력하는 메서드
        int cnt = 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]+1);

            if (cnt % 5 == 0) {
                System.out.println("");
            }

            cnt++;
        }
    }

    public int[] getPersonNumberArr() {
        return personNumberArr;
    }

    public int[] getTicketNumberArr() {
        return ticketNumberArr;
    }
}