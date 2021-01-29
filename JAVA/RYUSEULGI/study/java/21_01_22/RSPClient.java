import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class RSPClient {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        RSP rspclass = new RSP();
        int port = 1234;
        String localHost = "172.20.10.10";

        try {
            Socket socket = new Socket(localHost, port);

            OutputStream out = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(out, true);

            System.out.println("가위 바위 보를 시작합니다.");
            System.out.println("1가위 2바위 3보 숫자를 입력하세요");
            int rsp = scan.nextInt();
            writer.println(rsp);

            InputStream in = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            System.out.println("상대방 : " + reader.read());

        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
