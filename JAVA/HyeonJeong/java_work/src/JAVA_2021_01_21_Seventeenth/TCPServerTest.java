package JAVA_2021_01_21_Seventeenth;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {
    static public ServerSocket server;

    static public void main(String[] a) throws IOException {

        server = new ServerSocket(9303);

        System.out.println("listening...");

        Socket sock = server.accept();

        System.out.println("connected:" + sock.getInetAddress().getHostAddress());

        InputStream in = sock.getInputStream();

        System.out.println("inputstream:" + in.available());

        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        while(true) {

            String read = br.readLine();
            System.out.println("readline:" + read);

        }
        /*
        int err = 0;
        byte [] b = new byte[5];
        err = in.read(b, 0, 5);
        System.out.println("error=" + err);
        System.out.println("b=" + b);
        */

    }
}
