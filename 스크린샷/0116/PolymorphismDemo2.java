
public class PolymorphismDemo2 {
	public static void main(String[] args) {
		Bumo bumo = new Jasik();      bumo.show();
	}
}
class Bumo{
	public void display() {  System.out.println("부모의 display()");}
	public void print() {  System.out.println("부모의 print()");}
}
class Jasik extends Bumo {
	public void show() { System.out.println("자식의 show()");  }
	@Override
	public void display() {  System.out.println("자식의 display()");}
}