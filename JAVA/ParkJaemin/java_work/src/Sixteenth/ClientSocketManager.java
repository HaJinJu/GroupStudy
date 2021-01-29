package Sixteenth;
import java.io.IOException;
import java.net.Socket;
public class ClientSocketManager extends SocketManager {
    // 소켓 메니저를 상속하여 클래스 작성
    // 클라이언트가 가지고 있는 정보를 통신 수행을 위해 클래스 생성
    private Socket clntSock;

    public ClientSocketManager(String hostIp, int portNum) // IP주소랑 포트번호 호출 매서드
            throws IOException {
        //throws IOException 발생 // 떠넘겨야할 예외종류가 여러개라면 쉼표 사용하여 추가
        //try~catch문을 사용하지 않으면 throw Exception를 선언 해줘야한다.
        //말 그대로 "예외를 던지다."라는 뜻이다.
        //코드에서 에러가 발생 했을 경우 예외처리를 try~catch로 예외처리를 하는 것이 아니라
        //이 메소드를 사용하는 곳으로 예외를 던진다는 것

        // Q. ClientSocketManager 메서드에서 오류 발생이 되면 예외처리를 할 수 있는지 파악을 하고 못한다면
        // 메인 메서드에게로 전달하여 예외처리를 할 수 있도록 요청하는 것이 맞는가?

        super(); // SocketManager에서 상속받은 조상 호출
        clntSock = new Socket(hostIp, portNum);
    }

    public Socket getClntSock() { // 클라이언트의 Ip와 포트 번호 값 가져오기 위한 겟터 생성
        return clntSock;
    } // ip, 포트번호 겟터 값을 호출할 수 있도록 생성
}