import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

/*
 * ArrayList<Person>을 Server로 직렬화
 */
public class Save {
	private ArrayList<Person> list;
	private ObjectOutputStream oos;
	private Socket client;

	public Save(ArrayList<Person> list) {
		this.list = list;
		try {
			this.client = new Socket("localhost", 7777);
			DataOutputStream dos = new DataOutputStream(this.client.getOutputStream());
			dos.writeInt(2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void save() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					this.client.getOutputStream());
			oos.writeObject(this.list);
			oos.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
