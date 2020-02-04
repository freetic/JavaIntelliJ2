import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Name : ");
//        String name = br.readLine();
//        System.out.println("이름은 " + name);
        String path = "C:/temp/addresslist.txt";
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
}