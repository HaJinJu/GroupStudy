import java.io.IOException;

public class MainClient {
    public static void main(String[] args) throws IOException {

        String ip = "192.168.0.217";
        int port = 7777;

        ClientSocketManger cm = new ClientSocketManger(ip, port);
        System.out.println("접속 완료");
        System.out.println("1가위, 2바위, 3보");

        cm.send(cm.getClientSocket());
        System.out.println("전송");
    }
}
