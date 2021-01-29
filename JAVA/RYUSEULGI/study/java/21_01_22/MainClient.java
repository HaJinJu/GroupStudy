import java.io.IOException;

public class MainClient {
    public static void main(String[] args) throws IOException {

        String localHost = "172.20.10.10";
        int port = 33333;

        ClientSocket clientSocket = new ClientSocket(localHost, port);

        System.out.println("1가위 2바위 3보 입니다.");

        clientSocket.send(clientSocket.getClientSocket());
        System.out.println("전송완료! 잠시만 기다려주세요");
        clientSocket.recv(clientSocket.getClientSocket());
    }
}
