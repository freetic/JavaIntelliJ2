
public class OverrideDemo {
	public static void main(String[] args) {
		Jasik jasik = new Jasik();    jasik.display();
	}
}
class Bumo{
	void display() {  System.out.println("���� �θ� �޼ҵ�");   }
}
class Jasik extends Bumo{
	void print() {    super.display();   this.display(); }
	@Override
	void display() {  System.out.println("���� �ڽ� �޼ҵ�");   }
}
