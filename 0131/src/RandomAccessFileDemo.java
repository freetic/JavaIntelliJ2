import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("C:/temp/usatoday.txt", "r");
//        while(raf.getFilePointer() < raf.length()){
//            System.out.print(raf.readChar());
//        }

//        String line = null;
//        while((line = raf.readLine()) != null){
//            System.out.println(CharUtility.entoutf8(line));
//        }
        long pos = raf.getFilePointer();
        while(pos < raf.length()){
            pos = raf.getFilePointer();
            raf.readLine();
            System.out.println(pos);
        }
    }
}