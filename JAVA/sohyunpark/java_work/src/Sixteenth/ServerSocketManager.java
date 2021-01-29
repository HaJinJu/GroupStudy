package Sixteenth;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketManager extends SocketManager {
    private ServerSocket servSock; // 서버 소켓
    private Socket[] clntSockArr;

    private int clntCnt;
    private int maxClnt;

    public ServerSocketManager(int portNum, int max) throws IOException {

        super(max);

        System.out.printf("%d 명이 접속해야 게임을 시작할 수 있습니다.\n", max);

        // 서버에 대한 소켓을 획득
        servSock = new ServerSocket(portNum);

        clntCnt = 0;
        maxClnt = max;

        clntSockArr = new Socket[max];
    }

    public void waitForClientRequest() throws IOException {
        System.out.println("사용자 접속을 대기합니다.");

        for (int i = 0; i < maxClnt; i++) {
            // 3명의 클라이언트 요청 승인
            clntSockArr[clntCnt++] = servSock.accept();
        }
    }

    // 3명의 클라이언트 IP 주소 연결 확인
    public void checkEachIpAddressInfo() {
        for(int i = 0; i < maxClnt; i++) {
            System.out.println("[" + clntSockArr[i].getInetAddress()
                    + "] client connected");
        }
    }

    // 3개 클라이언트 소켓
    public Socket[] getClntSockArr() {
        return clntSockArr;
    }

    // maxClnt = 3
    public int getMaxClnt() {
        return maxClnt;
    }
}