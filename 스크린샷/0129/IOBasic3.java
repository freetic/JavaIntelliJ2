/*
 * String --> byte array  : String class의 getBytes()   
 * byte array --> String  : String 생성자, new String(byte [] buffer, int off, int length)
 */

import java.io.IOException;
import java.io.OutputStream;

public class IOBasic3 {
	public static void main(String[] args) {
		OutputStream os = System.out;
		String str = "너 밥은 먹고 다니니?";
		byte [] buffer = str.getBytes();
		//for(int i = 0 ; i < buffer.length ; i++)
		//	System.out.print(buffer[i] + ", ");
		try {
			//os.write(65);
			os.write(buffer);
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
