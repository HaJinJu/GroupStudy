import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketManager {

    private final int ZERO = 0;
    private final int ONE = 1;
    private final int MAGICNUM = 3;

    private OutputStream[] out;
    private InputStream[] in;

    private PrintWriter writer;
    private BufferedReader reader;

    private Scanner scan;

    // 가위바위보 배열 클라이언트들 마다 내는 것이 다르기 때문에 배열에 저장
    String[] arrRSP;

    // 서버용 생성자
    public SocketManager() {
        scan = new Scanner(System.in);
        out = new OutputStream[ONE];
    }

    // 클라이언트용 생성자
    public SocketManager(int num) {
        out = new OutputStream[num];
        in = new InputStream[num];
        arrRSP = new String[num];
    }

    // 서버용 보내기
    public void send(Socket sock) throws IOException {
        System.out.println("가위바위보 숫자를 입력하세요");
        // 입력된 데이터는 문자열로 저장
        String str = scan.nextLine();

        out[ZERO] = sock.getOutputStream();
        out[ZERO].write(str.getBytes());
    }

    // 크라이언트용 보내기
    // 여기서 num은 클라이언트 수
    public void send(Socket[] sock, int num) throws IOException {
        for (int i = ZERO; i < num; i++) {
            // 보낼때 이건 고정된 내용
            out[i] = sock[i].getOutputStream();
            writer = new PrintWriter(out[i], true);

            String str = convertRSP();
            // 보내는 메시지(여기서는 가위바위보 결과)
            writer.println(str);
        }
    }

    public String convertRSP() {
        // result 변수 선언
        // 문자열과 문자열을 비교하여 얻는 결과이기 때문에 String으로 선언
        String res = "";
        // 배열의 길이
        int len = arrRSP.length;

        for (int i = ZERO; i < len; i++) {
            // 0부터 시작하기 때문에 +1 해줌
            // 결과 += for문 돌기 때문에
            res += (i + 1) + "번 사용자 : ";

            // 배열의 가ㅄ이 1이라면
            // recv 메소드에서 가위바위보 배열은 문자열로 출력이 되었음
            // 문자열을 비교하기 위해 equals() 사용 - 배열의 문자열
            // equals() 객체를 비교해줌
            if (arrRSP[i].equals("1")) {
                // res = res + 가위...?
                res += "가위";
                // 배열의 가ㅄ이 2라면
            } else if (arrRSP[i].equals("2")) {
                res += "바위";
            } else {
                res += "보";
            }

            // ?? 이해가 되지 않음
            // 배열의 길이 -1
            if (i == len - ONE) {
                res += "";
            } else {
                res += ", ";
            }
        }
        // 문자열로 변환한 결과 리턴
        return res;
    }

    // 받기
    public void recv(Socket[] sock, int num) throws IOException {
        int tmp;

        for (int i = ZERO; i < num; i++) {
            // 받을때 이건 고정된 내용
            in[i] = sock[i].getInputStream();
            reader = new BufferedReader(new InputStreamReader(in[i]));
            // 받는 메시지

            tmp = Integer.parseInt(reader.readLine());

            // 3을 4로 바꿔주는 내용
            // 이걸 따로 메소드로 뺄 수 없을까?
            // 3일 경우
            // 숫자와 숫자의 비교가 가능해짐
            if (tmp == MAGICNUM) {
                // 4로 출력 근데 이제 비교 끝났으니깐 숫자를 문자로 출력
                arrRSP[i] = Integer.toString(tmp + ONE);
            } else {
                arrRSP[i] = Integer.toString(tmp);
            }
            // 가위바위보 배열은 최종적으로 문자열
            System.out.println("msg: " + arrRSP[i]);
        }
    }

    // 승패 판정
    public boolean checkWinner(int num) {
        // 초기화 해줌
        int bitOROfAllInputString = 0;

        for (int i = ZERO; i < num; i++) {
            // Integer.parseInt 숫자형 문자열을 숫자형으로 변경해줘서 비교
            // convert에서 문자열로 변경해줬는데 왜? parseInt?
            // Check 하고 send하기 때문
            // convert 메소드를 거치지 않았다고 생각하면 Integer.parseInt 해주는게 맞음
            // 비트연산자-직접 계산해보면 됨
            bitOROfAllInputString |= Integer.parseInt(arrRSP[i]);
        }

        // 무승부인 경우들
        if (bitOROfAllInputString == 7) {
            return false;
        } else if (bitOROfAllInputString == 1) {
            return false;
        } else if (bitOROfAllInputString == 2) {
            return false;
        } else if (bitOROfAllInputString == 4) {
            return false;
        }
        // 승패가 나는 경우
        return true;
    }
}

// 서버는 소켓매니저에 상속
public class ServerSockManager extends SocketManager {
    // 서버 소켓 부여
    private ServerSocket servSock;
    // 클라이언트 소켓 부여-클라이언트가 여러명이기 때문에 배열로 받음
    private Socket[] clientSockArr;

    private int clientCnt;
    private int maxClient;

    // 예외는 모두 IOException로 넘겨버림
    public ServerSockManager(int port, int max) throws IOException {
        // 부모클래스에 있던 인자를 받아온다
        super(max);
        // 게임에 참가 할 인원 표시
        System.out.printf("%d명이 입장해야 게임 시작/n", max);
        // 포트번호 부여
        servSock = new ServerSocket(port);
        // 클라이언트의 수 0 부터 시작하기 때문에 초기화
        clientCnt = 0;
        // 변수명 직관적으로 변경
        maxClient = max;
        // 클라이언트 소켓 배열의 크기
        clientSockArr = new Socket[max];
    }

    public void waitForClientRequest() throws IOException {
        System.out.println("사용자 접속 대기");

        // 사용자 수 만큼 반복문을 돌린다
        for (int i = 0; i < maxClient; i++) {
            // 클라이언트 소켓들을 대기 수락
            clientSockArr[clientCnt++] = servSock.accept();
            // clientSockArr[i] = servSock.accept();도 가능하지 않을까?
        }
    }

    public void checkEachIpAdressInfo() {
        for (int i = 0; i < maxClient; i++) {
            // 클라이언트들이 접속했다면 ip 주소 가져오기
            // 여러명이기 때문에 다 가져오기 위해 반복문
            System.out.println("[" + clientSockArr[i].getInetAddress() + "] 클라이언트 접속");
        }
    }

    // 해당 매소드 사용하기 위해 getter를 만들어줌
    public Socket[] getClientSockArr() {
        return this.clientSockArr;
    }

    public int getMaxClient() {
        return this.maxClient;
    }

}

// 클라이언트는 소켓매니저에 상속
public class ClientSocketManger extends SocketManager {
    // 클라이언트 소켓 부여
    private Socket clientSocket;

    // 해당 매소드 사용하기 위해 getter를 만들어줌
    public Socket getClientSocket() {
        return this.clientSocket;
    }

    // 생성자
    public ClientSocketManger(String hostIp, int port) throws IOException {
        super();
        // ip랑 포트번호
        clientSocket = new Socket(hostIp, port);
    }
}

public class MainServe {
    private static final int MAX = 3;

    public static void main(String[] args) throws IOException {

        // 포트번호, 클라이언트 인원
        ServerSockManager sm = new ServerSockManager(7777, MAX);
        //
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