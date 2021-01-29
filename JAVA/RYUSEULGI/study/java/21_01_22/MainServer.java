import java.io.IOException;

public class MainServer {
    public static void main(String[] args) throws IOException {

        final int CLIENT = 2;
        ServSocket servSocket = new ServSocket(33333, CLIENT);

        int cnt = 0;

        while (cnt != CLIENT) {
            servSocket.waitClient();
            servSocket.recv(servSocket.getClientArr());
            cnt++;
        }

        System.out.println("게임 시작!");

        if (servSocket.game(servSocket.getClientNum())) {
            System.out.println("게임 종료");
        } else {
            System.out.println("무승부");
        }

        cnt = 0;

        servSocket.setClientcnt(0);

        while (cnt != CLIENT) {
            System.out.println("결과 전달중");
            servSocket.waitClient(); // 다시 요청 확인하는 이유는?
            servSocket.send(servSocket.getClientArr());
            cnt++;
        }

        System.out.println("결과 전달 완료");
    }
}
