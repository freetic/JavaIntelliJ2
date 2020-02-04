import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Input {
    Vector<Product> products;
    FileInputStream fis;

    public Input(Vector<Product> products) {
        this.products = products;
        try {
            fis = new FileInputStream("C:/temp/productdata.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void input(){
        try {
            byte[] buffer = new byte[fis.available()];
            int number = 0;
            number = fis.read(buffer);
            String data = new String(buffer, 0, number);

            StringTokenizer st = new StringTokenizer(data, "\n");

            while(st.hasMoreTokens()){

                Scanner sc = new Scanner(st.nextToken()).useDelimiter("\\s+");

                products.add(new Product(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
