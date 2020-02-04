import java.io.IOException;
import java.io.InputStream;

public class IOBasic1 {
    public static void main(String[] args) {
        // 표준 출력 : 출력buffer -> Monitor, Console, Terminal, System.out
        // 표준 입력 : Keyboard -> 입력Buffer, System.in
        InputStream is = System.in;
        System.out.println("좋아하시는 계절은? : ");
        String season = "";
        int number = 0;
        byte[] buffer = new byte[20];
        try {
            while (true) {
                number = is.read(buffer);
                if(number < 0 || (char)number == '\n') break;
            }
            season = new String(buffer, 0, number);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(season);
    }
}
