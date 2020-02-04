import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        ArrayList<Member> list = new ArrayList<>(3);
//        System.out.println("Data가 있는 파일 경로 : ");
        String path = "c://temp/addressList.txt";//new java.util.Scanner(System.in).nextLine();
        FileInputStream fis;
        byte[] buffer = new byte[512];
        int number = 0;
        String data = "";
        fis = new FileInputStream(path);
        while((number = fis.read(buffer)) > 0){
            data = new String(buffer, 0, number);
        }
        StringTokenizer st = new StringTokenizer(data, "\n");
//        System.out.println(st.countTokens());
//        System.out.println(data);
        int num = st.countTokens();
        for(int i = 0; i < num; i++){
            StringTokenizer st1 = new StringTokenizer(st.nextToken(), " ");
//            System.out.println((String)st.nextToken());
            String name = st1.nextToken().trim();
            int age = Integer.parseInt(st1.nextToken().trim());
            String email = st1.nextToken().trim();
            list.add(new Member(name, age, email));
        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
        fis.close();
    }

}
