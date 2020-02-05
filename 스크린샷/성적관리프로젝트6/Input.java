import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Input {
	private Scanner scan;
	private Vector<Student> vector;
	private FileInputStream fis;
	
	public Input(Vector<Student> vector) {   //Constructor
		this.scan = new Scanner(System.in);
		this.vector = vector;
		try {
			this.fis = new FileInputStream("C:/temp/sungjuk.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
	
	public void input() {
		try {
			byte [] buffer = new byte[this.fis.available()];
			int number = this.fis.read(buffer);
			String str = new String(buffer, 0, number);
			StringTokenizer st = new StringTokenizer(str, "\n");
			String [] array = new String[st.countTokens()];
			for(int i = 0 ; i < array.length ; i++) {
				Student student = new 
				this.vector.addElement(student);
			}
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}



