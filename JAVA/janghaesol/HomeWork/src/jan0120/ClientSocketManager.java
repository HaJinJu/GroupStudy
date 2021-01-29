package jan0120;

import java.io.IOException;
import java.net.Socket;


public class ClientSocketManager extends SocketManager {
    private Socket clntSock;
           // int    sock
    public ClientSocketManager(String hostIp, int portNum)
            throws IOException {

        super();
        clntSock = new Socket(hostIp, portNum);
    }

    public Socket getClntSock() {
        return clntSock;
    }
}