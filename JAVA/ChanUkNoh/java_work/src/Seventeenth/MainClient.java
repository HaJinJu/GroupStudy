package Seventeenth;

import java.io.IOException;
import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) throws IOException, InterruptedException {

        String ip = "192.168.0.7";
        int port = 7777;

        Scanner scan = new Scanner(System.in);

        ClientSocketManager csm = new ClientSocketManager(ip, port);

        System.out.println("접속 요청 완료!");
        System.out.println("가위는 1, 바위는 2, 보는 3");

        csm.send(csm.getClntSock());

        System.out.println("전송 완료!");

        csm.close(csm.getClntSock());

        scan.nextLine();

        csm = new ClientSocketManager(ip, port);

        csm.recv(csm.getClntSock());
    }
}
