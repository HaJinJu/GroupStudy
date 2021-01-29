import java.io.IOException;
import java.net.Socket;

public class ClientSocketManger extends SocketManager {
    private Socket clientSocket;

    public Socket getClientSocket() {
        return this.clientSocket;
    }

    public ClientSocketManger(String hostIp, int port) throws IOException {
        super();
        clientSocket = new Socket(hostIp, port);
    }
}
