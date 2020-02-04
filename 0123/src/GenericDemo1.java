import java.util.Collections;
import java.util.Stack;

public class GenericDemo1 {
    public static void main(String[] args) {
        Stack<Car> stack = new Stack<>();
        stack.push(new Car("소나타", 25_000_000));
        stack.push(new Car("카니발", 35_000_000));
        stack.push(new Car("제네시스", 75_000_000));
        stack.push(new Car("Bentz", 125_000_000));

        Collections.sort(stack);
        int n = stack.size();
        for(int i = 0; i < n; i++){
            System.out.println(stack.pop());
        }

    }
}
