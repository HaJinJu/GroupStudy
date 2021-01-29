package Homework.Eighteenth;

import java.io.IOException;
import java.util.Scanner;

// 게임에 접속해서 플레이 하는 고객
public class MainClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 집에서 하는 경우 자신의 집 컴퓨터 IP 주소
        // 학원인 경우는 자신의 자리 IP 주소 혹은 동일하게 해도 무방
        String ip = "192.168.35.53";
        // 포트 번호 : 7777
        int port = 7777;

        Scanner scan = new Scanner(System.in);

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

        // 데드락 방지를 위해 연결을 끊기 위한 메서드 호출
        csm.close(csm.getClntSock());

        // 아무 글자나 입력 받음
        scan.nextLine();

        // 다시 서버와 연결하기 위해 새로운 생성자 호출
        csm = new ClientSocketManager(ip, port);

        // 서버에서 송신한 가위바위보 게임 결과를 수신하고
        // 수신된 결과 출력을 위한 메서드 호출
        csm.recv(csm.getClntSock());

        /*
        Thread.sleep(1000);

        csm.recv(csm.getClntSock());
         */
    }
}
