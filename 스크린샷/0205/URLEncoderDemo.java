import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Scanner;

//�ѱ� --> Unicode
public class URLEncoderDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		Scanner scan = new Scanner(System.in);
//		System.out.print("Encoding�� ���ڿ� : ");
//		String original = scan.nextLine();  //�ڹ�
//		String encode = URLEncoder.encode(original, "UTF-8");
//		System.out.println(original + " --> " + encode);
		System.out.print("Decoding�� ���ڿ� : ");
		String original = scan.nextLine();  //�ڹ�
		String decode = URLDecoder.decode(original, "UTF-8");
		System.out.println(original + " --> " + decode);
	}
}
