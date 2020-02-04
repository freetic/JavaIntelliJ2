import java.io.IOException;
import java.io.InputStream;

public class NAA {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        int temp = 0;
        String name = "";
        String age = "";
        String address = "";
        byte[] buffer = new byte[100];

        System.out.println("Name : ");
        while(true){
            temp = is.read();
            if(temp < 0 || (char)temp == '\n') break;
            name += (char)temp;
        }
        System.out.println("Age : ");
        while(true){
            temp = is.read();
            if(temp < 0 || (char)temp == '\n') break;
            age += (char)temp;
        }
        System.out.println("Address : ");
        while(true){
            temp = is.read();
            if(temp < 0 || (char)temp == '\n') break;
            address += (char)temp;
        }
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
    }
    static String input(){
        return null;
    }
}
