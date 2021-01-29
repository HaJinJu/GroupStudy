package Sixteenth;

import java.io.IOException;

public class MainClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        String ip = "";
        int port = 7777;

        ClientSocketManager csm = new ClientSocketManager(ip, port);

        // 확인용
        System.out.println("접속 요청 완료!");

        System.out.println("가위: 1,  바위: 2,  보: 3");

        csm.send(csm.getClntSock());

        System.out.println("전송 완료");

        csm.close(csm.getClntSock());
    }
}
