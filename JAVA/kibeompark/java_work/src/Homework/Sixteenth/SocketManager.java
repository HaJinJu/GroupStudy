package Homework.Sixteenth;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

// 소켓과 게임을 전체적으로 관리하는 클래스
public class SocketManager {
    private final int ZERO = 0;
    private final int ONE = 1;
    // OR 연산의 특성을 활용하기 위해 3인 경우를 4로 만들기 위함
    private final int MAGICNUM = 3;

    // 바이트 단위 출력 스트림 객체 배열 선언
    private OutputStream[] out;
    // 바이트 단위 입력 스트림 객체 배열 선언
    private InputStream[] in;

    // 문자 단위 출력 스트림 객체 선언
    private PrintWriter writer;
    // 문자 단위 입력 스트림 객체 선언
    private BufferedReader reader;

    private Scanner scan;

    // 가위바위보 게임에 대한
    // 클라이언트의 입력 값을 저장하는 배열 선언
    String[] arrRockScissorPaper;

    // send용 [현재 개발 관점은 클라이언트 입장]
    public SocketManager() {
        scan = new Scanner(System.in);

        in = new InputStream[ONE];
        // 클라이언트는 출력 값이 하나이므로
        // 배열 크기를 1로 하여 생성
        out = new OutputStream[ONE];
    }

    // recv용 [현재 개발 관점은 서버 입장]
    public SocketManager(int num) {
        // scan = new Scanner(System.in);

        // 클라이언트 수만큼의 입력 스트림 배열 생성
        in = new InputStream[num];
        // 클라이언트 수만큼의 출력 스트림 배열 생성
        out = new OutputStream[num];

        // 클라이언트 수만큼의 배열 생성
        arrRockScissorPaper = new String[num];
    }

    // 가위바위보 게임에 대해 사용자에게서 입력 받은 값을 서버로 보내기 위한 메서드
    public void send(Socket sock) throws IOException {
        System.out.println("숫자를 입력하세요. " );
        String str = scan.nextLine();

        // 서버로 송신하기 위한 출력 스트림
        out[ZERO] = sock.getOutputStream();
        // 사용자로부터 입력 받은 값을
        // 바이트 단위로 쪼개서 서버로 보냄
        out[ZERO].write(str.getBytes());
    }

    public String convertNumber2RSP() {
        // 문자열을 쌓아 나갈 변수 res 선언 및 초기화
        String res = "";
        // len은 클라이언트가 입력한 값들이 저장된 배열의 크기
        // = 클라이언트 수
        int len = arrRockScissorPaper.length;

        for (int i = ZERO; i < len; i++) {
            // 몇 번 사용자인지 문자열 추가
            res += (i + ONE) + "번 사용자 : ";

            // 클라이언트가 입력한 값이 1 이라면
            if (arrRockScissorPaper[i].equals("1")) {
                res += "가위";
            // 클라이언트가 입력한 값이 2 이라면
            } else if (arrRockScissorPaper[i].equals("2")) {
                res += "바위";
            // 클라이언트가 입력한 값이 3 이라면
            } else {
                res += "보";
            }

            // 마지막 클라이언트까지 도달했다면
            if (i == len - ONE) {
                // 그대로 끝
                res += "";
            // 아직 남아있다면
            } else {
                // 구분자 표시
                res += ", ";
            }
        }

        // 각 클라이언트별 입력한 결과를 저장한 문자열 변수 반환
        return res;
    }

    // 사용자들에게 입력 받은 결과를 취합하여 송신하는 메서드
    public void send(Socket[] sock, int num) throws IOException {
        for (int i = ZERO; i < num; i++) {
            // 서버에서 각 클라이언트 측으로 송신할 값을
            // 바이트 단위로 보내기 위한 배열 out
            out[i] = sock[i].getOutputStream();

            // 바이트 스트림을 문자 스트림으로 변환하고
            // 자동으로 버퍼가 초기화 되도록 설정한 뒤
            // 변수 writer에 저장
            writer = new PrintWriter(out[i], true);

            // String 형 변수 str은
            // convertNumber2RSP 메서드의 리턴 값
            // (= 클라이언트들의 입력 값 모음)
            String str = convertNumber2RSP();

            // 서버 측에서 클라이언트들에게 입력 받은 결과를 취합하여 문자열로 저장해
            // 클라이언트 측에 문자 단위 스트림 방식으로 송신
            writer.println(str);
        }
    }

