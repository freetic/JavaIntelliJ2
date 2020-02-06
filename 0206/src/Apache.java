import com.sun.security.ntlm.Server;

import javax.sound.sampled.Line;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Apache {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(80);
        BufferedReader br = null;
        while(true){
            Socket client = server.accept();
//            br = new BufferedReader(new InputStreamReader(client.getInputStream()));
//            String line = null;
//            while((line = br.readLine()) != null){
//                System.out.println(line);
//            }
            File file = new File("./0206/src/index.html");
            br = new BufferedReader(new FileReader(file));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())));
            String line = null;
            while((line = br.readLine()) != null){
                pw.println(line);
                System.out.println(line);
                pw.flush();
            }
        }
    }
}
