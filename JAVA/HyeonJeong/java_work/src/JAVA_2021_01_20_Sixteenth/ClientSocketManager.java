package JAVA_2021_01_20_Sixteenth;

import java.io.IOException;
import java.net.Socket;

public class ClientSocketManager extends SocketManager {
    private Socket clntSock;

    public ClientSocketManager(String hostIp, int portNum)
            throws IOException {

        super();
        clntSock = new Socket(hostIp, portNum);
    }

    public Socket getClntSock() {
        return clntSock;
    }
}