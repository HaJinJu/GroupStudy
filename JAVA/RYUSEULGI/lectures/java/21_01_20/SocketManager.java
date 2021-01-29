import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketManager {

    private final int ZERO = 0;
    private final int ONE = 1;
    // OR 연산의 특징을 깔끔하게 하기 위해 3+1
    private final int MAGICNUM = 3;

    // 중개자 역할을 제대로 할 수 없기 때문에 배열로 변경해줌
    private OutputStream[] out;
    private InputStream[] in;

    private PrintWriter writer;
    private BufferedReader reader;

    private Scanner scan;

    String[] arrRSP;

    // send용 [현재 개발 관점은 클라이언트 입장]
    public SocketManager() {
        scan = new Scanner(System.in);

        // 1개만 보내면 되기 때문
        out = new OutputStream[ONE];
    }

    // receive용 [현재 개발 관점은 서버 입자]
    public SocketManager(int num) {
        // 1개만 보내면 되기 때문
        out = new OutputStream[num];
        in = new InputStream[num];
        arrRSP = new String[num];
    }

    public void send(Socket sock) throws IOException {
        System.out.println("가위바위보 숫자를 입력하세요");
        String str = scan.nextLine();

        out[ZERO] = sock.getOutputStream();
        out[ZERO].write(str.getBytes());
    }

    public String convertRSP() {
        String res = "";
        int len = arrRSP.length;

        for (int i = ZERO; i < len; i++) {
            res += (i + 1) + "번 사용자 : ";

            if (arrRSP[i].equals("1")) {
                res += "가위";
            } else if (arrRSP[i].equals("2")) {
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

    // 어떤 sock을 사용하였는지 확인하기
    // 여러사람의 내용을 관리하기 위함
    public void send(Socket[] sock, int num) throws IOException {
        for (int i = ZERO; i < num; i++) {
            out[i] = sock[i].getOutputStream();
            writer = new PrintWriter(out[i], true);

            String str = convertRSP();
            writer.println(str);

        }
    }

    public void recv(Socket[] sock, int num) throws IOException {
        int tmp;

        for (int i = ZERO; i < num; i++) {
            in[i] = sock[i].getInputStream();
            reader = new BufferedReader(new InputStreamReader(in[i]));

            tmp = Integer.parseInt(reader.readLine());

            if (tmp == MAGICNUM) {
                arrRSP[i] = Integer.toString(tmp + ONE);
            } else {
                arrRSP[i] = Integer.toString(tmp);
            }
            System.out.println("msg: " + arrRSP[i]);
        }
    }

    public boolean checkWinner(int num) {
        // 3명이서 가위바위보 할 때 승패?
        // or연산을 하기 위해 3일경우 1 더해주기
        int bitOROfAllInputString = 0;

        for (int i = ZERO; i < num; i++) {
            // String을 무산시켜주기 7이 들어옴
            bitOROfAllInputString |= Integer.parseInt(arrRSP[i]);
        }

        if (bitOROfAllInputString == 7) {
            // 승패 판정 불가
            // 7이 아니라면 3개가 모두 중복이 아니라는 소리
            return false;
        } else if (bitOROfAllInputString == 1) {
            // 모두 가위
            return false;
        } else if (bitOROfAllInputString == 2) {
            // 모두 바위
            return false;
        } else if (bitOROfAllInputString == 4) {
            // 모두 보
            return false;
        }
        return true;
    }
}