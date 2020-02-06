import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
    private ServerSocket server;

    public ChatServer() {
        try {
            this.server = new ServerSocket(9999);
            System.out.println("I'm waiting . . .");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void service() {
        Socket client = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        Scanner sc = new Scanner(System.in);
        try {
            client = this.server.accept();
            System.out.println("[" + client.getInetAddress().getHostName() + "] 연결 성공.");
            br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())));
            String userId = br.readLine();
            System.out.println("[" + userId + "] 님이 방문하셨습니다.");
            while(true){
                String message = br.readLine();
                if(message.equals("bye")){
                    System.out.println("끝내자.");
                    break;
                }
                System.out.println(userId + " >> " + message);
                System.out.print("Input message to send to client : ");
                message = sc.nextLine();
                pw.println(message);
                pw.flush();
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if(this.server != null){
                System.out.println("Server is closed");
                try { this.server.close(); } catch (IOException e) { e.printStackTrace(); }
            }
        }
    }

    public static void main(String[] args) {
        new ChatServer().service();
    }

}
