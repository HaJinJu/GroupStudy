package Twentyoneth;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ThreadChatServer {
    static Vector<ClientHandler> chv = new Vector<>();

    static int i=0;

    public static void main(String[] args) throws IOException {
        // 서버의 서비스(7777)을 시
        ServerSocket servSock = new ServerSocket(7777);
        Socket sock;
        for (;;){
            System.out.println("지금부터 클라이언트의 입장을 대기합니다.");
            sock = servSock.accept();
            System.out.println("New Client Request Received: " + sock);
            // 송신 및 수신 채널 할당
            DataInputStream in = new DataInputStream(sock.getInputStream());
            DataOutputStream out = new DataOutputStream(sock.getOutputStream());

            System.out.println("New Handler for this Client!");

            // 클라이언트용 핸들러 작성 필요작
            // 서버와 클라언트 요청에 대한 응답 처리
            ClientHandler ch = new ClientHandler(in,out,"client"+i,sock);

            Thread t = new Thread(ch);

            System.out.println("Client List Management!");

            chv.add(ch);

            t.start();

            i++;
        }
    }
}
