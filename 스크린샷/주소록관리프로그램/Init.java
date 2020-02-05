import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Init {    //정수형 : 0, 실수형 : 0.0, boolean : false, char : 널값, null
	private ObjectInputStream ois;
	
	public Init(String path) {
		File file = new File(path);
		try {
			if(file.exists()) {  //파일이 있다면 역직렬화 수행, 이미 한번 이상 사용했다면
				this.ois = new ObjectInputStream(new FileInputStream(file));
			}else {  //파일이 없다면, 프로그램을 처음 사용하니까
				file.createNewFile();
				this.ois = null;
			}
		}catch(EOFException ex) {   //역직렬화할 때, 데이터가 없다면 null / -1이 아니라, EOF 발생
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
