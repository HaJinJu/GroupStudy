package Sixteenth;

import java.io.IOException;

// 혼자서 서버 클라이언트를 테스트하는 방법
// 프로젝트 최상위를 보면 전체 경로가 보이는데
// 터미널을 열어서 이 경로로 이동한다.
// 이동 후에 cd out/production/GitAssociated를 입력한다.
// java Sixteenth.MainClient를 입력하면
// 우리가 IntelliJ에서 실행하듯이 명령어로 Client를 동작시킬 수 있다.
// 터미널을 3개 띄우면 클라이언트를 3개 실행할 수 있으므로
// New Tab을 하던 New Window를 하던 해서 3개 채우고 작업하면 된다.

// 서버의 역할 : 클라이언트들에게 데이터를 중계
public class MainServer {
    private static final int MAX = 3;
    // 메소드가 기능 자체에 집중할 수 있도록 throws 사용
    public static void main(String[] args) throws IOException, InterruptedException {

        ServerSocketManager ssm = new ServerSocketManager(7777, MAX);

            // 3명 요청 승인
            ssm.waitForClientRequest();

            System.out.println("모두 접속 완료!");

            // 3명의 IP 주소 확인
            ssm.checkEachIpAddressInfo();

            // 클라이언트 3명이 전송한 내용 가위바위보 배열에 대입
            // receive가 될 때까지 블로킹 연산임(send()와 다름)
            // receive 다 받을 때까지 무한정 기다림  -> 이에 따라 데드락 발생
            // send()는 내 할일 하면 다음 할 일 하러 감(밑의 코드 동작하러 감)
            // send()와 recv()는 병렬로 진행
            ssm.recv(ssm.getClntSockArr(), ssm.getMaxClnt());

            // 이제 서버가 할 일은
            // 클라이언트들에게 승패 결과와
            // 각자가 무엇을 제출했는지 표시해주는 것
            // 승부가 났는지, 무승부인지 판단 -> canWeGetWinner
            // true 값이 나왔다면 if문의 "승패가 결정되었습니다." 출력(클라이언트에게 보낼 것)
            if (ssm.canWeGetWinner(ssm.getMaxClnt())) {
                System.out.println("승패가 결정되었습니다.");
            } else { // false(무승부) 반환되었다면 "무승부 : 게임을 다시 시작합니다." 출력
                     // 클라이언트에게 보낼 것임
                System.out.println("무승부 : 게임을 다시 시작합니다.");
            }

            // 위의 결과값을 클라이언트에게 송신하는 메소드
            ssm.send(ssm.getClntSockArr(), ssm.getMaxClnt());

            System.out.println("모든 사용자에게 입력 결과 전달 완료!");
        }
    }