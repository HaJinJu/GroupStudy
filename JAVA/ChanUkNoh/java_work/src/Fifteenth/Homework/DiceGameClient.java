package Fifteenth.Homework;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class DiceGameClient {
    public static void main(String[] args) {
        String hostname = "192.168.0.76";
        int port = 33333;

        for (int i = 0; i < 10; i++) {
            try {
                Socket sock = new Socket(hostname, port);

                OutputStream out = sock.getOutputStream();

                InputStream in = sock.getInputStream();

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                DiceGame dg = new DiceGame();
                int clntDice = dg.rollDice();

                out.write(clntDice);

                int servDice = reader.read();

                dg.game(clntDice, servDice);

            } catch (UnknownHostException e) {
                System.out.println("Server Not Fount: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("I/O Error: " + e.getMessage());
            }
        }
    }
}
