import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileInputStreamDemo1 {
    public static void main(String[] args) {
        String path = "c:/temp/addressList.txt";
        ArrayList<Member> list = getMember(path);
        print(list);
    }
    private static ArrayList<Member> getMember(String path){
        ArrayList<Member> list = new ArrayList<>(3);
        byte[] buffer = new byte[512];
        int number = 0;
        String data = "";
        try(FileInputStream fis = new FileInputStream(path)){
            number = fis.read(buffer);
            data = new String(buffer, 0, number);
            StringTokenizer stLine = new StringTokenizer(data, "\n");
            while(stLine.hasMoreTokens()){
                Scanner sc = new Scanner(stLine.nextToken()).useDelimiter("\\s+"); // 스페이스 1개 이상 정규표현식
                list.add(new Member(sc.next(), sc.nextInt(), sc.next()));
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException ex){
            ex.printStackTrace();
        }
        return list;
    }

    private static void print(ArrayList<Member> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }
}