import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;

public class Init {
	private ObjectInputStream ois;
	private Socket socket;
	private ArrayList<Person> list;

	public Init() {
		DataOutputStream dos = null;
		try {
			this.socket = new Socket("211.63.89.154", 7777);
			dos = new DataOutputStream(this.socket.getOutputStream());
			dos.writeInt(1);
			/*
			 * Server로부터 들어오는 ArrayList<Person>를 역직렬화
			 */
			ObjectInputStream ois = new ObjectInputStream(this.socket.getInputStream());
			this.list = (ArrayList<Person>)ois.readObject();
			//System.out.println(list.size());
		}catch(IOException ex) {
			ex.printStackTrace();
		}catch(ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}
	public ArrayList<Person> init() {
		return this.list;
	}
}
