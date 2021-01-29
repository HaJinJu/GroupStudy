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

    private PrintWriter writer;
    private BufferedReader reader;

    private Scanner scan;

    static int sendCnt = 0;
    static int recvCnt = 0;

    String[] arrRockScissorPaper;

    public SocketManager() {
        scan = new Scanner(System.in);

        in = new InputStream[ONE];
        out = new OutputStream[ONE];
    }

    public SocketManager(int num) {
        //scan = new Scanner(System.in);

        out = new OutputStream[num];
        in = new InputStream[num];

        arrRockScissorPaper = new String[num];
    }

    public void send(Socket sock) throws IOException {
        System.out.print("숫자를 입력하세요: ");
        String str = scan.nextLine();

        out[ZERO] = sock.getOutputStream();
        out[ZERO].write(str.getBytes());
    }

    public String convertNumber2RSP() {
        String res = "";
        int len = arrRockScissorPaper.length;

        for(int i = ZERO; i < len; i++) {
            res += (i + 1) + "번 사용자: ";

            if (arrRockScissorPaper[i].equals("1")) {
                res += "가위";
            } else if (arrRockScissorPaper[i].equals("2")) {
                res += "바위";
            } else {
                res += "보";
            }

            if(i == len - ONE) {
                res += "";
            } else {
                res += ", ";
            }
        }

        return res;
    }

    public void send(Socket[] sock, int num) throws IOException {
        out[sendCnt] = sock[sendCnt].getOutputStream();

        writer = new PrintWriter(out[sendCnt++], true);

        String str = convertNumber2RSP();

        writer.println(str);
    }

    public void recv(Socket[] sock, int num) throws IOException {

        int tmp;

        System.out.println("recvCnt = " + recvCnt);

        in[recvCnt] = sock[recvCnt].getInputStream();

        reader = new BufferedReader(new InputStreamReader(in[recvCnt]));

        tmp = Integer.parseInt(reader.readLine());

        if(tmp == MAGICNUM) {
            arrRockScissorPaper[recvCnt] = Integer.toString(tmp + ONE);
        } else {
            arrRockScissorPaper[recvCnt] = Integer.toString(tmp);
        }

        System.out.println("msg: " + arrRockScissorPaper[recvCnt++]);
    }

    public void recv(Socket sock) throws IOException {
        in[ZERO] = sock.getInputStream();

        reader = new BufferedReader(new InputStreamReader(in[ZERO]));

        System.out.println(reader.readLine());
    }

    public void close(Socket sock) throws IOException {
        sock.close();
    }

    public boolean canWeGetWinner(int num) {
        int bitOROfAllInputString = ZERO;

        for(int i = ZERO; i < num; i++) {
            bitOROfAllInputString |=
                    Integer.parseInt(arrRockScissorPaper[i]);
        }

        if(bitOROfAllInputString == 7) {
            return false;
        } else if(bitOROfAllInputString == 1) {
            return false;
        } else if(bitOROfAllInputString == 2) {
            return false;
        } else if(bitOROfAllInputString == 4) {
            return false;
        }

        return true;
    }
}
