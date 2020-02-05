import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    private ServerSocket server;

    public TcpServer() {
        try {
            this.server = new ServerSocket(8888);
            System.out.println("Server Ready");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void service(){
        Socket client = null;
        try {
            while (true) {
                client = this.server.accept();
                System.out.println(client.getInetAddress().getHostAddress() + " 으로부터 접속됨.");
            }
        } catch(IOException e){
            e.printStackTrace();
            System.out.println("Server Close");
        }
    }

    public static void main(String[] args) {
        TcpServer server = new TcpServer();
        server.service();
    }
}
