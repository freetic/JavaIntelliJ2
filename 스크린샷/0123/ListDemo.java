import java.util.Vector;

public class ListDemo {
	public static void main(String[] args) {
//		Queue<String> queue = new LinkedList<String>();
//		String [] array = {"и雖團", "梯雖團", "夢雖團", "梯雖團", "и雖團"};
//		for(String str : array)  queue.offer(str);
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
		//LinkedList<Object> obj = new LinkedList<String>();
		
//		ArrayList<String> list = new ArrayList<String>();
//		String [] array = {"и雖團", "梯雖團", "夢雖團", "梯雖團", "и雖團"};
//		for(String str : array)  list.add(str);
//		System.out.println(list.get(2));
		
		Vector<String> vector = new Vector<String>(5,3);
		String [] array = {"и雖團", "梯雖團", "夢雖團", "梯雖團", "и雖團"};
		for(String str : array)  vector.add(str);
		System.out.println("capacity = " + vector.capacity());
		System.out.println("size = " + vector.size());
		vector.add("檜雖團");
		System.out.println("capacity = " + vector.capacity());
		System.out.println("size = " + vector.size());
		
	}
}
