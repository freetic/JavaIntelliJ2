import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		String path = "C:/temp/addresslist.txt";
		ArrayList<Member> list = getMember(path);
		System.out.println(list.get(2));
	}
	private static ArrayList<Member> getMember(String path){
		ArrayList<Member> list = null;
		try(FileInputStream fis = new FileInputStream(path)) {
			byte [] buffer = new byte[512];
			int number = fis.read(buffer);
			String str = new String(buffer, 0, number);
			StringTokenizer st = new StringTokenizer(str, "\n");
			String [] array = new String[st.countTokens()];
			list = new ArrayList<Member>(3);
			for(int i = 0 ; i < array.length ; i++) {
				array[i] = st.nextToken();  //array[0] = ÇÑÁö¹Î     24     aaa@aaa.com
				Scanner scan = new Scanner(array[i]).useDelimiter("\\s+");
				Member member = new Member(scan.next(), scan.nextInt(), scan.next());
				list.add(member);
			}
		} catch (FileNotFoundException ex) {
			System.out.println("File Not Found");
		} catch(IOException ex) {
			System.out.println(ex);
		}
		return list;
	}
}
