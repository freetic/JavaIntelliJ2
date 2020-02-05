import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	private Scanner scan;

	public CalculatorClient() {
		this.scan = new Scanner(System.in);
		try {	//211.63.89.154
			this.socket = new Socket("localhost", 8888);
			System.out.println("Connection Success");
			InputStream is = this.socket.getInputStream();
			this.br = new BufferedReader(new InputStreamReader(is));
			OutputStream os = this.socket.getOutputStream();
			this.pw = new PrintWriter(new OutputStreamWriter(os));
		} catch (UnknownHostException e) {
			System.out.println("Host Not Found");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	private void service() {
		try {
			String y_n = null;
			do {
				System.out.print("첫번째 숫자 : ");  int first = this.scan.nextInt();
				System.out.print("두번째 숫자 : ");  int second = this.scan.nextInt();
				System.out.print("연산자(+, -, x, /) : ");  String op = this.scan.next();
				//TODO : 보내기
				String message = String.format("%d   %s    %d", first, op, second);
				this.pw.println(message);    this.pw.flush();
				//TODO : 받기
				message = this.br.readLine();  //"12"
				System.out.printf("%d %s %d = %s\n", first, op, second, message);
				System.out.print("Again(y/n) ? : ");
				y_n = this.scan.next();
			}while(y_n.toUpperCase().equals("Y"));
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		new CalculatorClient().service();
	}
}
