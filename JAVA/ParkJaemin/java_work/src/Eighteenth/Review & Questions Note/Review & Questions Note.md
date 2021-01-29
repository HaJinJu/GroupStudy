# 2021-01-22 Seventeen Review & Quesions Note

*ClientSocketManager 클래스 코드 해석 

```java
package Seventeenth;

import java.io.IOException;
import java.net.Socket;

public class ClientSocketManager extends SocketManager {// 클라이언트 소켓 매니저가 소켓매니저를 상속 받음
    private Socket clntSock;

    public ClientSocketManager(String hostIp, int portNum) // 문자열로 ip,  포트번호
            throws IOException {

        super(); // 기본 생성자 호출(상속)
        clntSock = new Socket(hostIp, portNum); // ip , 포트번호 clntsock 변수에 대입
    }

    public Socket getClntSock() {
        return clntSock;
    } // ip, 포트번호 값 겟터를 통해 받음.
}
```


*MainClient 클래스 코드해석

```java
package Seventeenth;

import java.io.IOException;
import java.util.Scanner;

// 게임에 접속해서 플레이하는 고객
public class MainClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 집에서 하는 경우 자신의 집 컴퓨터 아이피 주소
        // 학원인 경우는 자신의 자리 ip 주소 혹은 동일하게 해도 무방
        String ip = "192.168.0.194";
        int port = 7777;

        Scanner scan = new Scanner(System.in);

        ClientSocketManager csm = new ClientSocketManager(ip, port);

        System.out.println("접속 요청 완료!");
        System.out.println("가위는 1, 바위는 2, 보는 3");

        csm.send(csm.getClntSock()); // 클라이언트의 ip, 포트를 서버로 송신

        System.out.println("전송 완료!");

        csm.close(csm.getClntSock());
        // 클라이언트 서버 닫는다.
        // 데드락 방지
        // 데드락의 발생 조건 중 하나인 비선점을 성립하지 않게 코드 .close코드를(비선점 부정) 작성


        scan.nextLine(); //입력 값을 통해 다시한번 접속 //엔터 누르기

        csm = new ClientSocketManager(ip, port); // ip, port 값을 csm에 대입

        csm.recv(csm.getClntSock()); //데이터를 다시 받는다.

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

```

*SocketManager 코드 해석 및 질문

Q1.public void recv(Socket[] sock, int num) 및 public void recv(Sock sock)의 전반적인 코드이해를 못해
  다시한번 해석을 부탁드립니다

Q2.sock.close()은 데드락 방지 차원에서 작성 한 것인가요?

