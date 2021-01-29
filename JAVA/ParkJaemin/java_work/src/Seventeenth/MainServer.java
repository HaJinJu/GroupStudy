package Seventeenth;

import java.io.IOException;

// 혼자서 서버 클라이언트를 테스트하는 방법
// 프로젝트 최상위를 보면 전체 경로가 보이는데
// 터미널을 열어서 이 경로로 이동한다.
// 이동후에 cd out/production/GitAssociated 를 입력한다.
// java Sixteenth.MainClient 를 입력하면
// 우리가 IntelliJ에서 실행하듯이 명령어로 Client를 동작시킬 수 있다.
// 터미널을 3개 띄우면 클라이언트를 3개 실행할 수 있으므로
// New Tab을 하던 New Window를 하던해서 3개 우고 작업하면 된다.

// 서버의 역할: 클라이언트들에게 데이터를 중개
public class MainServer {
    private static final int MAX = 3; // 최대 참여인원 3명 고정 상수

    public static void main(String[] args)
            throws IOException, InterruptedException {
        ServerSocketManager ssm =
                new ServerSocketManager(7777, MAX);
        // ssm 변수에 포트번호 및 참여인원 대입

        int cnt = 0; // 초기값

        while (cnt != 3) { // 참여 인원이 3명일 경우
            ssm.waitForClientRequest(); // 3명이 될 때가지 기다리기

            ssm.recv(ssm.getClntSockArr(), ssm.getMaxClnt());
            // 접속된 클라이언트 정보와 최대 인원 받기

            // 이제 서버가 할 일은
            // 클라이언트들에게 승패 결과와
            // 각자가 무엇을 제출했는지 표시해주는 것
            cnt++;
        }

        System.out.println("다음을 진행합니다.");

        if (ssm.canWeGetWinner(ssm.getMaxClnt())) { // 참여한 클라이언트의 정보를 얻은 값
            System.out.println("승패가 결정되었습니다."); // 승리시
        } else {
            System.out.println("무승부: 게임을 다시 시작합니다."); //무승부
        }

        cnt = 0;

        ssm.setClntCnt(0);

        while (cnt != 3) {
            System.out.println("사용자들에게 결과를 전달합니다."); // 3명에게 결과를 전달
            ssm.waitForClientRequest();

            ssm.send(ssm.getClntSockArr(), ssm.getMaxClnt());

            cnt++;
        }

        System.out.println("모든 사용자에게 입력 결과 전달 완료!");
    }
}
