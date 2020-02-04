import java.io.IOException;
import java.io.RandomAccessFile;

public class Mmmm {
    public static void main(String[] args) throws IOException {
        String path = "C:/temp/sungjuk_utf8.csv";
        RandomAccessFile raf =new RandomAccessFile(path, "rw");
        long pos = raf.getFilePointer();
        while(pos < raf.length()) {
            pos = raf.getFilePointer();
            System.out.println(raf.readLine());
        }
//        System.out.println(raf.readLine());
//        System.out.println(raf.readLine());
//        System.out.println(raf.readLine());
//        System.out.println(raf.readLine());
    }
}
