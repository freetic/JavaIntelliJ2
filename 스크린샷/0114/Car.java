
public class Car {
	private String name, maker;
	private int price;
	
	public Car() {}
//	public Car(String name) {}
//	public Car(int price) {}
//	public Car(String name, int price) {}
//	public Car(int price, String name) {}
	public Car(String name, String maker, int price) {
		this.name = name;
		this.maker = maker;
		this.price = price;
	}

//	public void set(String name, String maker, int price) {
//		this.name = name; 
//		this.maker = maker;
//		this.price = price;
//	}
	public void display() {
		System.out.printf("이름 = %s, 가격 = %d, 메이커 = %s\n", 
				name, this.price, this.maker);
	}
}
