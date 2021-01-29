package Sixteenth;

import java.io.IOException;
import java.net.Socket;

public class ClientSocketManager extends SocketManager {
    private Socket clntSock; // 클라이언트 소켓

    // 생성자
    public ClientSocketManager(String hostIp, int portNum) throws IOException {

        super();
        // 클라이언트에 대한 소켓을 획득
        clntSock = new Socket(hostIp, portNum);
    }

    public Socket getClntSock() {
        return clntSock;
    }
}
