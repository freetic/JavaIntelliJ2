import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo1 {
    public static void main(String[] args) throws IOException {
        String path = "C:/temp/student.ser";
        Student chulsu = new Student("2019-01", "김철수", 56, 78, 90);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(chulsu);;
        System.out.println("Save Success.");;
        oos.close();
    }
}
