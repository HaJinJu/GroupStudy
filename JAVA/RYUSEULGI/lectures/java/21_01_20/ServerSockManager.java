import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSockManager extends SocketManager {

    private ServerSocket servSock;
    private Socket[] clientSockArr;

    private int clientCnt;
    private int maxClient;

    public ServerSockManager(int port, int max) throws IOException {
        super(max);

        // 쓰레드가 없기 때문에 지금 이렇게 작성하는 것임
        System.out.printf("%d명이 입장해야 게임 시작/n", max);
        servSock = new ServerSocket(port);
        clientCnt = 0;
        maxClient = max;

        // 메모리 할당을 해주어야 함
        clientSockArr = new Socket[max];
    }

    public void waitForClientRequest() throws IOException {
        System.out.println("사용자 접속 대기");

        for (int i = 0; i < maxClient; i++) {
            clientSockArr[clientCnt++] = servSock.accept();
        }
    }

    public void checkEachIpAdressInfo() {
        for (int i = 0; i < maxClient; i++) {
            System.out.println("[" + clientSockArr[i].getInetAddress() + "] 클라이언트 접속");
        }
    }

    // client socket을 사용해야 해서 배열로 바꿔준 거임
    public Socket[] getClientSockArr() {
        return this.clientSockArr;
    }

    public int getMaxClient() {
        return this.maxClient;
    }

}
