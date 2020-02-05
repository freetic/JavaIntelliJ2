/*
 * Instance Inner Class
 * 1. Why? : �������� �δ�(�ǹ�)���� ���߻���Ϸ��� 
 * 2. How to create : �ٱ� Ŭ������ �ּҸ� ���ؼ� ����.
 * 3. Restricted Point : static ����, static method�� ���� �� ����.
 */
public class InnerClassDemo {
	public static void main(String[] args) {
		InstanceOuter outer = new InstanceOuter();
		int age = outer.age;
		InstanceOuter.InstanceInner inner = outer.new InstanceInner();
		inner.display();
	}
}
class InstanceOuter extends Car{
	int age = 24;   //�ٱ�Ŭ������ �������
	static int kor = 100;   //�ٱ�Ŭ������ ����ƽ����
	class InstanceInner extends Sonata{
		int eng = 90;     //���� Ŭ������ �������
		//static int mat = 70;
		public InstanceInner() {   //���� Ŭ������ ������
			System.out.println("���� Ŭ������ ��� �����ƽ��ϴ�.");
		}
		public void display() {
			System.out.println(bgcolor);
		}
	}
}
class Car{
	int price = 25_000_000;   //Car Ŭ������ �������
}
class Sonata{
	String bgcolor = "Silver";  
}







