// 표준입력을 다른 파일로 저장하시오.
//

import javax.swing.*;
import java.io.*;

public class PrintWriterDemo{
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("저장하고 싶은 문장들을 입력하세요. 마지막에는 숫자 0을 넣으세요.");
        JFileChooser jc = new JFileChooser("C:/temp");
        int choice = jc.showSaveDialog(null);
        String path = null;
        if(choice == JFileChooser.APPROVE_OPTION){
            path = jc.getSelectedFile().getAbsolutePath();
        }
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

//        FileWriter fw = new FileWriter(path, true);
        FileOutputStream fos = new FileOutputStream(path, true);
        OutputStreamWriter os = fos;
        OutputStreamWriter osw = new OutputStreamWriter(os);
//        Writer writer = fw;
        PrintWriter pw = new PrintWriter(osw, true);
        while(true){
            String str = br.readLine();
            if(str == null || str.length() == 0) break;
        }
    }
}
