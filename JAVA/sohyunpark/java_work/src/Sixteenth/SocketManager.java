package Sixteenth;

import java.io.*;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class SocketManager {
    private final int ZERO = 0;
    private final int ONE = 1;
    // OR 연산의 특성을 활용하기 위해 3인 경우를 4로 만들기 위함
    private final int MAGICNUM = 3;

    private OutputStream[] out;
    private InputStream[] in;

    private PrintWriter writer;
    private BufferedReader reader;

    private Scanner scan;

    String[] arrRockScissorPaper;

    // send용 [현재 개발 관점은 클라이언트 입장]
    public SocketManager() {
        scan = new Scanner(System.in);

        // in = new InputStream[ONE];
        out = new OutputStream[ONE];
    }

    // rev용 [현재 개발 관점은 서버 입장]
    public SocketManager(int num) {
        scan = new Scanner(System.in);

        out = new OutputStream[num];
        in = new InputStream[num];

        // max = 3만큼 할당
        arrRockScissorPaper = new String[num];
    }

    public void send(Socket sock) throws IOException {
        System.out.println("숫자를 입력하세요 : ");
        // 입력받은 숫자를 문자열로 받음
        String str = scan.nextLine();

        // OutputStream[] out에 클라이언트 소켓을 서버에 출력할 준비(설정을 함)
        out[ZERO] = sock.getOutputStream();
        // 입력받은 숫자(문자열)을 서버로 전송
        out[ZERO].write(str.getBytes());
    }

    public String convertNumber2RSP() {
        // res 초기화
        String res = "";
        // len = 3
        int len = arrRockScissorPaper.length;

        for(int i = ZERO; i < len; i++) {
            res += (i + 1) + "번 사용자 : ";

            // 배열 안의 값이 1과 같다면 res는 1번 사용자 : 가위
            if (arrRockScissorPaper[i].equals("1")) {
                res += "가위";
            } else if (arrRockScissorPaper[i].equals("2")) {
                res += "바위";
            } else {
                res += "보";
            }

            // i가 마지막 3번째 반복문을 돈 뒤라면
            if(i == len - ONE) {
                res += "";
            // i가 뒤에 돌아야할 반복문이 있다면
            } else {
                res += ", ";
            }
        }

        return  res;
    }

    //
    public void send(Socket[] sock, int num) throws IOException {
        for(int i = ZERO; i < num; i++) {
            // 클라이언트에게 출력할 준비
            out[i] = sock[i].getOutputStream();

            writer = new PrintWriter(out[i], true);

            // convertNumber2RSP() 메소드에서 반환된 res를 str에 대입
            String str = convertNumber2RSP();

            // str값을 클라이언트에게 출력(전송)
            writer.println(str);
        }
    }

    public void recv(Socket[] sock, int num) throws IOException {
        int tmp;

        for(int i = ZERO; i < num; i++) {
            // 클라이언트가 보낸 3개의 값 차례대로 받음
            in[i] = sock[i].getInputStream();

            reader = new BufferedReader(new InputStreamReader(in[i]));

            // 미리 변환하지 않고 문자열인 상태에서 "3"과 같은지 비교하고
            // 같으면 바꾸고 같지 않으면 그대로 두는 형식이 더 효율적이다.
            // reader.readLine()으로 읽은 값 정수형으로 변환해 tmp에 대입
            tmp = Integer.parseInt(reader.readLine());

            // 대입한 tmp가 3이라면
            if(tmp == MAGICNUM) {
                // 가위바위보배열에 1을 더해 대입 -> 문자열로 대입한다
                arrRockScissorPaper[i] = Integer.toString(tmp + ONE);
            // tmp가 1 혹은 2라면 입력 받은 그대로 숫자(문자열)로 대입
            } else {
                arrRockScissorPaper[i] = Integer.toString(tmp);
            }

            System.out.println("msg : " + arrRockScissorPaper[i]);
        }
    }

    public boolean canWeGetWinner(int num) {
        // 3명 이상이 함께 가위바위보를 할 때 승패를 어떻게 판정할 것인가?
        // 가위 = 1, 바위 = 2, 보 = 4라면
        // 모든 값을 OR 했을 때 7이 나올 것이다.
        // 만약 1, 2, 3이라면 OR 결과는 3이므로
        // 이것이 보인지 무승부인지 판정이 불가!
        int bitOROfAllInputString = ZERO;

        // 3명의 클라언트 소켓 값을 OR 연산 후
        // 예상 결과값 : 1(셋다가위), 2(셋다바위), 4(셋다보), 7(무승부)
        for(int i = ZERO; i < num; i++) {
            bitOROfAllInputString |= Integer.parseInt(arrRockScissorPaper[i]);
        }

        // 반복문 후의 결과값이 1, 2, 4, 7(무승부)이면 false 반환
        if(bitOROfAllInputString == 7) {
            return false;
        } else if(bitOROfAllInputString == 1) {
            return false;
        } else if(bitOROfAllInputString == 2) {
            return false;
        } else if(bitOROfAllInputString == 4) {
            return false;
        }

        // 무승부가 아니라면 즉, 승패가 결정난다면 true 반당
        return true;
    }
}