import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class URLConnectionDemo {
	public static void main(String[] args) throws IOException{
		URL url = null;
		HttpURLConnection conn = null;
//		String urlStr = "https://www.w3schools.com/action_page.php?FirstName=";
//		String q = "?FirstName" + URLEncoder.encode("김", "UTF-8") +
//				"&LastName=" + URLEncoder.encode("승현", "UTF-8");
//		urlStr += q;
		String urlStr = "https://www.ahnlab.com/kr/site/product/productView.do?prodSeq=8";
		//System.out.print("검색할 키워드 : ");
		//Scanner scan = new Scanner(System.in);
		//String keyword = URLEncoder.encode(scan.nextLine(), "UTF-8");
		//urlStr += keyword;
		url = new URL(urlStr);
		conn = (HttpURLConnection)url.openConnection();
		//conn.connect();
		conn.setRequestMethod("POST");
		conn.setDoInput(true);
		conn.setDoOutput(true);
		OutputStream os = conn.getOutputStream();
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(new OutputStreamWriter(os)));
		pw.println();  pw.flush();
		InputStream is = conn.getInputStream();
		BufferedReader br = null;
		String line = null;
		if(conn.getResponseCode() == 200){
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		}

		System.out.println(conn.getResponseCode());
		conn.disconnect();
	}
}
