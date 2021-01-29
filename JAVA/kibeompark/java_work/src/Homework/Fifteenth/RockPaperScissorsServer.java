package Homework.Fifteenth;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class RockPaperScissorsServer {
    public static void main(String[] args) {
        int port = Integer.parseInt("33333");

        Scanner scan = new Scanner(System.in);

        try {
            ServerSocket servSock = new ServerSocket(port);

            System.out.println("Server : Listening - " + port);

            while (true) {
                Socket clntSock = servSock.accept();

                System.out.println("[" + clntSock.getInetAddress() + "] client connected");

                OutputStream out = clntSock.getOutputStream();

                // PrintWriter writer = new PrintWriter(out, true);

                InputStream in = clntSock.getInputStream();

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                RockPaperScissors rps = new RockPaperScissors();

                int servNum = scan.nextInt();
                out.write(servNum);

                rps.playGame(servNum, reader.read());

            }
        } catch (IOException e) {
            System.out.println("Server Exception : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
