import java.io.IOException;
import java.net.Socket;

public class ClientSocket extends SocketManger {
    private Socket clntSocket;

    public Socket getClientSocket() {
        return this.clntSocket;
    }

    public ClientSocket(String localHost, int port) throws IOException {
        super();
        clntSocket = new Socket(localHost, port);
    }
}
