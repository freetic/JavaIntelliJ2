public class ConstructorDemo {
	public static void main(String[] args) {
		Product ballpen = new Product();
		ballpen = null;
		System.gc();
	}
}
class Product{
	String name;
	int price;
	String maker;
	Product(){   //constructor
		System.out.println("¹æ±Ý °´Ã¼°¡ »ý¼ºµÆ½À´Ï´Ù.");
	}
	protected void finalize() {
		System.out.println("¹æ±Ý °´Ã¼°¡ ¼Ò¸êµÆ½À´Ï´Ù.");
	}
}