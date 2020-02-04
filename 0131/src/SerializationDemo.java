import java.io.*;
import java.util.Date;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Date now = new Date();
//        FileOutputStream fos = new FileOutputStream("C:/temp/date.ser");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(now);
//        System.out.println("Save Success.");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/temp/date.ser"));
        Object obj = ois.readObject();
        if(obj instanceof Date){
            Date before = (Date)obj;
            System.out.println(before);
        }
        ois.close();
    }
}
