/*
 * final method : override ����
 */
public class FinalDemo1 {
	public static void main(String[] args) {
		Bumo bumo = new Jasik();   bumo.display();
	}
}
final class Bumo{
	public void display() { System.out.println("���� �θ��� �޼ҵ�");  }
}
class Jasik extends Bumo{
	public void display() { System.out.println("���� �ڽ��� �޼ҵ�");  }
}