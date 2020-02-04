import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.*;

public class FilterStreamDemo {
        public static void main(String[] args) throws IOException {
//        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.dat"));
//        dos.writeInt(90);
//        dos.writeDouble(95.5);
//        dos.writeBoolean(true);
//        dos.writeChar(65);
//        dos.writeUTF("Hello");
//        dos.writeUTF("안녕하세요");
//        System.out.println("hwefw sfsdf sd");
        DataInputStream dis =
            new DataInputStream(new FileInputStream("data.dat"));
            System.out.printf("%d\n", dis.readInt());
            System.out.printf("%.1f\n", dis.readDouble());
            System.out.printf("%b\n", dis.readBoolean());
            System.out.printf("%c\n", dis.readChar());
            System.out.printf("%s\n", dis.readUTF());
            System.out.printf("%s\n", dis.readUTF());
    }

}
