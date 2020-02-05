
public class CallByReference {
	public static void main(String[] args) {
		Test t = new Test();        t.original = 500;
		System.out.println("Before call t.original = " + t.original);
		CallByReference cbr = new CallByReference();
		cbr.change(t);     //Call by Reference
		System.out.println("After call t.original = " + t.original);
	}
	void change(Test num) {  //Test num = t;
		num.original *= 100;
		System.out.println("in change() num.original = " + num.original);
	}
}
class Test{
	int original;    //member variable
}