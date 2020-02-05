import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
//한글이 잘 될까요?
public class FileInputStreamDemo {
	public static void main(String[] args) {
		//File file = new File(".");
		//System.out.println(file.getAbsolutePath());
		System.out.print("읽고 싶은 파일의 이름은 ? : ");
		Scanner scan = new Scanner(System.in);
		String path = scan.nextLine();
		FileInputStream fis = null;
		int number = 0;
		byte [] buffer = new byte[512];
		try {
			fis = new FileInputStream(path);
			while((number = fis.read(buffer)) > 0){
				String str = new String(buffer, 0, number);
				System.out.print(str);
			}
		}catch(FileNotFoundException ex) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
