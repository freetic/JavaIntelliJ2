import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
    private DatagramPacket packet;
    private DatagramSocket socket;

    public UdpServer() {
        try {
            this.socket = new DatagramSocket(8888);
            System.out.println("I'm ready...");
        } catch (SocketException e) {
            System.out.println(e);
        }
    }
    private void service() {
        DatagramPacket receivePacket = null;
        try {
            byte [] buffer = new byte[512];
            receivePacket = new DatagramPacket(buffer, buffer.length);
            this.socket.receive(receivePacket);
            String message = new String(buffer, 0, receivePacket.getLength());
            System.out.println("수신 메시지 : " + message);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new UdpServer().service();
    }
}
