/*
 * 프로그램이 처음 실행되면 C:/temp/sungjuklist.ser 파일이 없기 때문에 새 파일을 생성한다.
 * 만일 있다면 EOFException이 발생하거나 정상적으로 역직렬화를 하거나 한다.
 */

/*
 * 직렬화에서 EOFException이 발생하는 이유는 객체가 없을 때 null이나 -1을 return 하지 않고
 * 직렬화에서는 EOFException을 발생한다.
 * 처리방법 : 1)writeObject() 를 먼저하거나 2)writeObject()의 제일 마지막에 null을 하거나
 *             3)EOFException을 발생시키면 된다.
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
			if(file.exists()) {  //해당 파일이 있다면, 한번이라도 이전에 프로그램을 실행했다면
				this.ois = new ObjectInputStream(new FileInputStream(file));
			}else {  //파일이 없다면 --> 처음 프로그램을 실행했다면
				file.createNewFile();
			}
		}catch(EOFException ex) {  //파일은 있지만 비어있다면
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




