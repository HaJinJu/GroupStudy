package Question7;

import ClassList.DiceGame;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Question7Client {
    public static void main(String[] args) {
        String hostname;
        int port;
        String sendMsg, receivedMsg;
        Scanner scan = new Scanner(System.in);

        // 서버의 정보를 입력받아 접속함
        System.out.print("접속하려는 서버의 IP 주소 : ");
        hostname = scan.nextLine();
        System.out.print("사용하려는 서비스의 포트 번호 : ");
        port = Integer.parseInt(scan.nextLine());


        try {
            Socket sock = new Socket(hostname, port);

            OutputStream out = sock.getOutputStream();
            PrintWriter writer = new PrintWriter(out, true);

            InputStream in = sock.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            DiceGame dice = new DiceGame();
            System.out.println("\n당신은 Player2 입니다.");


            while(true) {
                receivedMsg = reader.readLine();
                System.out.println(receivedMsg);

                // 클라이언트의 입력이 필요할 때만 입력값을 서버에 넘겨줌
                if(receivedMsg.equals(dice.getINPUT())) {
                    sendMsg = scan.nextLine();
                    writer.println(sendMsg);
                }
            }

        } catch (UnknownHostException e) {
            System.out.println("Server Not Found: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}