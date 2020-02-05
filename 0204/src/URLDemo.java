import java.io.*;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws IOException {
        String url = "http://dml.komacon.kr/";
        URL myurl = new URL(url);

        InputStream is = myurl.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        PrintWriter pw = new PrintWriter(new FileWriter("c:/temp/sist.html"), true);

        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
            pw.println(line);
        }

        br.close();
    }
}
