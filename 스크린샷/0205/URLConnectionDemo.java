import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class URLConnectionDemo {
	public static void main(String[] args) throws IOException{
		URL url = null;
		HttpURLConnection conn = null;
		String urlStr = "https://www.ahnlab.com/kr/site/product/productView.do?prodSeq=19";
		
		url = new URL(urlStr);
		conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		conn.setDoOutput(true);
		OutputStream os = conn.getOutputStream();
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(new OutputStreamWriter(os)));
		pw.println();  pw.flush();
		
		InputStream is = conn.getInputStream();
		BufferedReader br = null;
		String line = null;
		if(conn.getResponseCode() == 200) {
			br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}else {
			System.out.println("연결 실패");
		}
		conn.disconnect();
	}
}
