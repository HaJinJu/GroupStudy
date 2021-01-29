package Thirteenth;

import java.util.ArrayList;
import java.util.Iterator;

public class Ticketing {
    private int numOfHuman;
    private int numOfTicket;

    private ArrayList<Integer> personArrayList;
    private ArrayList<Integer> ticketArrayList;

    public Ticketing(int numOfHuman, int numOfTicket) {
        this.numOfHuman = numOfHuman;
        this.numOfTicket = numOfTicket;

        personArrayList = new ArrayList<Integer>();
        ticketArrayList = new ArrayList<Integer>();
    }

    private int allocArrayListRandomPersonNumber() {
        boolean isDup = false;
        int randNum;

        do {
            randNum = (int) (Math.random() * 50);

            if (personArrayList.contains(randNum)) {
                isDup = true;
            } else {
                isDup = false;
                personArrayList.add(randNum);
            }
        } while(isDup);

        return randNum;
    }

    public void ticketingArrayListTicket() {
        int personNum;

        for (int i = 0; i < numOfTicket; i++) {
            personNum = allocArrayListRandomPersonNumber();

            ticketArrayList.add(personNum);
        }
    }

    public void printTicketArrayList() {
        int cnt = 1;
        Integer ticketNum;
        // List 를 순회할 수 있는 Iterator 객체를 얻는다.
        Iterator e = ticketArrayList.iterator();

        // hasNext() - List 의 Next 값이 있는지 확인하는 메서드
        // 있는경우 true 를 반환하고 없다면 false 를 반환한다.
        while(e.hasNext()) {
            // next() - List 의 next 값을 사용하는 메서드
            // 캐스팅을 하는 이유?
            // List 에 담을 수 있는 디폴트 데이터타입은 Object 이다.
            // 모든 데이터타입을 받아올 수 있다.
            // 어떤 변수에 담아야 한다면 선언한 변수의 데이터타입으로
            // 형변환 해주어야 한다.
            ticketNum = (Integer) e.next();
            System.out.printf("%3d", ticketNum);

            if(cnt % 5 == 0) {
                System.out.println("");
            }

            cnt++;
        }
    }
}
