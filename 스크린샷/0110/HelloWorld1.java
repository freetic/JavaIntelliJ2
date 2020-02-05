/*
 * Variable : Local, Static, Instance
 */
public class HelloWorld1 {
	//Member variable(Instance variable)은 주소로 접근한다.
	String msg = "Hello, World";   //member variable
	public static void main(String[] args) {
		HelloWorld1 hw = new HelloWorld1();  
		System.out.println(hw.msg);
	}
}
