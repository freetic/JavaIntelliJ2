import java.util.Collections;
import java.util.Stack;

public class GenericDemo1 {
	public static void main(String[] args) {
		//Stack stack = new Stack();
		//stack.push(5);
		//stack.push(89.5);
		//stack.push("Hello");
		//int num = (Integer)stack.pop();
		//System.out.println(num);
		Stack<Car> stack = new Stack<Car>();
		stack.push(new Car("소나타", 25_000_000));
		stack.push(new Car("카니발", 30_000_000));
		stack.push(new Car("마티즈", 15_000_000));
		stack.push(new Car("Bentz", 125_000_000));
	
		System.out.println(stack.pop());
		Collections.sort(stack); 
		System.out.println(stack.pop());
	}
}
