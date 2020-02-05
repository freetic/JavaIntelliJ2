import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpServer2 {
	private ServerSocket server;
	
	public TcpServer2() {
		try {
			this.server = new ServerSocket(8888);
			System.out.println("I'm ready.");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	private void service() {
		Socket client = null;
		PrintWriter pw = null;
		try {
			while(true) {
				client = this.server.accept();
				System.out.println(
						"[" + client.getInetAddress().getHostAddress() + "]으로부터 접속됨.");
				OutputStream os = client.getOutputStream();
				pw = new PrintWriter(new OutputStreamWriter(os));
				String pattern = "yyyy-MM-dd aa hh:mm:ss.";
				SimpleDateFormat sdf = new SimpleDateFormat(pattern);
				String msg = sdf.format(new Date());
				pw.println(msg);    pw.flush();
				System.out.println("Sending Success.");
			}
		}catch(IOException ex) {
			System.out.println(ex);
			System.out.println("Server Close.");
		}
	}
	
	public static void main(String[] args) {
		TcpServer2 server = new TcpServer2();    server.service();
	}
	
}
