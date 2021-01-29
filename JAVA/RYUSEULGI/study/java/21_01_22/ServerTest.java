import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTest {

    public static void main(String[] args) {
        // 포트번호 설정
        int port = Integer.parseInt("33333");

        try {
            ServerSocket serverSocket = new ServerSocket(port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println(clientSocket.getInetAddress() + "접속");

                OutputStream out = clientSocket.getOutputStream();
                PrintWriter writer = new PrintWriter(out, true);

                // 보내기 문자열로 전송해야 한다.
                writer.println(new Date().toString());

                InputStream in = clientSocket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                // 받기
                System.out.println(reader.readLine());

                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
