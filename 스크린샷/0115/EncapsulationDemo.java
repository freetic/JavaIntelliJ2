
public class EncapsulationDemo {
	public static void main(String[] args) {
		Car sonata = new Car("소나타", 25_000_000);
	}
}
class Car{
	private String name;
	private int price = 500;
	{   //Instance Initialization Block
		this.name = "자동차";   this.price = 1000;
		System.out.println("기본값으로 설정됐습니다.");
	}
	public Car(String name, int price) {
		this.name = name;    this.price = price;
		System.out.println("방금 객체가 생성됐습니다.");
	}
	protected void finalize() {
		System.out.println("방금 소멸됐습니다.");
	}
}