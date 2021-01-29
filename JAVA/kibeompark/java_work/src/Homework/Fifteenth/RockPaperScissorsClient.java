package Homework.Fifteenth;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class RockPaperScissorsClient {
    public static void main(String[] args) {
        String hostname = "";

        int port = 33333;

        Scanner scan = new Scanner(System.in);

        try {
            Socket clntSock = new Socket(hostname, port);

            OutputStream out = clntSock.getOutputStream();

            InputStream in = clntSock.getInputStream();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(in));

            RockPaperScissors rps = new RockPaperScissors();

            int clntNum = scan.nextInt();
            out.write(clntNum);

            rps.playGame(clntNum, reader.read());

        } catch (UnknownHostException e) {
            System.out.println("Server Not Found : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error : " + e.getMessage());
        }
    }
}
