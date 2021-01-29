package Fifteenth.Homework;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class RSPClient {
    public static void main(String[] args) {
        String hostname = "192.168.0.76";

        int port = 33333;

        for (int i = 0; i < 10; i++) {
            try {
                Socket sock = new Socket(hostname, port);

                OutputStream out = sock.getOutputStream();

                InputStream in = sock.getInputStream();

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                RSP_Game rg = new RSP_Game();

                Scanner scan = new Scanner(System.in);
                int client = scan.nextInt();
                rg.printRSP(client);

                out.write(client);

                int server = reader.read();

                rg.game(client, server);

            } catch (UnknownHostException e) {
                System.out.println("Server Not Found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("I/O Error: " + e.getMessage());
            }
        }
    }
}
