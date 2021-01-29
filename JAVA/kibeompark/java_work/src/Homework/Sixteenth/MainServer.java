package Homework.Sixteenth;

import java.io.IOException;

// 혼자서 서버 클라이언트를 테스트 하는 방법
// 프로젝트 최상위를 보면 전체 경로가 보이는데
// 터미널을 열어서 이 경로로 이동한다.
// 이동 후에 cd out/production/GitAssociated 를 입력한다.
// java Sixteenth.MainClient 를 입력하면
// 우리가 IntelliJ 에서 실행하듯이 명령어로 Client를 동작시킬 수 있다.
// 터미널을 3개 띄우면 클라이언트를 3개 실행할 수 있으므로
// New Tab을 하든 New Window를 하든 해서 3개 띄우고 작업하면 된다.

// \\\[[[<<< 프로그램 진행 순서 >>>]]]///
// 서버 생성 -> 클라이언트 접속 -> 접속한 클라이언트 정보 출력
// -> 게임 시작 -> 클라이언트 입력 값 서버로 전송
// -> 서버 화면에 클라이언트 입력 값 출력 -> 무승부 여부 판단
// -> 각 클라이언트 화면에 전체 클라이언트 입력 값 출력
// -> 가위바위보 결과 출력 ?

// 서버의 역할 : 클라이언트들에게 데이터를 중개
public class MainServer {
    // 서버에 접속 가능한 클라이언트 수 = 3
    private static final int MAX = 3;

    public static void main(String[] args)
            throws IOException, InterruptedException {
        // 서버 소켓을 관리하는 클래스 선언
        // 포트 번호 : 7777, 클라이언트 수 : 3
        ServerSocketManager ssm =
                new ServerSocketManager(7777, MAX);

        // 클라이언트의 접속 요청을 대기 및 승인하는 메서드 호출
        ssm.waitForClientRequest();

        // 모두 접속하였을 시 알림 메시지 출력
        System.out.println("모두 접속 완료 !");

        // 연결된 클라이언트들의 정보를 출력하는 메서드 호출
        ssm.checkEachIpAddressInfo();

        // 클라이언트들이 입력한 값을 서버 측 화면에 출력하는 메서드 호출
        ssm.recv(ssm.getClntSockArr(), ssm.getMaxClnt());

        // 이제 서버가 할 일은
        // 클라이언트들에게 승패 결과와
        // 각자가 무엇을 제출했는지 표시해 주는 것

        // 무승부를 판단하는 메서드가
        // true일 경우 "승패 결정"
        // false일 경우 "무승부, 게임 재시작"
        if (ssm.canWeGetWinner(ssm.getMaxClnt())) {
            System.out.println("승패가 결정되었습니다.");
        } else {
            System.out.println("무승부 : 게임을 다시 시작합니다.");
        }

        // 모든 클라이언트가 송신해 온 게임의 입력 결과를 취합하여
        // 각 클라이언트에게 보내주는 메서드
        ssm.send(ssm.getClntSockArr(), ssm.getMaxClnt());

        // 송신 확인 메시지 출력
        System.out.println("모든 사용자에게 입력 결과 전달 완료 !");
    }
}
