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
		System.out.println("��� ��ü�� �����ƽ��ϴ�.");
	}
	protected void finalize() {
		System.out.println("��� ��ü�� �Ҹ�ƽ��ϴ�.");
	}
}