import java.io.IOException;
import java.io.InputStream;

public class IOBasic2 {
	public static void main(String[] args) throws IOException{
		System.out.print("Name : ");  String name = input();
		System.out.print("Age : ");    int age = Integer.parseInt(input());
		System.out.print("Address : ");  String address = input();
		System.out.println(name + ", " + age + ", " + address);
	}
	static String input() throws IOException{
		String str = null;
		InputStream is = System.in;
		byte [] buffer = new byte[200];
		int number = is.read(buffer);
		str = new String(buffer, 0, number-2);  //읽은 갯수에서 -2하면 엔터키 제거됨.
		return str;
	}
}
