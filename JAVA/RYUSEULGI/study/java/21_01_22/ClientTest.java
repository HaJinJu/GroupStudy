import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {

    public static void main(String[] args) {
        int port = 33333;
        String localHost = "172.20.10.10";

        try {
            Socket socket = new Socket(localHost, port);

            OutputStream out = socket.getOutputStream();
            String str = "hello server";
            // 바이트 단위로 쪼개 보내기
            out.write(str.getBytes());

            InputStream in = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            System.out.println(reader.readLine());

        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
