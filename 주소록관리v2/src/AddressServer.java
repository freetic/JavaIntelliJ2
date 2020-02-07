import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

//Client로부터 1: LOAD, 2:SAVE
public class AddressServer {
	private ServerSocket server;
	private AddressServer() throws IOException {
		server = new ServerSocket(7777);
		System.out.println("I'm waiting...");
	}
	private void service() throws IOException, ClassNotFoundException{
		while(true) {
			Socket client = this.server.accept();
			process(client);
		}
	}
	//우혁시 머신
	private void process(Socket client) throws IOException, ClassNotFoundException {
		DataInputStream dis = new DataInputStream(client.getInputStream());
		switch(dis.readInt()) {
			case 1:
				/*
				 * 자신의 하드디스크에 있는 파일을 역직렬화
				 * 네트워크로 Client에게 보낼 때는 직렬화
				 */
				File readFile = new File("C:/temp/addresslist.ser");
				if(!readFile.exists())   readFile.createNewFile();
				ObjectInputStream ois = null;
				if(readFile.length() == 0)  ois = null;
				else ois = new ObjectInputStream(new FileInputStream(readFile));
				ArrayList<Person> list = null;
				if(ois == null) list = new ArrayList<Person>(1);
				else list = (ArrayList<Person>)ois.readObject();

				ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
				oos.writeObject(list);
				System.out.println("Client에게 발송 성공");    client.close();     break;

			case 2:
				/*
				 * Client로부터 역직렬화
				 * 하드디스크로 직렬화
				 */
				ObjectInputStream ois1 = new ObjectInputStream(client.getInputStream());
				ArrayList<Person> list1 = (ArrayList<Person>)ois1.readObject();

				File saveFile = new File("C:/temp/addresslist.ser");
				ObjectOutputStream oos1 = new ObjectOutputStream(
						new FileOutputStream(saveFile));
				oos1.writeObject(list1);
				System.out.println("Save Success");    client.close();
				break;
		}
	}
	public static void main(String[] args) {
		try {
			new AddressServer().service();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
