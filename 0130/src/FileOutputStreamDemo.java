import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.jar.JarFile;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String path = null;
        JFileChooser chooser = new JFileChooser();
        int choice = chooser.showSaveDialog(null);
        if(choice == JFileChooser.APPROVE_OPTION){
            path = chooser.getSelectedFile().getAbsolutePath();
        }
        System.out.println(path);
//        String path = "C:/temp/message.dat";
//        System.out.println("저장하고 싶은 메시지를 입력하세요. 입력이 끝나면 그냥 엔터키를 누르세요.");
//        Scanner sc = new Scanner(System.in);
        String msg = path;
        try (FileOutputStream fos = new FileOutputStream(path, true)) {
            do {
//                String msg = sc.nextLine();
                if(msg == null || msg.length() == 0) break;
                byte[] buffer = msg.getBytes();
                fos.write(buffer);
                fos.write(10);
                fos.flush();
            } while(true);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
