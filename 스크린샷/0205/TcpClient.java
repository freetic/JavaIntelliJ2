import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	private Socket socket;
	public TcpClient() {
		try {
			this.socket = new Socket("localhost", 8888);
		} catch (UnknownHostException e) {
			System.out.println("Host Not Found");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	private void service() {}
	public static void main(String[] args) {
		new TcpClient().service();
	}
}
