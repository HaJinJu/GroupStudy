package Fourteenth;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static java.lang.Thread.sleep;

public class SocketClientTest {
    public static void main(String[] args)
            throws UnknownHostException, InterruptedException {
        SocketCilent sc;
        GetLocalHost glh = new GetLocalHost();

        InetAddress ia = glh.getLocalHostInfo();

        sc = new SocketCilent(ia.getHostAddress(),33333);

        sleep(20000);

        sc.closeSocket();
    }

}
