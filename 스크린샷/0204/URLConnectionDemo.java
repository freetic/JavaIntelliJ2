import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * URL --> Read only
 * URLConnection --> Read / Write
 * GET  /   HTTP/1.1   HttpRequest Packet
 * HTTP/1.1   200   OK   HttpResponse Packet Header
 */
public class URLConnectionDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.nate.com/");
		URLConnection conn = url.openConnection();
		HttpURLConnection urlConn = (HttpURLConnection)conn;
		urlConn.setRequestMethod("GET");
		urlConn.connect();
		//System.out.println("Connect Type : " + urlConn.getContentType());
		//System.out.println("마지막 수정 날짜 : " + urlConn.getDate());
		//InputStream is = urlConn.getInputStream();
		//System.out.println(urlConn.getHeaderField("Server"));
		Map<String, List<String>> map = urlConn.getHeaderFields();
		Set<String> keys = map.keySet();
		Iterator<String> iters = keys.iterator();
		while(iters.hasNext()) {
			String key = iters.next();
			System.out.print(key + " --> ");
			System.out.println(urlConn.getHeaderField(key));
		}
		//System.out.println(keys);
		
		urlConn.disconnect();
	}
}





