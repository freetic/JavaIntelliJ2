import java.io.IOException;
import java.io.OutputStream;

/**
 * String --> byte array : String class의 getBytes()
 * byte array --> String : String 생성자, new String(byte[] buffer, int off, int length)
 */

public class IOBasic3 {
    public static void main(String[] args) {
        OutputStream os = System.out;
//        String str = "why so serious";
//        byte[] buffer = str.getBytes();
//        for(int i = 0; i < buffer.length; i++)
//            System.out.print(buffer[i] + ", ");
        try {
            os.write(65);
            os.flush();     // 버퍼는 flush로 방출해줘야 한다.
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
