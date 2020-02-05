public class ReturnDemo {
	public static void main(String[] args) {
		//int su = 52;
		double su1 = change(4.0, 5);   //argument 인자, 인수
		System.out.println("su1 = " + su1);
	}
	static double change(int num, int num1) {    //parameter, 매개변수
		if(num % 2 ==0) return 89.5;
		System.out.println("Hello, World");
		return 3.14;
	}
}
