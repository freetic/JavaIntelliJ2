import java.io.IOException;
import java.io.InputStream;

public class IOBasic1 {
	public static void main(String[] args) {
		//ǥ����� : ��� Buffer -> Monitor, Console, Terminal, System.out
		//ǥ���Է� : Keyboard -> �Է� Buffer, System.in
		InputStream is = System.in;
		System.out.print("�����Ͻô� ������ ? : ");
		String season = "";
		int number = 0;
		byte [] buffer = new byte[20];
		try {
			number = is.read(buffer);
			season = new String(buffer, 0, number);
			System.out.println("season = " + season);
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}
}
