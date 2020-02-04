import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Vector;

public class Output {
    Vector<Product> products;

    public Output(Vector<Product> products) {
        this.products = products;
    }
    public void output() {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/temp/productresult.txt"))) {
            ps.println("            <<상품별 판매 이익금 및 이익율표>>");
            ps.println("-----------------------------------------------------------");
            ps.printf("상품명\t수량\t판매단가\t매입단가\t운송료\t이익금\t이익율\n");
            ps.println("-----------------------------------------------------------");
            for(int i = 0; i < products.size(); i++){
                ps.println(products.get(i));
            }
            ps.flush();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
