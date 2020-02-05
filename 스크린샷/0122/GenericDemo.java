
public class GenericDemo {
	public static void main(String[] args) {
		Test<Integer> t = new Test<Integer>(5);
		System.out.printf("%d\n", t.getValue());
		
		Test<Double> t1 = new Test<Double>(89.5);
		System.out.printf("%.1f\n",  t1.getValue());
		
		Test<String> t2 = new Test<String>("Hello");
		System.out.printf("%s\n",  t2.getValue());
		//t2.setValue(5);
		/*
		 * Object [] array = {new java.util.Scanner(System.in), new String("Hello"), 5,
		 * 89.5, Math.PI}; System.out.printf("%d\n", array[0]);
		 */
		
		
	}
}
