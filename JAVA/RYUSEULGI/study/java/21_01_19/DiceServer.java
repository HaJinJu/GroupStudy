// 전략짜기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DiceServer {
    public static void main(String[] args) {

        int port = 5555;
        Dice dice = new Dice();

        try {
            ServerSocket server = new ServerSocket(port);

            while (true) {
                Socket client = server.accept();
                System.out.println("클라이언트 접속" + client.getInetAddress());

                OutputStream out = client.getOutputStream();
                PrintWriter printWriter = new PrintWriter(out, true);

                int serverNum = dice.randomDice();

                printWriter.println("주사위 던지기");
                printWriter.println(serverNum);

                InputStream input = client.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input));

                int clientNum = bufferedReader.read();
                System.out.println(clientNum);

                dice.printWinner(serverNum, clientNum);
                // ??
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
