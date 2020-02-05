import java.util.Stack;

public class GenericDemo {
	public static void main(String[] args) {
//		Test<Integer> t = 
//				new Test<Integer>(5);
//		Test<String> t1 = 
//				new Test<String>("Hello");
		
		Stack<String> stack = new Stack<String>();
		Stack<Object> obj = new Stack<Object>();
		Stack<Integer> in = new Stack<Integer>();
		//Stack<? extends Number> wild = stack;
		Stack<? extends Number> wild = in;
		//Object o = new String();
		//obj = stack;
	}
}
