
public class EncapsulationDemo {
	public static void main(String[] args) {
		Car sonata = new Car("�ҳ�Ÿ", 25_000_000);
	}
}
class Car{
	private String name;
	private int price = 500;
	{   //Instance Initialization Block
		this.name = "�ڵ���";   this.price = 1000;
		System.out.println("�⺻������ �����ƽ��ϴ�.");
	}
	public Car(String name, int price) {
		this.name = name;    this.price = price;
		System.out.println("��� ��ü�� �����ƽ��ϴ�.");
	}
	protected void finalize() {
		System.out.println("��� �Ҹ�ƽ��ϴ�.");
	}
}