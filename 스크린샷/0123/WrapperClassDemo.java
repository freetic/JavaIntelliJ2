public class WrapperClassDemo {
	public static void main(String[] args) {
		int age = 24;    //���� ���� stack�� ����
		//Integer in = new Integer(age);  //wrapping, boxing
		
		//int number = in.intValue();        //unwrapping, unboxing
		//System.out.println("number = " + number);
		
		Integer in = age + 100;    //new Integer(24 + 100);  autoboxing
		int number = in;             //in.intValue();                  autounboxing
		System.out.println("number = " + number);
	}
}
