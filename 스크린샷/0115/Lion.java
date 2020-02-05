
public class Lion extends Mammal{
	String name = "วัม๖นฮ";
	public void display() {
		System.out.println(this.name);
		System.out.println(super.name);
	}
}

class Mammal extends Object{
	int name = 90;
}