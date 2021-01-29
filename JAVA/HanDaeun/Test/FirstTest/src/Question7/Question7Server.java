/*
        < Question 7 >
컴퓨터와 주사위를 굴려서 숫자가 크면 승리하도록 프로그래밍해보자!
*/


package Question7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import ClassList.DiceGame;

public class Question7Server {
    public static void main(String[] args) {
        int port = Integer.parseInt("33333");
        String receivedMsg;
        String sendMsg, rpsInput;

        try {
            System.out.println("Player 1 이 다른 플레이어를 기다리는 중입니다...\n");

            ServerSocket servSock = new ServerSocket(port);
            Socket clntSock = servSock.accept();

            OutputStream out = clntSock.getOutputStream();
            PrintWriter writer = new PrintWriter(out, true);

            InputStream in = clntSock.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));

            DiceGame dice = new DiceGame();
            Scanner scan = new Scanner(System.in);

            System.out.println("[" + clntSock.getInetAddress() + "] Player 2 가 입장하셨습니다.");


            while(true) {
                // 새로운 게임을 세팅
                sendMsg = "";
                writer.println(sendMsg);
                System.out.println(sendMsg);

                // Player 2(Client) 의 입력을 받음
                dice.setDiceInput();
                sendMsg = dice.getMsg();
                writer.println(sendMsg);
                System.out.println(dice.getP1WAIT());
                receivedMsg = reader.readLine();
                dice.diceGamePlay(receivedMsg);

                // 플레이어들의 값을 양쪽에 모두 출력해줌
                if(!dice.getWrongInput()) {
                    System.out.println("Player 1: " + dice.getP1DiceNum());
                    System.out.println("Player 2: " + dice.getP2DiceNum());
                    writer.println("Player 1: " + dice.getP1DiceNum());
                    writer.println("Player 2: " + dice.getP2DiceNum());
                }

                // 게임의 결과를 양쪽에 모두 출력해줌
                sendMsg = dice.getMsg();
                System.out.println(sendMsg);
                writer.println(sendMsg);
            }

        } catch (IOException e) {
            System.out.println("Server Exception: " + e.getMessage());

            e.printStackTrace();
        }
    }
}