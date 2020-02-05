import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

/**
 * URLConnection --> Read / Write
 * GET / HTTP/1.1 HttpRequest Packet
 * HTTP/1.1 200 OK HttpResponse
 */
public class URLConnectionDemo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("www.naver.com");
        URLConnection conn = url.openConnection();
        HttpURLConnection urlConn = (HttpURLConnection)conn;
        urlConn.setRequestMethod("GET");
        urlConn.connect();
//        System.out.println("Connect Type : " + urlConn.getContentType());
//        System.out.println("마지막 수정 날짜 : " + new Date(urlConn.getDate()).toString());
        Map<String, List<String>> map = urlConn.getHeaderFields();
        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
//        while(iter.hasNext()){
//            String key = iter.next();
//            System.out.println(key + " --> ");
//        }
        System.out.println(urlConn.getHeaderField("Server"));
//        InputStream is = urlConn.getInputStream();
        urlConn.disconnect();
    }
}
