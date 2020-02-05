import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf = new RandomAccessFile("C:/temp/usatoday.txt", "r");
		
//		String line = null;
//		while((line = raf.readLine()) != null) {
//			System.out.println(CharUtility.entoutf8(line));
//		}
		long pos = raf.getFilePointer();  //0
		while(pos < raf.length()) {
			System.out.println(raf.readLine());
			pos = raf.getFilePointer();
		}
		
	}
}
