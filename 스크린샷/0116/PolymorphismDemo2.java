
public class PolymorphismDemo2 {
	public static void main(String[] args) {
		Bumo bumo = new Jasik();      bumo.show();
	}
}
class Bumo{
	public void display() {  System.out.println("�θ��� display()");}
	public void print() {  System.out.println("�θ��� print()");}
}
class Jasik extends Bumo {
	public void show() { System.out.println("�ڽ��� show()");  }
	@Override
	public void display() {  System.out.println("�ڽ��� display()");}
}