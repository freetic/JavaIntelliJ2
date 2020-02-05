import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo1 {
	public static void main(String[] args) throws IOException{
		String path = "C:/temp/raf.txt";
		RandomAccessFile raf = new RandomAccessFile(path, "rw");
		raf.writeBoolean(true);
		raf.writeInt(90);
		raf.writeDouble(89.5);
		raf.writeUTF("Hello");
		raf.writeUTF("æ»≥Á«œººø‰");
		raf.seek((long)0);
		System.out.printf("%b\n", raf.readBoolean());
		System.out.printf("%d\n", raf.readInt());
		System.out.printf("%.1f\n", raf.readDouble());
		System.out.printf("%s\n", raf.readUTF());
		System.out.printf("%s\n", raf.readUTF());
	}
}
