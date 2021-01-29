package Fifteenth.Homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class RSPServer {
    public static void main(String[] args) {
        int port = Integer.parseInt("33333");

        try {
            ServerSocket servSock = new ServerSocket(port);

            System.out.println("Server: Listening - " + port);

            while (true) {
                Socket clntSock = servSock.accept();

                System.out.println("노찬욱 연결");

                OutputStream out = clntSock.getOutputStream();

                InputStream in = clntSock.getInputStream();

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                RSP_Game rg = new RSP_Game();

                Scanner scan = new Scanner(System.in);
                int server = scan.nextInt();
                rg.printRSP(server);

                out.write(server);

                int client = reader.read();

                rg.game(server, client);
            }
        } catch (IOException e) {
            System.out.println("Server Exception: " + e.getMessage());

            e.printStackTrace();
        }
    }
}
