package Fifteenth;

import Fourteenth.SocketClient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Date;

public class SocketServerTest {
    public static void main(String[] args) {
        // 굳이 문자열을 정수로 바꾼 이유는 무엇인가요?
        int port = Integer.parseInt("33333");

        try {
            // 서버 소켓 (그냥 Socket 과는 다른 듯)
            // 첫 번째 인자로 정수를 보내면 port 가 셋팅 되고 서버가 켜지는듯?
            ServerSocket servSock = new ServerSocket(port);

            System.out.println("Server: Listening - " + port);

            while(true) {

                // 서버 기준
                // 상대(클라이언트) 의 접속 요청이 있었다면 요청을 승인하는 메서드.
                // 승인하고 상대의 소켓을 반환한다.
                // accept() 는 블로킹 연산이다.
               Socket clntSock = servSock.accept();

                System.out.println(
                        "[" + clntSock.getInetAddress() +
                                "] client connected"
                );

                // 내(서버)가 출력 할 것을 상대(클라이언트)의 OutputStream 에 저장하는 듯?
                OutputStream out    = clntSock.getOutputStream();
                // OutputStream 의 writer 를 안쓰고 PrintWriter 를 사용하는 이유는 무엇인가요?
                PrintWriter writer  = new PrintWriter(out, true);
                // Date 객체의 toString 을 적어서 저장한다.
                writer.println(new Date().toString());

                // 상대의 입력을 저장하는 InputStream 을 in 에 저장?
                InputStream in      = clntSock.getInputStream();
                // Buffer: 완충하다.
                // 입력 받기전에 완충을 하고 데이터를 읽어야 하기 때문에 필요한가?
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));


                System.out.println("msg: " + reader.readLine());
            }
        } catch (IOException e) {
            System.out.println("Server Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}