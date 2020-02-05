
public class OverrideDemo {
	public static void main(String[] args) {
		Jasik jasik = new Jasik();    jasik.display();
	}
}
class Bumo{
	void display() {  System.out.println("나는 부모 메소드");   }
}
class Jasik extends Bumo{
	void print() {    super.display();   this.display(); }
	@Override
	void display() {  System.out.println("나는 자식 메소드");   }
}
