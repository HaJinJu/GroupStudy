package Fifteenth;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClientTest {
    public static void main(String[] args) {
        String hostname = "192.168.0.76";
        int port = 33333;

        for (int i = 0; i < 10; i++) {
            try {

                // 내가 접속할 서버의 IP 주소를 첫 번째 인자로,
                // 해당 IP 주소의 여러가지 서비스 중 내가 이용하고 싶은 서비스의
                // 포트 번호를 두 번째 인자로 보내면 서버에 접속 요청을 할 수 있다.
                // 접속요청이 accept 되면 서버 소켓이 sock 에 담긴다.
                Socket sock = new Socket(hostname, port);

                // 클라이언트 기준
                // 상대(서버)가 출력을 받을 수 있도록 설정하는 것
                // OutputStream 이라는 곳이 나(클라이언트)의 출력을 저장하는 곳인듯?
                // 상대의 OutputStream 에 보내고 싶은 요청을 적고
                // InputStream 에 저장하고 BufferedReader 로
                // InputStream 을 읽는 듯?
                OutputStream out = sock.getOutputStream();

                String str = "Hello Network Programming";
                // 상대의 OutputStream 에 나의 메시지를 적는다.
                // 정보를 교환할 때는 Byte 형식으로 데이터를 쪼개서 보내는 듯?
                out.write(str.getBytes());

                // 상대의 OutputStream 을 저장하는 공간 인듯?
                InputStream in = sock.getInputStream();
                // InputStream 을 읽기 위해 거쳐야하는 리더
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                // 상대가 보낸 출력을 반환하는 메서드
                // 여러개의 출력은 어떻게 처리하나요?
                String time = reader.readLine();
                System.out.println(time);

                // 서버측에서 에러가 나면 catch 를 실행한다.
                // getMessage() 는 에러 케이스를 알아서 처리해서 에러 메시지를 보여줌
            } catch (UnknownHostException e) {
                System.out.println("Server Not Found: " + e.getMessage());

                // IO: Input Output
                //     입/출력에 관한 에러가 발생하면 아래 catch 를 실행한다.
            } catch (IOException e) {
                System.out.println("I/O Error: " + e.getMessage());
            }
        }
    }
}