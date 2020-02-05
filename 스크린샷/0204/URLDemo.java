import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class URLDemo {
	public static void main(String[] args) throws IOException {
		String url = "https://spring.io/";
		URL myurl = new URL(url);
		InputStream is = myurl.openStream();
		BufferedReader br = new BufferedReader(
				new InputStreamReader(is));
		String line = null;
		PrintWriter pw = new PrintWriter(new FileWriter("spring.html"));
		while((line = br.readLine()) != null) {
			//System.out.println(line);  //naver.html
			pw.println(line);
		}
		System.out.println("File Save Success.");
		br.close();
	}
}





