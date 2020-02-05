
public class VariableArgumentDemo {
	public static void main(String[] args) {
		display('A', 89.5, true, 34);
	}
	static void display(Object ... array) {
		for(Object su : array)   System.out.print(su + "\t");
	}
}
