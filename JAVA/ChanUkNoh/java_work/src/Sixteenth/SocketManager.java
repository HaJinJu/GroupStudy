package Sixteenth;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

// socket에서 필요한 도구들을 관리하는 클래스
// 출력 관련 OutputStream과 PrintWriter와
// 입력 관련 InputStream과 BufferedReader를 관리
public class SocketManager {
    final private int ZERO = 0;
    final private int ONE  = 1;
    final private int MAGICNUM = 3;

    String[] arrRockScissorsPaper;

    private OutputStream[] out;
    private InputStream[] in;

    private PrintWriter writer;
    private BufferedReader reader;

    private Scanner scan;

    // 클라이언트용 SocketManager 1개의 서버와
    // 상호작용하기 때문에 배열의 크기는 1개로 설정한다.
    public SocketManager() {
        scan    = new Scanner(System.in);

        in      = new InputStream[ONE];
        out     = new OutputStream[ONE];
    }

    // 서버용 SocketManager 여러 개의 클라이언트와
    // 상호작용하기 때문에 배열의 크기는 접속한 클라이언트의 수로 설정한다.
    public SocketManager(int num) {
        scan = new Scanner(System.in);

        in = new InputStream[num];
        out = new OutputStream[num];
    }

    // 서버용 for문을 통해 배열을 채움
    public void send(Socket[] sock, int num) throws IOException {

        for (int i = ZERO; i < num; i++) {
            out[i] = sock[i].getOutputStream();

            writer = new PrintWriter(out[i], true);

            String str = convertNumber2RSP();

            writer.println(str);
        }
    }

    // 클라이언트용 소켓 배열 중 1개를 지정해서 사용
    public void send(Socket sock) throws IOException {
        // 여러개 소켓 배열중 1개만 사용해도 된다. 서버는 1개니깐
        System.out.println("숫자를 입력하세요: ");
        String str = scan.nextLine();

        out[ZERO] = sock.getOutputStream();
        out[ZERO].write(str.getBytes());
    }

    // 서버용 for문을 통해 배열을 채움움
    public void recv(Socket[] sock, int num) throws IOException {
        int tmp;

        for (int i = ZERO; i < num; i++) {
            in[i] = sock[i].getInputStream();

            reader = new BufferedReader(new InputStreamReader(in[i]));

            tmp = Integer.parseInt(reader.readLine());

            if (tmp == MAGICNUM) {
                arrRockScissorsPaper[i] = Integer.toString(tmp + ONE);
            } else {
                arrRockScissorsPaper[i] = Integer.toString(tmp);
            }

            System.out.println("msg: " + arrRockScissorsPaper[i]);
        }
    }

    public void recv(Socket sock) throws IOException {
        in[ZERO] = sock.getInputStream();

        reader = new BufferedReader(new InputStreamReader(in[ZERO]));

        System.out.println(reader.readLine());
    }

    public boolean canWeGetWinner(int num) {
        // 3명 이상이 함께 가위바위보를 할 때 승패를 어떻게 판정할 것인가?
        // 가위 = 1, 바위 = 2. 보 = 4
        // 모든 값을 OR 했을 때 7이 나올 것이다.
        // 만약 1, 2, 3 이라면 OR 결과는 3이므로
        // 이것이 보인지 무승부인지 판정이 불가
        // 2^0 부터 계속 OR 연산을 해나가면 2^n - 1 값이 나온다.
        int bitOROfAllInputString = ZERO;

        for (int i = ZERO; i < num; i++) {
            bitOROfAllInputString |=
                    Integer.parseInt(arrRockScissorsPaper[i]);
        }

        if (bitOROfAllInputString == 7) {
            return false;
        } else if (bitOROfAllInputString == 1) {
            return false;
        } else if (bitOROfAllInputString == 2) {
            return false;
        } else if (bitOROfAllInputString == 4) {
            return false;
        }

        return true;
    }

    // 넘어온 데이터가 정수(1,2,3(4))이기 때문에 문자열로 바꿔주어야 한다.
    public String convertNumber2RSP() {
        String res = "";
        int len = arrRockScissorsPaper.length;

        for (int i = ZERO; i < len; i++) {
            res += (i + 1) + "번 사용자: ";

            if (arrRockScissorsPaper[i].equals("1")) {
                res += "가위";
            } else if (arrRockScissorsPaper[i].equals("2")) {
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

    public void close(Socket sock) throws IOException {
        sock.close();
    }
}
