import java.io.IOException;
import java.io.InputStream;

public class IOBasic {
    public static void main(String[] args) {
        // 표준 출력 : 출력buffer -> Monitor, Console, Terminal, System.out
        // 표준 입력 : Keyboard -> 입력Buffer, System.in
        InputStream is = System.in;
        System.out.println("좋아하시는 계절은? : ");
        String season = "";
        int number = 0;
        try {
            while (true) {
                number = is.read();  // Checked Exception
                if(number < 0 || (char)number == '\n') break;
                season += (char)number;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("number = " + number);
        System.out.println("season = " + season);
    }
}
