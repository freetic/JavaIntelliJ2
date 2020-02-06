import java.io.IOException;
import java.net.*;
import java.sql.Time;

public class TimeClient {
    private DatagramSocket client;
    private DatagramPacket receivePacket, sendPacket;

    public TimeClient() throws SocketException {
        client = new DatagramSocket();
    }
    private void service() throws IOException, InterruptedException {
        byte[] buffer = new byte[512];
        DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
        DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length,
                InetAddress.getByName("localhost"), 10000);
        for(int i = 0; i < 10; i++){
            Thread.sleep(1000);
            this.client.send(sendPacket);
            this.client.receive(receivePacket);
            System.out.println(new String(buffer, 0, receivePacket.getLength()));
        }

    }
    public static void main(String[] args) throws IOException, InterruptedException {
        new TimeClient().service();
    }
}
