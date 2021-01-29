package Homework.Eighteenth;

import java.io.IOException;
import java.net.Socket;

// SocketManager의 상속을 받는 ClientSocketManager 클래스
public class ClientSocketManager extends SocketManager {
    // 클라이언트 소켓 객체 선언
    private Socket clntSock;

    // 생성자 선언
    public ClientSocketManager(String hostIp, int portNum)
            throws IOException {

        // 부모 클래스인 SocketManager의 생성자(send용, 클라이언트 입장) 참조
        super();
        // 클라이언트 IP와 포트 번호를 대입하여 클라이언트 소켓 생성
        clntSock = new Socket(hostIp, portNum);
    }

    // 클라이언트 소켓을 반환하는 Getter 메서드
    public Socket getClntSock() {
        return clntSock;
    }
}
