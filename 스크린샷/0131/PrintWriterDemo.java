import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

import javax.swing.JFileChooser;

//표준입력을 다른 파일로 저장하시오.

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("저장하고 싶은 문장들을 입력하세요. 마지막에는 숫자 0을 넣으세요.");
		JFileChooser jc = new JFileChooser("C:/temp");
		int choice = jc.showSaveDialog(null);
		String path = null;
		if(choice == JFileChooser.APPROVE_OPTION) {
			path = jc.getSelectedFile().getAbsolutePath();
		}
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);  //한글가능, 라인단위로 읽기 가능
		
		FileOutputStream fos = new FileOutputStream(path, true);
		OutputStream os = fos;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		PrintWriter pw = new PrintWriter(osw, true);  //printf()사용가능, 한글가능
		while(true) {
			String str = br.readLine();
			if(str.equals("0")) break;
			pw.printf("%s\n", str);
		}
		System.out.println("Save Success");
		br.close();      isr.close();     is.close();
		pw.close();    osw.close();    os.close();   fos.close();
	}
}
