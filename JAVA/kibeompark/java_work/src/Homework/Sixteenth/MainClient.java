package Homework.Sixteenth;

import java.io.IOException;

// 게임에 접속해서 플레이 하는 고객
public class MainClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 집에서 하는 경우 자신의 집 컴퓨터 IP 주소
        // 학원인 경우는 자신의 자리 IP 주소 혹은 동일하게 해도 무방
        String ip = "192.168.35.207";
        // 포트 번호 : 7777
        int port = 7777;

        // 클라이언트 소켓을 관리하는 클래스 선언
        // ip : 클라이언트 IP, 포트 번호 : 7777
        ClientSocketManager csm = new ClientSocketManager(ip, port);

        // 접속 요청이 받아들여지면
        // 알림 메시지와 함께 게임 시작을 위한 문구 출력
        System.out.println("접속 요청 완료 !");
        System.out.println("가위는 1, 바위는 2, 보는 3");

        // 클라이언트가 입력한 값을 서버로 보내주는 메서드 호출
        csm.send(csm.getClntSock());

        // 서버로 입력 값을 송신한 후 출력되는 확인 메시지
        System.out.println("전송 완료 !");

        /*
        Thread.sleep(10000);

        csm.recv(csm.getClntSock());
         */
    }
}
