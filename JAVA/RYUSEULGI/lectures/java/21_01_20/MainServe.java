import java.io.IOException;

// 클라이언트들 중개 역할

public class MainServe {
    private static final int MAX = 3;

    public static void main(String[] args) throws IOException {

        ServerSockManager sm = new ServerSockManager(7777, MAX);
        sm.waitForClientRequest();
        System.out.println("클라이언트 접속완료");
        sm.checkEachIpAdressInfo();

        sm.recv(sm.getClientSockArr(), sm.getMaxClient());

        // 이제 서버가 할 일은
        // 클라이언트들에게 승패 결과와
        // 각자가 무엇을 제출했는지 표시해주는 것
        if (sm.checkWinner(sm.getMaxClient())) {
            System.out.println("승패 결정");
        } else {
            System.out.println("무승부");
        }

        sm.send(sm.getClientSockArr(), sm.getMaxClient());
        System.out.println("결과 전달");
    }
}