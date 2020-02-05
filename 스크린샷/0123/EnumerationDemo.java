import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EnumerationDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String [] array = {"и雖團", "梯雖團", "夢雖團", "檜雖團", "�姦鶾�"};
		for(String str : array)  stack.push(str);
		Enumeration<String> enums = stack.elements();
		while(enums.hasMoreElements()) System.out.println(enums.nextElement());
		System.out.println("-----------");
		Queue<String> queue = new LinkedList<String>();
		for(String str : array)  queue.offer(str);
		Iterator<String> iters = queue.iterator();
		while(iters.hasNext()) System.out.println(iters.next());
	}
}
