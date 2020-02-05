import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Output {
	private Vector<Student> vector;
	private ObjectOutputStream oos;
	
	public Output(Vector<Student> vector, String path) {
		this.vector = vector;
		try {
			this.oos = new ObjectOutputStream(new FileOutputStream(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void output() {
		//this.printLabel();
		try {
			this.oos.writeObject(this.vector);
			System.out.println("Save Success.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //직렬화
	}
	private void printLabel() {
		System.out.println("            <<쌍용고등학교 성적관리프로그램>>");
		System.out.println("학번    이름    국어    영어    수학   총점   평균    평점");
		System.out.println("------------------------------------------------");
	}
}
