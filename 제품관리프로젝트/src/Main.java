import java.util.Collections;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Product> products = new Vector<>(5);
        Input input = new Input(products);
        input.input();
        Calc calc = new Calc(products);
        calc.calc();
        sort(products);
        Output output = new Output(products);
        output.output();
    }
    private static void sort(Vector<Product> products){
        Collections.sort(products);
    }
}
