
public class Lion extends Mammal{
	String name = "������";
	public void display() {
		System.out.println(this.name);
		System.out.println(super.name);
	}
}

class Mammal extends Object{
	int name = 90;
}