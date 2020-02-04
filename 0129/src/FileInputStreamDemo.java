import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
// 한글
//"0129\\src\\FileInputStreamDemo.java"

public class FileInputStreamDemo {
    public static void main(String[] args) {
//        File file = new File(".");
//        System.out.println(file.getAbsoluteFile());
        System.out.println("읽고 싶은 파일의 이름은? : ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        FileInputStream fis = null;
        int number = 0;
        byte[] buffer = new byte[512];
        try {
            fis = new FileInputStream(path);
            while((number = fis.read(buffer)) > 0){
                String str = new String(buffer, 0, number);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
