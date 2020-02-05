
public class Car implements Comparable<Car> {
	private String name;
	private int price;
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public int compareTo(Car other) { 
		//return this.name.compareTo(other.name);
		if(this.price > other.price) return 1;    //"B" - "A" 
		else if(this.price < other.price) return -1;  //"A" - "B"
		else return 0;  //"A" - "A"
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
}
