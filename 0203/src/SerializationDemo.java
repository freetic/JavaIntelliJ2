import java.io.*;
import java.util.ArrayList;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Product> list = new ArrayList<>();
        Product ballpen = new Product("모나미볼펜", 300);
        Product keyboard = new Product("키보드", 15000);
        list.add(ballpen);
        list.add(keyboard);

        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("C:/temp/list.ser")
        );
        oos.writeObject(list);
        System.out.println("Save Success");
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("C:/temp/list.ser")
        );
        Object obj = ois.readObject();
//        ArrayList<Product> list = (ArrayList<Product>)obj;
//        for(Product p : list){
//            System.out.println(p);
//        }
//        ois.close();
    }
}
