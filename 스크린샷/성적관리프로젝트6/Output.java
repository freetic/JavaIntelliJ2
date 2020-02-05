import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

public class Output {
	private Vector<Student> vector;
	private FileOutputStream fos;
	
	public Output(Vector<Student> vector) {
		this.vector = vector;
		try {
			this.fos = new FileOutputStream("C:/temp/result.txt", true);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
	
	public void output() {
		try {
			this.printLabel();
			for(Student s : this.vector) {
				this.fos.write(s.toString().getBytes("UTF-8"));
				this.fos.write(10);
			}
			this.fos.flush();
			System.out.println("File Save Success.");
		}catch(IOException ex) {
			System.out.println(ex);
		}finally {
			try {
				this.fos.close();
			}catch(IOException ex) {}
		}
	}
	//학생결과데이터를 저장할 파일의 경로는 C:/temp/result.txt
	private void printLabel() throws IOException {
		this.fos.write("                <<쌍용고등학교 성적관리프로그램>>".getBytes("UTF-8"));
		this.fos.write(10);
		this.fos.write("학번    이름    국어    영어    수학   총점   평균    평점".getBytes("UTF-8"));
		this.fos.write(10);
		this.fos.write("------------------------------------------------".getBytes("UTF-8"));
		this.fos.write(10);
		this.fos.flush();
	}
}