    // 입력 받은 결과를 모아 출력하는 메서드
    public void recv(Socket[] sock, int num) throws IOException {
        // 클라이언트들이 입력한 값을 저장하기 위한 변수
        int tmp;

        for (int i = ZERO; i < num; i++) {
            // 클라이언트에서 송신한 값을
            // 서버 측에서 바이트 단위로 받아오기 위한 배열 in
            in[i] = sock[i].getInputStream();

            // InputStreamReader에 의해
            // 바이트 스트림을 문자 스트림으로 변환된 값을
            // BufferedReader를 통해
            // 문자 버퍼로 입력한 뒤
            // 변수 reader에 저장
            reader = new BufferedReader(new InputStreamReader(in[i]));

            // 미리 변환하지 않고 문자열인 상태에서 "3"과 같은지 비교하고
            // 같으면 바꾸고 같지 않으면 그대로 두는 형식이 더 효율적이다.
            // 숙제로 한 번 만들어 보세요 ~

            /* <숙제>
            if (reader.readLine().equals("3")) {
                tmp = Integer.parseInt(reader.readLine()) + ONE;
                arrRockScissorPaper[i] = Integer.toString(tmp);
            } else {
                arrRockScissorPaper[i] = reader.readLine();
            }
             */

            // String 형으로 받아온 값(가위바위보 입력값)을
            // int 형으로 변환 후 tmp에 저장
            tmp = Integer.parseInt(reader.readLine());

            // 사용자가 입력한 값이 3일 경우
            if (tmp == MAGICNUM) {
                // 비트 연산(OR)을 위해 1을 더해 4로 만든 뒤
                // 문자열 형식(String)으로 변환하여
                // 게임 입력 값을 저장하는 배열의 해당 인덱스에 저장
                arrRockScissorPaper[i] = Integer.toString(tmp + ONE);
            // 사용자가 입력한 값이 1 또는 2일 경우
            } else {
                // 그대로 문자열 형식(String)으로 변환하여
                // 게임 입력 값을 저장하는 배열의 해당 인덱스에 저장
                arrRockScissorPaper[i] = Integer.toString(tmp);
            }

            // 클라이언트들이 입력한 값을 서버 측 화면에 출력
            System.out.println("msg : " + arrRockScissorPaper[i]);
        }
    }

    // OR 연산을 통해 무승부인 경우를 판단하기 위한 메서드
    public boolean canWeGetWinner(int num) {
        // 3명 이상이 함께 가위바위보를 할 때 승패를 어떻게 판정할 것인가 ?
        // 가위 = 1, 바위 = 2, 보 = 4 라면
        // 모든 값을 OR 했을 때 7이 나올 것이다.
        // 만약 1, 2, 3 이라면 OR 결과는 3이므로
        // 이것이 보인지 무승부인지 판정이 불가

        // OR 연산을 위해 변수를 0으로 초기화
        int bitOROfAllInputString = ZERO;

        // 클라이언트들의 입력 값에 대한 OR 연산 진행
        for (int i = ZERO; i < num; i++) {
            bitOROfAllInputString |=
                    Integer.parseInt(arrRockScissorPaper[i]);
        }

        // 가위, 바위, 보 모두 나올 때
        if (bitOROfAllInputString == 7) {
            return false;
        // 모두 가위를 냈을 때
        } else if (bitOROfAllInputString == 1) {
            return false;
        // 모두 바위를 냈을 때
        } else if (bitOROfAllInputString == 2) {
            return false;
        // 모두 보를 냈을 때
        } else if (bitOROfAllInputString == 4) {
            return false;
        }

        // 무승부가 아닌 경우
        return true;
    }
}
