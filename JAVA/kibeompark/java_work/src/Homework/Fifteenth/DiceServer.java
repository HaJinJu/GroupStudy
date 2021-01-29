package Homework.Fifteenth;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class DiceServer {
    public static void main(String[] args) {
        int port = Integer.parseInt("33333");

        try {
            ServerSocket servSock = new ServerSocket(port);

            System.out.println("Server : Listening - " + port);

            while (true) {
                Socket clntSock = servSock.accept();

                System.out.println(
                        "[" + clntSock.getInetAddress() +
                                "] client connected"
                );

                OutputStream out = clntSock.getOutputStream();
                PrintWriter writer = new PrintWriter(out, true);
                InputStream in = clntSock.getInputStream();
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));

                DiceGame dg = new DiceGame();

                int diceNum = dg.playGame();

                // writer 사용 시
                // println을 쓰면
                // 클라이언트 쪽 결과 창에 서버 쪽에서 넘긴 것과 숫자가 다르게 나오고
                // print를 쓰면
                // 클라이언트 쪽에서 아예 결과가 뜨지 않아
                // sout으로 출력을 해 보았지만 출력 값도 나오지 않습니다.
                // 어떤 오류인지 왜 안 되는 것인지 궁금합니다.
                writer.println(Integer.toString(dg.playGame()));
                // out.write(diceNum);

                dg.printGame(diceNum, reader.read());
            }
        } catch (IOException e) {
            System.out.println("Server Exception : " + e.getMessage());

            e.printStackTrace();
        }
    }
}
