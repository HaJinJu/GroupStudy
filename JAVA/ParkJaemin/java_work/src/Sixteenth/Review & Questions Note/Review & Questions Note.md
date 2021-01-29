# 2021-01-20 Review & Quesions Note

*ClientSocketManager 클래스 코드 해석 및 질문

Q1. ClientSocketManager 메서드에서 
오류 발생이 되면 예외처리를 할 수 있는지 파악을 하고 못한다면 메인 메서드에게로 전달하여 예외처리를 할 수 있도록 요청하는 것이 맞는가요?

```java
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


        super(); // SocketManager에서 상속받은 조상 호출
        clntSock = new Socket(hostIp, portNum);
    }

    public Socket getClntSock() { // 클라이언트의 Ip와 포트 번호 값 가져오기 위한 겟터 생성
        return clntSock;
    } // ip, 포트번호 겟터 값을 호출할 수 있도록 생성
}
```



*MainClient 클래스 코드해석



```java
package Sixteenth;

import java.io.IOException;

// 게임에 접속해서 플레이하는 고객
public class MainClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 클라이언트 소켓 클래스에 있는 예외처리를 못할 경우 최초 호출 지점인 메인 메서드로 예외가 온 상태
        // Interruped Exception은 쓰레드 (sleep(), wait(), join() - 일시정지 상태 기능 보유)에
        // 호출하면 throw Interrupet Exception이 발생

        // 집에서 하는 경우 자신의 집 컴퓨터 아이피 주소
        // 학원인 경우는 자신의 자리 ip 주소 혹은 동일하게 해도 무방
        String ip = "192.168.0.9"; // ip
        int port = 7777; // 포트번호

        ClientSocketManager csm = new ClientSocketManager(ip, port);
        // 클라이언트소켓 매니저 객체의 참조변수 csm ip, 포트값

        System.out.println("접속 요청 완료!");
        System.out.println("가위는 1, 바위는 2, 보는 3");

        csm.send(csm.getClntSock()); // ip, 포트값을 보낸다

        System.out.println("전송 완료!");

        /*
        Thread.sleep(1000);
        csm.recv(csm.getClntSock());
         */
    }
}
```



*ServerSocketManager 코드해석



```java
package Sixteenth;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class ServerSocketManager extends SocketManager { // 소켓매니저 자손 역할
    private ServerSocket servSock;
    private Socket[] clntSockArr;

    private int clntCnt;
    private int maxClnt;

    public ServerSocketManager(int portNum, int max) // 서버 소켓 매니저 메서드 생성 (포트번호, 참여인원)
            throws IOException { // 예외발생시 예외처리

        super(max); // 조상님 호출

        // 참여인원 3명이 접속해야 게임 시작
        System.out.printf("%d 명이 접속해야 게임을 시작할 수 있습니다.\n", max);

        servSock = new ServerSocket(portNum); // 서버 소켓 =포트번호

        clntCnt = 0; // 초기값
        maxClnt = max; // 최대 참여 인원

        clntSockArr = new Socket[max]; // 참여인원을 배열화
    }

    public void waitForClientRequest() throws IOException {
        System.out.println("사용자 접속을 대기합니다.");

        for(int i = 0; i < maxClnt; i++) { // 최대 참여인원 만큼 for문 실행
            clntSockArr[clntCnt++] = servSock.accept();
            //for문만큼 참여인원 배열 - 3명 // 포트넘버를 통해 연결을 받아들인다
        }
    }

    public void checkEachIpAddressInfo() {
        for(int i = 0; i < maxClnt; i++) {
            System.out.println(
                    "[" + clntSockArr[i].getInetAddress() +
                            "] client connected" // 참여인원의 ip주소를 얻고 연결이 됐습니다를 출력
            );
        }
    }

    public Socket[] getClntSockArr() {
        return clntSockArr;
    } // 참여인원 배열 값 겟터

    public int getMaxClnt() {
        return maxClnt;
    } // 최대 참여 인원 값 겟터
}
```



*MainServer 코드해석



```java
package Sixteenth;

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
    private static final int MAX = 3; // 참여인원 3명으로 상수 고정

    public static void main(String[] args)
            throws IOException, InterruptedException { // 예외처리
        ServerSocketManager ssm =
                new ServerSocketManager(7777, MAX); // 서버소켓 객체 생성

        ssm.waitForClientRequest(); // 참여인원의 접속 연결을 실행

        System.out.println("모두 접속 완료!");

        ssm.checkEachIpAddressInfo(); // 클라이언트가 접속한 ip정보 확인

        ssm.recv(ssm.getClntSockArr(), ssm.getMaxClnt());
        // 참여인원이 입력한 값을 실행

        // 이제 서버가 할 일은
        // 클라이언트들에게 승패 결과와
        // 각자가 무엇을 제출했는지 표시해주는 것
        if(ssm.canWeGetWinner(ssm.getMaxClnt())) {
            System.out.println("승패가 결정되었습니다.");
        } else {
            System.out.println("무승부: 게임을 다시 시작합니다.");
        }

        ssm.send(ssm.getClntSockArr(), ssm.getMaxClnt());

        System.out.println("모든 사용자에게 입력 결과 전달 완료!");
    }
}
```



*SocketManager 코드 해석 및 질문

Q2.[ZERO]는 초기화 된 배열을 의미 하는 건가요? (250 Line)


