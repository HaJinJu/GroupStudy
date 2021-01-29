// 20명이 승차 할 수 있는 열차
// 50명이 예매 하려고 하는데
// 50명 중 누가 예매해 성공했는지 출력하도록 프로그래밍
// 랜덤 사용하기, 1~20 중복되지 않게 하기
// 0 ~ 49 순차적으로 예매하는 형식은 아니다

import java.util.ArrayList;
import java.util.Iterator;

class Train {

    int possible;
    int ticketing;

    private int[] personNumArr;
    private int[] ticketNumArr;

    private ArrayList<Integer> personArrayList;
    private ArrayList<Integer> ticketArrayList;

    public int[] getPersonNumArr() {
        return this.personNumArr;
    }

    public int[] getTicketNumArr() {
        return this.ticketNumArr;
    }

    public Train(int possible, int ticketing) {
        this.possible = possible;
        this.ticketing = ticketing;

        ticketNumArr = new int[possible];
        personNumArr = new int[ticketing];

        // ticket만 있어도 무방
        personArrayList = new ArrayList<>();
        ticketArrayList = new ArrayList<>();
    }

    // 중복 없이 출력되게 만들기
    public int allocRandPersonNum() {

        boolean isDup = false;
        int randNum;

        do {
            randNum = (int) (Math.random() * 50);

            if (personNumArr[randNum] != 0) {
                isDup = true;
            } else {
                isDup = false;
                personNumArr[randNum] = 1;
            }
        } while (isDup);
        return randNum;
    }

    public void allocTicketNum(int personNum) {
        boolean isDup = false;
        int randNum;

        do {
            randNum = (int) (Math.random() * 20) + 1;

            // 더하기 1해줬으니깐 1빼기
            if (ticketNumArr[randNum - 1] != 0) {
                isDup = true;
            } else {
                // 중복이 아닌 경우에만 카운트 되게 하기
                isDup = false;
                ticketNumArr[randNum - 1] = personNum;
            }
        } while (isDup);
    }

    public void ticket() {

        int personNum;

        for (int i = 0; i < ticketing; i++) {
            personNum = allocRandPersonNum();
            System.out.printf("%3d", personNum);
            allocTicketNum(personNum);
        }
    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i] + 1);
        }
    }

    // ------------------------------------------
    // arrlist 사용한 내용 추가하기

    public int allocArrListPersonNum() {
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
        } while (isDup);

        return randNum;
    }

    public void allocArrListTicketNum() {
        int personNum;

        for (int i = 0; i < ticketing; i++) {
            personNum = allocRandPersonNum();
            ticketArrayList.add(personNum);
        }
    }

    public void arrListTicket() {

        int personNum;

        for (int i = 0; i < ticketing; i++) {
            personNum = allocArrListPersonNum();
            System.out.printf("%3d", personNum);
            ticketArrayList.add(personNum);
        }
    }

    public void printArrList() {
        Integer ticketNum;
        Iterator e = ticketArrayList.iterator();

        while (e.hasNext()) {
            ticketNum = (Integer) e.next();
            System.out.printf("3%d", ticketNum);
        }
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Train train = new Train(20, 50);

        train.ticket();
        System.out.println("------");
        train.printArr(train.getTicketNumArr());

        System.out.println("------");

        Train train2 = new Train(20, 50);
        train2.arrListTicket();
        train2.printArrList();

    }
}

// 포함하면 false
// contains() 포함하지 않으면 true ??
// hasNext() 순회 할 수 있는 지 묻는 것
// 데이터가 있으면 루프 진행한다