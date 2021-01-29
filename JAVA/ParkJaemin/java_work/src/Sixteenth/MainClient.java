package Sixteenth;

import java.io.IOException;

// 게임에 접속해서 플레이하는 고객
public class MainClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 클라이언트 소켓 클래스에 있는 예외처리를 못할 경우 최초 호출 지점인 메인 메서드로 예외가 온 상태
        // Interruped Exception은 쓰레드 (sleep(), wait(), join() - 일시정지 상태 기능 보유)에
        // 호출하면 throw Interrupet Exception이 발생

        // 집에서 하는 경우 자신의 집 컴퓨터 아이피 주소
        // 학원인 경우는 자신의 자리 ip 주소 혹은 동일하게 해도 무방
        String ip = "192.168.0.9"; // ip
        int port = 7777; // 포트번호

        ClientSocketManager csm = new ClientSocketManager(ip, port);
        // 클라이언트소켓 매니저 객체의 참조변수 csm ip, 포트값

        System.out.println("접속 요청 완료!");
        System.out.println("가위는 1, 바위는 2, 보는 3");

        csm.send(csm.getClntSock()); // ip, 포트값을 보낸다

        System.out.println("전송 완료!");

        /*
        Thread.sleep(1000);
        csm.recv(csm.getClntSock());
         */
    }
}
