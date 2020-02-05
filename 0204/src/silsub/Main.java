package silsub;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("URL : ");
        String url = sc.next();
        URL myurl = new URL(url);

        StringTokenizer st = new StringTokenizer(url, ".");
        Vector<String> words = new Vector<>();

        while(st.hasMoreTokens()){
            words.add(st.nextToken());
        }
        String siteName = "";
        for(int i = words.size()-1; i >= 0; i--){
            if(words.get(i).length() == 2){
                continue;
            } else if(words.get(i).length() == 3){
                continue;
            }else{
                siteName = words.get(i);
                break;
            }
        }

        InputStream is = myurl.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        PrintWriter pw = new PrintWriter(new FileWriter("c:/temp/"+ siteName + ".html"), true);

        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
            pw.println(line);
        }
    }
}
