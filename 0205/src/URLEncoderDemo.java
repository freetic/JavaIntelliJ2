import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Scanner;

public class URLEncoderDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Encoding할 문자열 : ");
        String original = sc.nextLine();
        String encode = URLEncoder.encode(original, "EUC-KR");
        System.out.println(original + " --> " + encode);
//        System.out.print("Decoding할 문자열 : ");
//        String original = sc.nextLine();
        String decode = URLDecoder.decode(encode, "EUC-KR");
        System.out.println(encode + " --> " + decode);
    }
}
