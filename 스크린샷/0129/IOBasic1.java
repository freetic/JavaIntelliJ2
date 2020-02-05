import java.io.IOException;
import java.io.InputStream;

public class IOBasic1 {
	public static void main(String[] args) {
		//표준출력 : 출력 Buffer -> Monitor, Console, Terminal, System.out
		//표준입력 : Keyboard -> 입력 Buffer, System.in
		InputStream is = System.in;
		System.out.print("좋아하시는 계절은 ? : ");
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
