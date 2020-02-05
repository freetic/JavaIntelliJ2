import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Scanner;

//한글 --> Unicode
public class URLEncoderDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner scan = new Scanner(System.in);
//		System.out.print("Encoding할 문자열 : ");
//		String original = scan.nextLine();  //자바
//		String encode = URLEncoder.encode(original, "UTF-8");
//		System.out.println(original + " --> " + encode);
		System.out.print("Decoding할 문자열 : ");
		String original = scan.nextLine();  //자바
		String decode = URLDecoder.decode(original, "UTF-8");
		System.out.println(original + " --> " + decode);
	}
}
