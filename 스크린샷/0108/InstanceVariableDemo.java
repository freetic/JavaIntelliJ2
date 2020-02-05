
public class InstanceVariableDemo {
	static int kor = 90;    //static variable/class variable
	int eng = 100;   //member variable/instance variable
	public static void main(String[] args) {
		int age = 24;  //local variable
		System.out.println("age = " +  age);
		System.out.println("kor = " + InstanceVariableDemo.kor);
		InstanceVariableDemo ivd = new InstanceVariableDemo();
		System.out.println("eng = " + ivd.eng);
	}
}
