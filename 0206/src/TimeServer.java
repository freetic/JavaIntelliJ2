import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeServer {
    private DatagramSocket server = null;
    private DatagramPacket receivePacket, sendPacket;

    private TimeServer() throws SocketException {
        this.server = new DatagramSocket(10000);
        System.out.println("I'm ready . . . . . . . . . . . . . . . . . . . . . . . . . .");
    }
    private void service() throws IOException {
            DatagramPacket receivePacket = null;
            DatagramPacket sendPacket = null;
        while(true){
            byte[] buffer = new byte[2];
            receivePacket = new DatagramPacket(buffer, buffer.length);
            this.server.receive(receivePacket);
            String pattern = "hh:mm:ss";
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            String message = "지금은 " + sdf.format(new Date());
            sendPacket = new DatagramPacket(message.getBytes(),message.getBytes().length, receivePacket.getAddress(), receivePacket.getPort());
            this.server.send(sendPacket);
        }
    }

    public static void main(String[] args) throws IOException {
        new TimeServer().service();
    }

}