```java
package Seventeenth;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SocketManager {
    private final int ZERO = 0;
    private final int ONE = 1;
    // OR 연산의 특성을 활용하기 위해 3인 경우를 4로 만들기 위함
    private final int MAGICNUM = 3;

    private OutputStream[] out;
    private InputStream[] in;

    private PrintWriter writer; // 스트림으로부터 받은 데이터 출력
    private BufferedReader reader; // 문자열 데이터 입력 받기

    private Scanner scan; // 입력 값 scan

    static int sendCnt = 0; // 초기값
    static int recvCnt = 0; // 초기값

    String[] arrRockScissorPaper; // 가위바위보 문자열 배열

    // send용 [현재 개발 관점은 클라이언트 입장]
    public SocketManager() {
        scan = new Scanner(System.in); //스캐너를 통한 입력값 받기

        in = new InputStream[ONE]; //배열 데이터 입력값
        out = new OutputStream[ONE];
        // 클라이언트가 접속하기 위한 공간을 배열로 입력 값을 송신하기 위한 값
    }

    // recv용 [현재 개발 관점은 서버 입자]
    public SocketManager(int num) {
        //scan = new Scanner(System.in);

        out = new OutputStream[num];// 수신할 값을 출력
        in = new InputStream[num]; // 클라이언트가 송신할 값을 수신

        arrRockScissorPaper = new String[num]; // 가위바위보를 문자열 배열로 대입
    }

    public void send(Socket sock) throws IOException {
        // 클라이언트가 서버에 보내는 메서드
        System.out.print("숫자를 입력하세요: ");
        String str = scan.nextLine(); // 클라이언트가 가위/바위/보 숫자로 입력한 값

        out[ZERO] = sock.getOutputStream();
        // 출력 값을 초기화된 공간 배열에 대입 // 초기화된 배열이지만 갯수는 1개짜리
        out[ZERO].write(str.getBytes());
        //  write는 출력스트림으로부터 바이트 값(가위바위보)을 보내야하는 공간
    }

    public String convertNumber2RSP() {
        String res = "";
        int len = arrRockScissorPaper.length; // 가위바위보 배열의 값 길이

        for(int i = ZERO; i < len; i++) {
            res += (i + 1) + "번 사용자: ";// i값은 0번부터 시작이니 1을 더해주고 res에 누계하여 대입

            if (arrRockScissorPaper[i].equals("1")) {
                res += "가위";
            } else if (arrRockScissorPaper[i].equals("2")) {
                res += "바위";
            } else {
                res += "보";
            }

            if(i == len - ONE) { // i == 전체길이 - one(마지막 사용자를 뜻 함.)
                // 마지막 사용자에게 ,(구분자)를 넣지 않기위해 문장 작성
                res += "";
            } else {
                res += ", ";
            }
        }

        return res;
    }

    public void send(Socket[] sock, int num) throws IOException {
        out[sendCnt] = sock[sendCnt].getOutputStream();//클라이언트가 입력한 값을 배열로 출력하여 보내

        writer = new PrintWriter(out[sendCnt++], true); // 받은 값을 출력
        //autoFlush = "true" - 버퍼(임시메모리)가 다 찼을 경우 남아 있는 데이터 모두 출력후 계속 작업 진행
        //autoFlush = "false" - 버퍼(임시메모리)가 다 찼을 경우 예외를 발생시키고 작업 중단
        //Flush(플러시) - 버퍼가 다 찼을 경우 쌓인 데이터를 실제로 전송 또는 저장되어야 할 곳에 전송하고 버퍼를 비우는 것

        String str = convertNumber2RSP();// 문자열로 가위바위보를 입력한 값을 str 변수에 대입

        writer.println(str);// 문자열로 출력
    }

    public void recv(Socket[] sock, int num) throws IOException {

        int tmp;

        System.out.println("recvCnt = " + recvCnt);

        in[recvCnt] = sock[recvCnt].getInputStream(); // 송신 된 값을 받고 입력함

        reader = new BufferedReader(new InputStreamReader(in[recvCnt]));
        // 입력 받은 값을 선언하며 reader에 대입

        // 미리 변환하지 않고 문자열인 상태에서 "3"과 같은지 비교하고
        // 같으면 바꾸고 같지 않으면 그대로 두는 형식이 더 효율적이다.
        // 숙제로 한 번 만들어보세요 ~
        tmp = Integer.parseInt(reader.readLine()); //int 값을 얻기 위해 형변환 값을 tmp에 대입

        if(tmp == MAGICNUM) {
            arrRockScissorPaper[recvCnt] = Integer.toString(tmp + ONE);
        } else {
            arrRockScissorPaper[recvCnt] = Integer.toString(tmp);
        }

        System.out.println("msg: " + arrRockScissorPaper[recvCnt++]);
    }

    public void recv(Socket sock) throws IOException {
        in[ZERO] = sock.getInputStream();

        reader = new BufferedReader(new InputStreamReader(in[ZERO])); // 입력 값 받기

        System.out.println(reader.readLine()); // 입력 스트림으로 받은 값 출력
    }

    public void close(Socket sock) throws IOException {
        sock.close();
        //입력 값에서 예외가 발생했을 경우 호출하여 남은 데이터를 출력시키도록 함.
        //데드락 방지?
    }

    public boolean canWeGetWinner(int num) {
        // 3명 이상이 함께 가위바위보를 할 때 승패를 어떻게 판정할 것인가 ?
        // 가위 = 1, 바위 = 2, 보 = 4라면
        // 모든 값을 OR 했을때 7이 나올 것이다.
        // 만약 1, 2, 3이라면 OR 결과는 3이므로
        // 이것이 보인지 무승부인지 판정이 불가!
        int bitOROfAllInputString = ZERO;

        for(int i = ZERO; i < num; i++) {
            bitOROfAllInputString |=
                    Integer.parseInt(arrRockScissorPaper[i]);
            // 참여자 수 만큼 문자열 가위바위보 값을 형변환 하여 OR연산으로 누계
        }

        if(bitOROfAllInputString == 7) {
            return false;
        } else if(bitOROfAllInputString == 1) {
            return false;
        } else if(bitOROfAllInputString == 2) {
            return false;
        } else if(bitOROfAllInputString == 4) { // 무승부
            return false;
        }

        return true; //승리
    }
}

```