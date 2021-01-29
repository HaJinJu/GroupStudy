import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class RSPServer {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final int SISSOR = 1;
        final int ROCK = 2;
        final int PEPER = 3;

        InputStream in;
        OutputStream out;
        BufferedReader reader;
        PrintWriter writer;

        int port = 1234;

        try {
            ServerSocket server = new ServerSocket(port);

            while (true) {
                System.out.println("접속을 기다리는 중입니다.");
                Socket clnt = server.accept();
                System.out.println(clnt.getInetAddress() + "접속");

                out = clnt.getOutputStream();

                System.out.println("가위 바위 보를 시작합니다.");
                System.out.println("1가위 2바위 3보 숫자를 입력하세요");
                int rsp = scan.nextInt();
                out.write(rsp);

                in = clnt.getInputStream();
                reader = new BufferedReader(new InputStreamReader(in));

                System.out.println("상대방 : " + reader.read());

                if (reader.read() == rsp) {
                    System.out.println("무승부");
                } else if (reader.read() == SISSOR && rsp == PEPER) {
                    System.out.println("user 승!");
                } else if (reader.read() == ROCK && rsp == SISSOR) {
                    System.out.println("user 승~");
                } else if (reader.read() == PEPER && rsp == ROCK) {
                    System.out.println("user 승");
                } else {
                    System.out.println("computer 승");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
