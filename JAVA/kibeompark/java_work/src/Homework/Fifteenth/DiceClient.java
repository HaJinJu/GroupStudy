package Homework.Fifteenth;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class DiceClient {
    public static void main(String[] args) {
        String hostname = "";

        int port = 33333;

        Scanner scan = new Scanner(System.in);

        try {
            Socket sock = new Socket(hostname, port);

            OutputStream out = sock.getOutputStream();

            InputStream in = sock.getInputStream();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(in));

            DiceGame dg = new DiceGame();

            int diceNum = dg.playGame();
            out.write(diceNum);

            dg.printGame(diceNum, Integer.parseInt(reader.readLine()));

        } catch (UnknownHostException e) {
            System.out.println("Server Not Found : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error : " + e.getMessage());
        }
    }
}
