import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("URL : ");
        String urlStr = sc.next();      // https://www.naver.com
        URL url = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        String line = null;
        String path = null;

        int endIndex = urlStr.lastIndexOf(".");     // 17
        String lastDomain = urlStr.substring(endIndex+1);                      // com
        if(lastDomain.length() == 2 && !lastDomain.equals("io") &&
         !lastDomain.equals("ai") && !lastDomain.equals("me")){
            // 국가도메인 kr, jp, de, uk, cn, ca, tv
            int startIndex = urlStr.indexOf(".");
            int last = urlStr.indexOf(".", startIndex);
            path = urlStr.substring(startIndex, last);
        }else{
            // com, deu, gov, org, io, ai, me
            path = urlStr.substring(urlStr.indexOf(".") + 1, endIndex);
        }
        path += ".html";

        try {
            url = new URL(urlStr);
            br = new BufferedReader(
                            new InputStreamReader(url.openStream(), "UTF-8"));
            pw = new PrintWriter(new BufferedWriter(new FileWriter(path)));
            while((line = br.readLine()) != null){
//                System.out.println(line);
                pw.println(line);
            }
        } catch (MalformedURLException e) {
            System.out.println("URL is invalid");
        } catch (IOException e){
            System.out.println(e);
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
