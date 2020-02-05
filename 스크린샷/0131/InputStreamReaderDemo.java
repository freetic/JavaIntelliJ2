import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//InputStream --> Reader
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
//		Reader reader = isr;
//		BufferedReader br = new BufferedReader(reader);
//		System.out.print("Name : ");  
//		String name = br.readLine();
//		System.out.println("name = " + name);
		String path = "C:/temp/addresslist.txt";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
