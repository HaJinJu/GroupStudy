package jan0119;
/*
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ConsoleChatServer extends Thread {
    private Socket sock;
    private static ArrayList<Socket> clients = new ArrayList<Socket>(2);
                            //아래 여기로 와
    public ConsoleChatServer(Socket sock){
            //초기화된다.
        this.sock =sock;
    }
    public void remote(Socket socket){
        for ( Socket s : ConsoleChatClient1Server.client){
            if(Socket == s){
                ConsoleChatClient1Server.clients.remove(socket);
                break;
            }
        }
    }
    //아래 run은 쓰레드가 할 일은 말함
    public void run(){
        InputStream fromClient = null;
        OutputStream toClient = null;

        try{
            System.out.println(sock + ": 연결됨");

            fromClient =sock.getInputStream();

            byte[] buf = new byte[1024];
            int count;
            while((count = fromClient.read(buf)) !=-1){
                for(Socket s : ConsoleChatClient1Server.clients){
                    if(sock !=s){
                        toClient = s.getOutputStream();
                        toClient.write(buf, 0, count);
                        toClient.flush();//flush는 buf클리어
                    }
                }
                System.out.println(buf, 0, count);
            }
        }
        catch (IOException ex){
            System.out.println(sock + ": 에러(" + ex + ")");
        }finally {
            try{
                if(sock != null){
                    sock.close();
                    //접속후 나가버린 클라이언트인 경우 Arraylist에서 제거
                    remove(sock);
                }
                fromClient = null;
                toClient = null;
            }catch(IOException){

            }
        }
    }

    public static void main(String[] args) throws IOException {

        ServerSocket serverSock =new ServerSocket(44444);
        System.out.println(serverSock + "서버소캣생성");

        while(true){
                 //아래 클라이언트
            Socket client = serverSock.accept();
            client.add(client);
                                                            //아래 여기로그다
            ConsoleChatClient1Server myServer = new ConsoleChatClient1Server(client);
            myServer.start();
        }

    }

 */

