import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

public class Output {
	private Vector<Student> vector;
	
	public Output(Vector<Student> vector) {
		this.vector = vector;
	}
	
	public void output() {
		this.printLabel();
		for(Student s : this.vector) {
			System.out.println(s.toString());
		}
	}
	private void printLabel() {
		System.out.println("                <<쌍용고등학교 성적관리프로그램>>");
		System.out.println("학번    이름    국어    영어    수학   총점   평균    평점");
		System.out.println("------------------------------------------------");
	}
}
