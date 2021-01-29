package Sixteenth;

import java.io.IOException;

// 서버를 구동하는 클래스
// 접속후 프로그램이 어떻게 동작하는지를 처리한다.
// 그렇기 때문에 소켓관리 클래스를 따로 만들어주는 것이 좋다.
public class MainServer {
    private static final int MAX = 3;

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocketManager ssm = new ServerSocketManager(7777, MAX);

        ssm.waitForClientRequest();

        // 확인용
        System.out.println("모두 접속 완료!");

        // 확인용
        ssm.checkEachIpAddressInfo();

        // 클라이언트로 부터 가위바위보 데이터를 받음
        ssm.recv(ssm.getClntSockArr(), ssm.getMaxClnt());

        if (ssm.canWeGetWinner(ssm.getMaxClnt())) {
            System.out.println("승부가 결정 났습니다.");
        } else {
            System.out.println("무승부입니다.");
        }

        // 게임의 결과를 클라이언트에게 보내줌
        ssm.send(ssm.getClntSockArr(), ssm.getMaxClnt());

        System.out.println("모든 유저에게 결과 전달 완료!");
    }
}
