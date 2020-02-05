
public class StaticDemo2 {
	int count;            //member variable
	final int SU;       //member constant
	static int age;     //static variable
	static final String NAME;   //static constant
	public StaticDemo2() {   //Constructor
		count = 24;   
		SU = 100;
	}
	static{   //static initialization block
		age = 34;      NAME = "SALLY";
	}
	public static void main(String[] args) {
		System.out.println(age);
	}
}
