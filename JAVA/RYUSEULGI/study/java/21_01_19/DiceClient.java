import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class DiceClient {
    public static void main(String[] args) {

        String hostname = "192.168.0.217";
        int port = 5555;
        Dice dice = new Dice();

        for (int i = 0; i < 10; i++) {
            try {
                Socket socket = new Socket(hostname, port);

                OutputStream out = socket.getOutputStream();
                PrintWriter printWriter = new PrintWriter(out, true);

                printWriter.println(dice.randomDice());

                InputStream input = socket.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input));

                System.out.println(bufferedReader.read());
            } catch (UnknownHostException e) {
                System.out.println("Server Not Found: " + e.getMessage());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
