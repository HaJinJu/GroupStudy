package Fifteenth.Homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class DiceGameServer {
    public static void main(String[] args) {
        int port = Integer.parseInt("33333");

        try {
            ServerSocket servSock = new ServerSocket(port);

            System.out.println("Server: Listening - " + port);

            while(true) {
                Socket clntSock = servSock.accept();

                System.out.println("노찬욱 접속");

                OutputStream out = clntSock.getOutputStream();

                InputStream in = clntSock.getInputStream();

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                DiceGame dg = new DiceGame();
                int servDice = dg.rollDice();

                out.write(servDice);

                int clntDice = reader.read();

                dg.game(servDice, clntDice);

            }
        } catch (IOException e) {
            System.out.println("Server Exception: " + e.getMessage());
        }
    }
}
