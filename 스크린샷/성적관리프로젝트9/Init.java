/*
 * ���α׷��� ó�� ����Ǹ� C:/temp/sungjuklist.ser ������ ���� ������ �� ������ �����Ѵ�.
 * ���� �ִٸ� EOFException�� �߻��ϰų� ���������� ������ȭ�� �ϰų� �Ѵ�.
 */

/*
 * ����ȭ���� EOFException�� �߻��ϴ� ������ ��ü�� ���� �� null�̳� -1�� return ���� �ʰ�
 * ����ȭ������ EOFException�� �߻��Ѵ�.
 * ó����� : 1)writeObject() �� �����ϰų� 2)writeObject()�� ���� �������� null�� �ϰų�
 *             3)EOFException�� �߻���Ű�� �ȴ�.
 */


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

public class Init {
	private ObjectInputStream ois;
	
	public Init(String path) {
		File file = new File(path);
		try {
			if(file.exists()) {  //�ش� ������ �ִٸ�, �ѹ��̶� ������ ���α׷��� �����ߴٸ�
				this.ois = new ObjectInputStream(new FileInputStream(file));
			}else {  //������ ���ٸ� --> ó�� ���α׷��� �����ߴٸ�
				file.createNewFile();
			}
		}catch(EOFException ex) {  //������ ������ ����ִٸ�
			this.ois = null;
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
	
	public Vector<Student> init(){
		Object obj = null;
		try {
			if(this.ois != null)	obj = this.ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(ois != null && obj != null) {
			return (Vector<Student>)obj;
		}else {
			return new Vector<Student>(1,1);
		}
	}
}




