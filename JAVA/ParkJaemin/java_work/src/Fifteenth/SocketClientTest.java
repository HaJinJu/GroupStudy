package Fifteenth;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClientTest {
    public static void main(String[] args) {
        // 내가 접속할 서버의 IP주소를 적습니다.
        String hostname = "192.168.35.63";
        // 서버에 여러 서비스가 있을 수 있는데
        // 그 중에서 내가 사용하고자 하는 서비스의 포트 번호를 적습니다.
        int port = 33333;

        for (int i = 0; i < 10; i++) { // 아래 try-catch문을 접속이 될 때까지 10번 시도
            try {
                // Socket 객체를 할당해서
                // 서버의 IP, 포트 번호를 가지고 접속을 요청
                // 서버에 대한 소켓을 획득하게 됩니다(sock이 획득)
                // 이 객체에서 요청이 들어 갈때 서버의 accept()가 동작 하게 됨
                // 예를 들자면 이 행위는 전화를 거는 것과 같다.(클라이언트가 서버에 전화를 거는 것)
                // (서버쪽 주석을 살펴보면 감이 더 잘 올 것이다.)
                Socket sock = new Socket(hostname, port);

                // 서버의 출력을 획득
                // 즉, 서버가 수신하게 만들도록 설정을 해주는 것
                OutputStream out = sock.getOutputStream();

                String str = "Hello Network Programming";
                // 위의 문자열을 바이트 단위로 쪼개서 서버(SocketServerTest)로 전송(출력할 수 있게) - 연결이 된다
                out.write(str.getBytes());

                // 서버의 입력을 생성(수신 준비)
                // Q. 이 부분도 서버처럼 소켓을 통해 읽을 땐 무조건 아래 형식 처럼 고정해서 사용 해야하는 건가?
                InputStream in = sock.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                // 서버가 보낸 내용을 time에 저장하고 출력한다.
                String time = reader.readLine();
                System.out.println(time);


                // UnknownHostException : 내가 접속하려는 IP를 찾지 못할 때
            } catch (UnknownHostException e) {
                System.out.println("Server Not Found:" + e.getMessage());
                // 서버를 찾을 수 없다
            } catch (IOException e) {
                System.out.println("I/O Error : " + e.getMessage());
                // 연결을 하지 않았을 때 입출력 에러 : 연결이 거부됨으로 출력 됨
            }
        }
    }
}
// 클라이언트가 서버로 입력 내용을 전달하고 서버가 그걸 아웃스트림을 통해 출력하는건가? 그 사이에 무언가가 있는걸까?  - 따로 질문
//