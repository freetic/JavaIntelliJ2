/*
 * final method : override 금지
 */
public class FinalDemo1 {
	public static void main(String[] args) {
		Bumo bumo = new Jasik();   bumo.display();
	}
}
final class Bumo{
	public void display() { System.out.println("나는 부모의 메소드");  }
}
class Jasik extends Bumo{
	public void display() { System.out.println("나는 자식의 메소드");  }
}