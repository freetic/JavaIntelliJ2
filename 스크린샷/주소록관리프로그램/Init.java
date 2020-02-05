import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Init {    //������ : 0, �Ǽ��� : 0.0, boolean : false, char : �ΰ�, null
	private ObjectInputStream ois;
	
	public Init(String path) {
		File file = new File(path);
		try {
			if(file.exists()) {  //������ �ִٸ� ������ȭ ����, �̹� �ѹ� �̻� ����ߴٸ�
				this.ois = new ObjectInputStream(new FileInputStream(file));
			}else {  //������ ���ٸ�, ���α׷��� ó�� ����ϴϱ�
				file.createNewFile();
				this.ois = null;
			}
		}catch(EOFException ex) {   //������ȭ�� ��, �����Ͱ� ���ٸ� null / -1�� �ƴ϶�, EOF �߻�
			this.ois = null;
		}catch(IOException ex) {
			System.out.println(ex);
		}
		
	}
	public ArrayList<Person> init() {
		ArrayList<Person> list = null;
		try {
			if(this.ois != null) {
				list = (ArrayList<Person>)this.ois.readObject();
			}
		}catch(ClassNotFoundException | IOException ex) {
			System.out.println(ex);
		}
		if(list == null) list = new ArrayList<Person>(1);
		return list;
	}
}
