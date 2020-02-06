import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpClient {
    private DatagramSocket socket = null;
    private UdpClient(){
        try {
            this.socket = new DatagramSocket();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
    private void service() {
        String message = "너는 밥은 먹고 다니나입니까?";
        DatagramPacket sendPacket = null;
        try {
            sendPacket = new DatagramPacket(message.getBytes(), message.getBytes().length,
                    InetAddress.getByName("localhost"), 8888);
            this.socket.send(sendPacket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new UdpClient().service();
    }


}
