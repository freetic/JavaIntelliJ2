public class CallByValue {
	public static void main(String[] args) {
		int original = 500;
		System.out.println("Before call");
		System.out.println("original = " + original);
		CallByValue cbv = new CallByValue();
		original = cbv.change(original);
		System.out.println("After call");
		System.out.println("original = " + original);
	}
	int change(int num) {  //int num = original
		num *= 100;
		System.out.println("in change() num = " + num);
		return num;   //50000
	}
}
