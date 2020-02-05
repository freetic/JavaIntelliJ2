
public class HelloWorld3 {
	public static void main(String[] args) {
		//Test  t = new Test();   System.out.println(t.msg);
		System.out.println(new Test().msg);
	}
}
class Test{
	String msg = "Hello, World";  //member variable
}