package networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkingMain {

    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Networking Demo");
        networkingDemo();
    }

    static void networkingDemo () throws UnknownHostException {
        String url = "www.simplilearn.com";
        InetAddress inetAddress = Inet4Address.getByName(url);

        System.out.println("Address : " + Arrays.toString(inetAddress.getAddress()));


        // getHostAddress()
        System.out.println("Host Address: " + inetAddress.getHostAddress());

        // isAnyLocalAddress()
        System.out.println("isAnyLocalAddress : " + inetAddress.isAnyLocalAddress());

        // isLinkLocalAddress()
        System.out.println("isLinkLocalAddress: " + inetAddress.isLinkLocalAddress());

        // isLoopbackAddress()
        System.out.println("isLoopbackAddress: " + inetAddress.isLoopbackAddress());

        // isSiteLocalAddress()
        System.out.println("isSiteLocalAddress: " + inetAddress.isSiteLocalAddress());

        // hashCode()
        System.out.println("HashCode : " + inetAddress.hashCode());


    }
}
