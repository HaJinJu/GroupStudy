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
        //Q. [ZERO]는 초기화 된 배열을 의미 하는 건지?
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
            // 아래 코드 별도 질
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
            //입력 받은 값을 선언 하며 reader에 대입

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