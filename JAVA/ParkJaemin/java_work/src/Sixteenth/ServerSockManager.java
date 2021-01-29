package Sixteenth;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class ServerSocketManager extends SocketManager { // 소켓매니저 자손 역할
    private ServerSocket servSock;
    private Socket[] clntSockArr;

    private int clntCnt;
    private int maxClnt;

    public ServerSocketManager(int portNum, int max) // 서버 소켓 매니저 메서드 생성 (포트번호, 참여인원)
            throws IOException { // 예외발생시 예외처리

        super(max); // 조상님 호출

        // 참여인원 3명이 접속해야 게임 시작
        System.out.printf("%d 명이 접속해야 게임을 시작할 수 있습니다.\n", max);

        servSock = new ServerSocket(portNum); // 서버 소켓 =포트번호

        clntCnt = 0; // 초기값
        maxClnt = max; // 최대 참여 인원

        clntSockArr = new Socket[max]; // 참여인원을 배열화
    }

    public void waitForClientRequest() throws IOException {
        System.out.println("사용자 접속을 대기합니다.");

        for(int i = 0; i < maxClnt; i++) { // 최대 참여인원 만큼 for문 실행
            clntSockArr[clntCnt++] = servSock.accept();
            //for문만큼 참여인원 배열 - 3명 // 포트넘버를 통해 연결을 받아들인다
        }
    }

    public void checkEachIpAddressInfo() {
        for(int i = 0; i < maxClnt; i++) {
            System.out.println(
                    "[" + clntSockArr[i].getInetAddress() +
                            "] client connected" // 참여인원의 ip주소를 얻고 연결이 됐습니다를 출력
            );
        }
    }

    public Socket[] getClntSockArr() {
        return clntSockArr;
    } // 참여인원 배열 값 겟터

    public int getMaxClnt() {
        return maxClnt;
    } // 최대 참여 인원 값 겟터
}