package jan0120;

import java.io.*;
import java.lang.invoke.SwitchPoint;
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

        //in = new InputStream[ONE];
        out = new OutputStream[ONE];
    }

    // recv용 [현재 개발 관점은 서버 입자]
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
        for(int i = ZERO; i < num; i++) {
            out[i] = sock[i].getOutputStream();

            writer = new PrintWriter(out[i], true);

            String str = convertNumber2RSP();

            writer.println(str);
        }
    }
/*
    public  void recvString(Socket[] sock, int num) throws  IOException{
        String playerRCP;
        for(int i = ZERO; i < MAGICNUM; i++){
            in[i] = sock[i].getInputStream();

            reader = new BufferedReader(new InputStreamReader(in[i]));
            if(arrRockScissorPaper[i].equals("가위")){
                System.out.println("가위를 내쟈!");
            }else if (arrRockScissorPaper[i].equals("바위")){
                System.out.println("바위를 내쟈!.");
            }else if(arrRockScissorPaper[i].equals("보")){
                System.out.println("보를 내쟈!.");
            }
        }
    }

    public boolean letsBeWinner(Socket[] sock, int num) throws IOException{
        InputStream game;
        for(int i = ZERO; i < MAGICNUM; i++){
           in[i] =sock[i].getInputStream(); ;
           game = sock[i].getInputStream();
            reader = new BufferedReader(new InputStreamReader(in[i]));
        switch (game){
            case("가위") :
                    {==1 && b==1){
                    System.out.println("비겼습니다.");}
                else if(a==2 &&  b==3){
                    System.out.println("비겼습니다.");}
                else if(a==3 &&  b==2){
                    System.out.println("비겼습니다.");}
                else if(a==3 &&  b==3){
                    System.out.println("이겼습니다");}
                else{
                    System.out.println("졌습니다");}
                break;
            }
            if(arrRockScissorPaper[ZERO].equals("가위") &&
                    arrRockScissorPaper[1].equals("보") &&
                         arrRockScissorPaper[2].equals("보")){
                System.out.println("첫번쨰 플레이어 win");
            }else if(arrRockScissorPaper[ZERO].equals("바위") &&
                    arrRockScissorPaper[1].equals("가위") &&
                    arrRockScissorPaper[2].equals("가위")){
                System.out.println("첫번쨰 플레이어 win");
            }else if((arrRockScissorPaper[ZERO].equals("보") &&
                    arrRockScissorPaper[1].equals("바위") &&
                    arrRockScissorPaper[2].equals("바위")){
                System.out.println("첫번쨰 플레이어 win");
            }
        }
    }

 */
    public void recv(Socket[] sock, int num) throws IOException {
        int tmp;

        for(int i = ZERO; i < num; i++) {
            in[i] = sock[i].getInputStream();

            reader = new BufferedReader(new InputStreamReader(in[i]));

            // 미리 변환하지 않고 문자열인 상태에서 "3"과 같은지 비교하고
            // 같으면 바꾸고 같지 않으면 그대로 두는 형식이 더 효율적이다.
            // 숙제로 한 번 만들어보세요 ~
            tmp = Integer.parseInt(reader.readLine());

            if(tmp == MAGICNUM) {
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