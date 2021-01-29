package Sixteenth;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketManager extends SocketManager {
    ServerSocket servSock;

    private int maxClnt;
    private int clntCnt;

    private Socket[] clntSockArr;

    public ServerSocketManager(int port, int max) throws IOException {
        servSock = new ServerSocket(port);

        System.out.printf("%d 명이 접속해야 게임을 시작할 수 있습니다.", max);

        maxClnt = max;
        clntCnt = 0;
    }

    // 클라이언트를 들어오는 순서대로 접속을 허락하고
    // 클라이언트 소켓을 배열로 모아준다.
    public void waitForClientRequest() throws IOException {
        System.out.println("사용자 접속을 대기합니다.");

        for (int i = 0; i < maxClnt; i++) {
            clntSockArr[clntCnt++] = servSock.accept();
        }
    }

    // 들어온 클라이언트의 IP주소를 확인하는 메서드
    public void checkEachIpAddressInfo() {
        for (int i = 0; i < maxClnt; i++) {
            System.out.println(
                    "[" + clntSockArr[i].getInetAddress() +
                            "[ client connected"
            );
        }
    }

    public Socket[] getClntSockArr() {
        return clntSockArr;
    }

    public int getMaxClnt() {
        return maxClnt;
    }

}
