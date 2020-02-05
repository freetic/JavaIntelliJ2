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

//ǥ���Է��� �ٸ� ���Ϸ� �����Ͻÿ�.

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		System.out.println("�����ϰ� ���� ������� �Է��ϼ���. ���������� ���� 0�� ��������.");
		JFileChooser jc = new JFileChooser("C:/temp");
		int choice = jc.showSaveDialog(null);
		String path = null;
		if(choice == JFileChooser.APPROVE_OPTION) {
			path = jc.getSelectedFile().getAbsolutePath();
		}
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);  //�ѱ۰���, ���δ����� �б� ����
		
		FileOutputStream fos = new FileOutputStream(path, true);
		OutputStream os = fos;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		PrintWriter pw = new PrintWriter(osw, true);  //printf()��밡��, �ѱ۰���
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
