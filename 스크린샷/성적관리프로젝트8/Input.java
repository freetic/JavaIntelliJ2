import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.Vector;

public class Input {
	private Vector<Student> vector;
	private RandomAccessFile raf;
	
	public Input(Vector<Student> vector) {   //Constructor
		this.vector = vector;
		try {
			this.raf = new RandomAccessFile("sungjuk_utf8.csv", "r");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
	
	public void input() {
		String line = null;
		try {
			while((line = this.raf.readLine()) != null) {//1101,     «—º€¿Ã,     78,     87,     83,     78
				String str = CharUtility.entoutf8(line);
				Scanner scan = new Scanner(str).useDelimiter(",\\s+");
				Student student = new Student(scan.next(), scan.next(), 
						scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
				this.vector.addElement(student);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}



