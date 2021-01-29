package Fifteenth;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClientTest {
    public static void main(String[] args) {
        //내가 접속할 서버의 IP주소를 적습니다
        String hostname = "127.0.0.1";


        //서버에 여러 서비스가 있을수 있는데
        //그 중에서 내가 사용하고자 하는 서비스의 포트 번호를 적습니다
        int port = 33333;
        for(int i = 0 ; i < 10; i++){
            try {

               // Socket 객체를 할당해서
                //서버의 IP, 포트번호를 가지고 접속을 요청합니다
                //서버에 대한 소켓을 획득하게 됩니다.
                //이요청이 들어갈때 서버의 accept가 동작하게 된다
                // 전호를 거는 것과 같다
                //(서버쪽 주석을 살펴보면 감이 더 잘옴)
                Socket sock = new Socket(hostname,port);

                //서버의 출력을 획득
                //즉 서버가 수신하게 만들도록 설정을 해주는것
                //
                OutputStream out = sock.getOutputStream();

                String str = "Hello Network Programming";
                // 위의 문자열을 바이트 잔위로 쪼개서 서버로 전송
                out.write(str.getBytes());

                // 서버의 입력을 생성
                InputStream in = sock.getInputStream();
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));

                // 서버가 보낸 내용을 time에게 저장하고 출력한다
                String time = reader.readLine();
                System.out.println(time);

            //UnkonwnHostException: 내가 접속하려는 IP를 찾지 못할때
            }catch (UnknownHostException e){
                System.out.println("Server Not Found" + e.getMessage());
            }catch (IOException e){
                System.out.println("I/O Error"+ e.getMessage());
            }
        }
    }
}
