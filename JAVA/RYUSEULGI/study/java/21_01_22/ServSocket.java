import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServSocket extends SocketManger {

    private ServerSocket serverSocket;
    private Socket[] clientArr;

    private int clientcnt;
    private int clientNum;

    public Socket[] getClientArr() {
        return this.clientArr;
    }

    public int getClientNum() {
        return this.clientNum;
    }

    public void setClientcnt(int clientcnt) {
        this.clientcnt = clientcnt;
    }

    public ServSocket(int port, int clientNum) throws IOException {

        System.out.printf("%d명이 접속해야 합니다.\n", clientNum);
        serverSocket = new ServerSocket(port);
        clientcnt = 0;

        clientArr = new Socket[clientNum];
    }

    public void waitClient() throws IOException {
        System.out.println("사용자 접속을 대기합니다.");
        clientArr[clientcnt] = serverSocket.accept();
        System.out.println(clientArr[clientcnt++].getInetAddress() + "접속");
    }

}
