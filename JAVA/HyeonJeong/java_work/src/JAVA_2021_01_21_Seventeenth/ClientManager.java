package JAVA_2021_01_21_Seventeenth;

import java.io.IOException;
import java.net.Socket;

public class ClientManager extends SocketManager {
    private Socket clntSock;

    public ClientManager(String hostIp, int portNum)
            throws IOException {

        super();
        clntSock = new Socket(hostIp, portNum);
    }

    public Socket getClntSock() {
        return clntSock;
    }
}