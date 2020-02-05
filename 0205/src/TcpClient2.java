import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient2 {
    private Socket socket;
    private BufferedReader br;

    public TcpClient2() {
        try {
            this.socket = new Socket("localhost", 8888);
            InputStream is = this.socket.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));
        } catch (UnknownHostException e) {
            System.out.println("Host Not Found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void service(){
        String msg = null;
        try {
            msg = this.br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(msg);
    }

    public static void main(String[] args) {
        new TcpClient2().service();
    }
}