```java
package Sixteenth;

import java.io.*;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class SocketManager {
    private final int ZERO = 0; // 상수 zero =0
    private final int ONE = 1; // 상수 one = 1
    // OR 연산의 특성을 활용하기 위해 3인 경우를 4로 만들기 위함
    private final int MAGICNUM = 3; // 매직넘버 3

    private OutputStream[] out; // 배열 데이터 출력값 out
    private InputStream[] in; // 배열 데이터 입력값 in

    private PrintWriter writer; // 스트림으로부터 받은 데이터출력
    private BufferedReader reader;// 문자열 데이터 입력받기

    private Scanner scan; // 입력 값 scan

    String[] arrRockScissorPaper; // 가위바위보 문자열로 배열

    // send용 [현재 개발 관점은 클라이언트 입장]
    public SocketManager() {
        scan = new Scanner(System.in); // 스캐너를 통하여 입력값 받기

        //in = new InputStream[ONE];
        out = new OutputStream[ONE];
        // 클라이언트가 접속하기 위한 공간을 배열로 입력값을 송신하기 위한 값
    }

    // recv용 [현재 개발 관점은 서버 입자]
    public SocketManager(int num) {
        //scan = new Scanner(System.in);

        out = new OutputStream[num]; // 수신한 값을 출력
        in = new InputStream[num]; // 클라이언트가 송신한 값을 수신

        arrRockScissorPaper = new String[num]; // 가위바위보를 문자열 배열로 대입
    }

    public void send(Socket sock) throws IOException {
        System.out.print("숫자를 입력하세요: ");
        String str = scan.nextLine(); // 클라이언트가 가위/바위/보를 숫자로 입력한 값

        //출력 값을 초기화 된 공간 배열에 대입
        out[ZERO] = sock.getOutputStream();
        out[ZERO].write(str.getBytes());
        // write는 출력스트림으로부터 바이트 값을 보내야하는 공간
    }

    public String convertNumber2RSP() {
        String res = "";
        int len = arrRockScissorPaper.length; //가위바위보 배열의 값 길이

        for (int i = ZERO; i < len; i++) {
            res += (i + 1) + "번 사용자: "; // i값은 0번부터 시작이니 1을 더해주고 res에 누계하여 대입

            // 문자열은  == 대신 .equals로 써줘야한다.
            if (arrRockScissorPaper[i].equals("1")) {
                res += "가위";
            } else if (arrRockScissorPaper[i].equals("2")) {
                res += "바위";
            } else {
                res += "보";
            }

            if (i == len - ONE) {
                res += "";
            } else {
                res += ", ";
            }
        }

        return res;
    }

    public void send(Socket[] sock, int num) throws IOException {
        for (int i = ZERO; i < num; i++) {
            out[i] = sock[i].getOutputStream(); //참여자가 입력한 값을 배열로 출력하여 보내기

            writer = new PrintWriter(out[i], true);
            //autoFlush = "true" - 버퍼(임시메모리)가 다 찼을 경우 남아 있는 데이터 모두 출력후 계속 작업 진행
            //autoFlush = "false" - 버퍼(임시메모리)가 다 찼을 경우 예외를 발생시키고 작업 중단
            //Flush(플러시) - 버퍼가 다 찼을 경우 쌓인 데이터를 실제로 전송 또는 저장되어야 할 곳에 전송하고 버퍼를 비우는 것

            String str = convertNumber2RSP();// 문자열로 가위바위보를 입력한 값을 str 변수에 대입

            writer.println(str); //문자열로 출력
        }
    }

    public void recv(Socket[] sock, int num) throws IOException {
        int tmp;

        for (int i = ZERO; i < num; i++) {
            in[i] = sock[i].getInputStream(); // 송신 된 값을 받고 입력함
            reader = new BufferedReader(new InputStreamReader(in[i]));
            //입력 받은 값을 선언 하여 reader에 대하여 출력

            // 미리 변환하지 않고 문자열인 상태에서 "3"과 같은지 비교하고
            // 같으면 바꾸고 같지 않으면 그대로 두는 형식이 더 효율적이다.
            // 숙제로 한 번 만들어보세요 ~
            tmp = Integer.parseInt(reader.readLine()); // int 값을 얻기 위해 형변환 값을 tmp에 대입

            if (tmp == MAGICNUM) {
                arrRockScissorPaper[i] = Integer.toString(tmp + ONE);
            } else {
                arrRockScissorPaper[i] = Integer.toString(tmp);
            }

            System.out.println("msg: " + arrRockScissorPaper[i]);
        }
    }

    public boolean canWeGetWinner(int num) {
        // 3명 이상이 함께 가위바위보를 할 때 승패를 어떻게 판정할 것인가 ?
        // 가위 = 1, 바위 = 2, 보 = 4라면
        // 모든 값을 OR 했을때 7이 나올 것이다.
        // 만약 1, 2, 3이라면 OR 결과는 3이므로
        // 이것이 보인지 무승부인지 판정이 불가!
        int bitOROfAllInputString = ZERO;

        for (int i = ZERO; i < num; i++) {
            bitOROfAllInputString |=
                    Integer.parseInt(arrRockScissorPaper[i]);
            //참여자 수 만큼 문자열 가위바위보 값을 형변환 하여 OR 연산으로 누계
        }

        if (bitOROfAllInputString == 7) {
            return false;
        } else if (bitOROfAllInputString == 1) {
            return false;
        } else if (bitOROfAllInputString == 2) {
            return false;
        } else if (bitOROfAllInputString == 4) {
            return false;
        } // 무승부

        return true; // 승패 결정
    }
}
```