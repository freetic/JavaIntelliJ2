/*
 * String --> byte array  : String class�� getBytes()   
 * byte array --> String  : String ������, new String(byte [] buffer, int off, int length)
 */

import java.io.IOException;
import java.io.OutputStream;

public class IOBasic3 {
	public static void main(String[] args) {
		OutputStream os = System.out;
		String str = "�� ���� �԰� �ٴϴ�?";
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
