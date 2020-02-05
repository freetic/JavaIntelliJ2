import java.io.IOException;
import java.io.InputStream;

public class IOBasic {
	public static void main(String[] args) {
		//ǥ����� : ��� Buffer -> Monitor, Console, Terminal, System.out
		//ǥ���Է� : Keyboard -> �Է� Buffer, System.in
		InputStream is = System.in;
		System.out.print("�����Ͻô� ������ ? : ");
		String season = "";
		int number = 0;
		try {
			while(true) {
				number = is.read();
				if(number < 0 || (char)number == '\n') break;
				season += (char)number;	
			}
			System.out.println("season = " + season);
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
