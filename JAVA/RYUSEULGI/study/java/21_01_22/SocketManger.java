import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SocketManger {

    private OutputStream[] out;
    private InputStream[] in;
    private PrintWriter writer;
    private BufferedReader reader;

    private Scanner scan;

    int sendCnt = 0;
    int recvCnt = 0;

    String[] arrRSP;

    // 서버용 생성자
    public SocketManger(int num) {
        out = new OutputStream[num];
        in = new InputStream[num];
        arrRSP = new String[num];
    }

    // 클라이언트용 생성자
    public SocketManger() {
        scan = new Scanner(System.in);
        out = new OutputStream[1];
        in = new InputStream[1];
    }

    // 서버용 보내기
    public void send(Socket[] socket) throws IOException {
        out[sendCnt] = socket[sendCnt].getOutputStream();
        writer = new PrintWriter(out[sendCnt++], true);

        String str = convertNum2RSP();

        writer.println(str);
    }

    // 클라이언트용 보내기
    public void send(Socket socket) throws IOException {
        System.out.println("숫자를 입력하세요");
        String str = scan.nextLine();

        out[0] = socket.getOutputStream();
        out[0].write(str.getBytes());
    }

    // 서버용 받기
    public void recv(Socket[] socket) throws IOException {
        int tmp;

        in[recvCnt] = socket[recvCnt].getInputStream();
        reader = new BufferedReader(new InputStreamReader(in[recvCnt]));

        tmp = Integer.parseInt(reader.readLine());

        if (tmp == 3) {
            arrRSP[recvCnt] = Integer.toString(tmp + 1);
        } else {
            arrRSP[recvCnt] = Integer.toString(tmp);
        }

        // String inputNum = reader.readLine();

        // if (inputNum.equals("3")) {
        // arrRSP[recvCnt] = "4";
        // } else {
        // arrRSP[recvCnt] = inputNum;
        // }

        System.out.println("msg: " + arrRSP[recvCnt++]);
    }

    // 클라이언트용 받기
    public void recv(Socket socket) throws IOException {
        in[0] = socket.getInputStream();
        reader = new BufferedReader(new InputStreamReader(in[0]));

        System.out.println(reader.readLine());
    }

    public void close(Socket socket) throws IOException {
        socket.close();
    }

    public boolean game(int num) {

        int bitORinputString = 0;

        for (int i = 0; i < num; i++) {
            bitORinputString |= Integer.parseInt(arrRSP[i]);
        }

        if (bitORinputString == 7) {
            return false;
        } else if (bitORinputString == 1) {
            return false;
        } else if (bitORinputString == 2) {
            return false;
        } else if (bitORinputString == 4) {
            return false;
        }

        return true;
    }

    public String convertNum2RSP() {
        String result = "";

        for (int i = 0; i < arrRSP.length; i++) {
            result += (i + 1) + " 번 사용자";

            if (arrRSP[i].equals("1")) {
                result += "가위";
            } else if (arrRSP[i].equals("2")) {
                result += "바위";
            } else {
                result += "보";
            }

            if (i == arrRSP.length - 1) {
                result += "";
            } else {
                result += ", ";
            }
        }
        return result;
    }
}
