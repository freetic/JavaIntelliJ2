import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    private Socket socket = null;
    private PrintWriter pw = null;
    private BufferedReader br = null;
    private Scanner sc = null;

    public ChatClient() {
        try {
            this.socket = new Socket("localhost", 9999);
            this.br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));
            this.sc = new Scanner(System.in);
            System.out.print("대화명 : ");
            this.pw.println(this.sc.nextLine());
            this.pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void service(){
        try {
            while (true) {
                    System.out.print("Input message to send to server >> ");
                    String message = this.sc.nextLine();
                    if(message == null || message.equals("bye")){
                        this.pw.print("빠이~");
                        this.pw.flush();
                        break;
                }
                this.pw.println(message);    // 메세지 전송
                this.pw.flush();
                message = this.br.readLine();
                System.out.println("[Server] >> " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(this.socket != null) this.socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Connection is disconnected.");
    }

    public static void main(String[] args) {
        new ChatClient().service();
    }
}
