import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class IPAddress {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println("System IP address: " + InetAddress.getLocalHost().getHostAddress());
        try {
            URL url = new URL("http://checkip.amazonaws.com");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            System.out.println("Public IP address: " + br.readLine());
        } catch (IOException e) {
            System.out.println("Cannot execute properly.");
        }
    }
}