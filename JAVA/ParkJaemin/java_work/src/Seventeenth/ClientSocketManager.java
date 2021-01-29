package Seventeenth;

import java.io.IOException;
import java.net.Socket;

public class ClientSocketManager extends SocketManager {// 클라이언트 소켓 매니저가 소켓매니저를 상속 받음
    private Socket clntSock;

    public ClientSocketManager(String hostIp, int portNum) // 문자열로 ip,  포트번호
            throws IOException {

        super(); // 기본 생성자 호출(상속)
        clntSock = new Socket(hostIp, portNum); // ip , 포트번호 clntsock 변수에 대입
    }

    public Socket getClntSock() {
        return clntSock;
    } // ip, 포트번호 값 겟터를 통해 받음.
}
