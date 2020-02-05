public class Car {
	private String name;
	public Car(String name) {
		this.name = name;
	}
	public String getName() { return this.name;  }
	public void repair() {
		System.out.println(this.name + "가 수리됐습니다.");
	}
}
