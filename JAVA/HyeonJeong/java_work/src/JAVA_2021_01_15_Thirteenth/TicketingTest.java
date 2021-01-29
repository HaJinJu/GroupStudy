package JAVA_2021_01_15_Thirteenth;

import java.util.ArrayList;

public class TicketingTest {
    public static void main(String[] args) {
        // Queue(ArrayList) 연습문제
        // 20명이 승차할 수 있는 열차가 있다.
        // 이 열차에 50명이 예매를 하려고 한다.
        // 50명중 누가 예매에 성공했는지 출력하도록 프로그래밍 해보자!
        // 랜덤을 사용해야 한다.
        // 1 ~ 20 까지는 중복되지 않는 숫자가 할당된다.
        // 사용자는 0 ~ 49까지 순차적으로 예매를 하는 형식이 아니며
        // 렌덤한 숫자로 0 ~ 49까지중 선별되어 예매를 할 수 있게 되어있는 시스템이다.
        Ticketing t = new Ticketing(50, 20);

        //t.printPersonNumber();
        t.ticketingTicket();
        System.out.println("*********************");
        t.printArr(t.getTicketNumberArr());

        System.out.println("++++++++++++++++++++++++");
        Ticketing t2 = new Ticketing(50, 20);
        t2.ticketingArrayListTicket();
        System.out.println("++++++++++++++++++++++++");
        t2.printTicketArrayList();
    }
}