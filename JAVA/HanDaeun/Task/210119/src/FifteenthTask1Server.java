import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class FifteenthTask1Server {
    public static void main(String[] args) {
        int port = Integer.parseInt("33333");
        String receivedMsg;
        String sendMsg, rpsInput;

        try {
            System.out.println("Player 1 이 다른 플레이어를 기다리는 중입니다...\n");

            ServerSocket servSock = new ServerSocket(port);
            Socket clntSock = servSock.accept();

            OutputStream out = clntSock.getOutputStream();
            PrintWriter writer = new PrintWriter(out, true);

            InputStream in = clntSock.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            RockPaperScissors rps = new RockPaperScissors();
            Scanner scan = new Scanner(System.in);

            System.out.println("[" + clntSock.getInetAddress() + "] Player 2 가 입장하셨습니다.");


            while(true) {
                // 새로운 게임을 세팅
                sendMsg = "";
                writer.println(sendMsg);
                System.out.println(sendMsg);
                rps.setRpsInput();
                sendMsg = rps.getMsg();

                // Player 1(Server) 의 입력을 받음
                System.out.println(sendMsg);
                rps.setP2Wait();
                sendMsg = rps.getMsg();
                writer.println(sendMsg);
                rpsInput = scan.nextLine();

                // Player 2(Client) 의 입력을 받음
                rps.setRpsInput();
                sendMsg = rps.getMsg();
                writer.println(sendMsg);
                System.out.println(rps.getP1WAIT());
                receivedMsg = reader.readLine();

                // 플레이어들이 입력한 것을 양쪽에 모두 출력해줌
                System.out.println("Player 1: " + rpsInput);
                System.out.println("Player 2: " + receivedMsg);
                writer.println("Player 1: " + rpsInput);
                writer.println("Player 2: " + receivedMsg);

                // 게임의 결과를 양쪽에 모두 출력해줌
                rps.rpsPlay(rpsInput, receivedMsg);
                sendMsg = rps.getMsg();
                System.out.println(sendMsg);
                writer.println(sendMsg);
            }

        } catch (IOException e) {
            System.out.println("Server Exception: " + e.getMessage());

            e.printStackTrace();
        }
    }
}