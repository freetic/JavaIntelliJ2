import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("URL : ");
		String urlStr = scan.next();  //https://www.naver.com
//		URL url = null;
//		BufferedReader br = null;
//		PrintWriter pw = null;
		String line, path = null;
		int endIndex = urlStr.lastIndexOf(".");  //17
		String lastDomain = urlStr.substring(endIndex + 1);   
		if(lastDomain.length() == 2 && !lastDomain.equals("io")
				&& !lastDomain.equals("ai") && !lastDomain.equals("me")) {
			//국가 도메인, kr, jp, de, uk, cn, ca, tv
			//https://www.sist.co.kr
			int startIndex = urlStr.indexOf(".");   //10
			//System.out.println(startIndex);
			int last = urlStr.indexOf(".", startIndex);  //16
			path = urlStr.substring(startIndex + 1, last);   //sist
		}
		//	else {
//			//com, edu, gov, org
//			path = urlStr.substring(urlStr.indexOf(".") + 1, endIndex); //naver
//		}
//		path += ".html";
//		try {
//			url = new URL(urlStr);
//			br = new BufferedReader(
//					new InputStreamReader(url.openStream(), "UTF-8"));
//			pw = new PrintWriter(new BufferedWriter(new FileWriter(path)));
//			while((line = br.readLine()) != null) {
//				//System.out.println(line);
//				pw.println(line);
//			}
//			System.out.println("Save Success.");
//		} catch (MalformedURLException e) {
//			System.out.println("URL is invalid.");
//		} catch (IOException e) {
//			System.out.println(e);
//		} finally {
//			try {
//				br.close();
//			} catch (IOException e) {}
//		}
	}
}
