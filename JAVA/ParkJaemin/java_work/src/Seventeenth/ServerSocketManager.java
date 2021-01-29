package Seventeenth;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketManager extends SocketManager {
    private ServerSocket servSock;
    private Socket[] clntSockArr;

    private int clntCnt;
    private int maxClnt;

    public ServerSocketManager(int portNum, int max)// 서버 소켓 매니저 메서드 생성(포트번호, 참여인원)
            throws IOException { // 예외 발생 시 예외 처리

        super(max); // 소켓매니저 max값 조상님 호출

        System.out.printf("%d 명이 접속해야 게임을 시작할 수 있습니다.\n", max);
        // max인원 만큼 접속하면 게임 시작할 수 있다 출력

        servSock = new ServerSocket(portNum); //포트번호 servsock에 대입

        clntCnt = 0; // 초기 값
        maxClnt = max; // max값 maxclant(최대 참여인원)에 대입

        clntSockArr = new Socket[max]; // 클라이언트의 인원을 배열화
    }

    public void waitForClientRequest() throws IOException {
        System.out.println("사용자 접속을 대기합니다.");

        clntSockArr[clntCnt] = servSock.accept();
        //참여인원 배열  //포트넘버를 통해 연결을 받아 들인다(클라이언트의 서버 소켓 기준)


        System.out.println(
                "[" + clntSockArr[clntCnt++].getInetAddress() +
                        "] client connected" // 참여 클라이언트의 ip정보를 받고 "연결됐다"를 출력
        );
    }

    public void checkEachIpAddressInfo() {
        for(int i = 0; i < maxClnt; i++) {

        }
    }

    public Socket[] getClntSockArr() {
        return clntSockArr;
    } // 참여인원 배열 값 겟터

    public int getMaxClnt() {
        return maxClnt;
    } // 최대 참여인원 값 겟터

    public void setClntCnt(int clntCnt) {
        this.clntCnt = clntCnt;
    } // 클
}
