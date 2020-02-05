public class AbstractClassDemo {
	public static void main(String[] args) {
		Birds buz = new Sparow();     buz.display();
	}
}
abstract class Birds{
	int numOfWings = 2;
	public abstract void display();
}
class Sparow extends Birds{
	public void display() {
		System.out.println("자식에서 구현했음.");
	}
}