/*
 * Anonymous Inner Class
 * 1. Why?   : ��ȸ��/ Ư��Ŭ������ ����޼ҵ� ������
 * 2. How to create : �����ִ� �޼ҵ尡 ȣ����� ��
 * 3. Restricted Point
 */
public class InnerClassDemo3 {
	public static void main(String[] args) {
		Employee jimin = new Employee() {
			@Override
			public void display() {
				System.out.println("���� �ڽ� �޼ҵ�");
			}
		};
		jimin.display();   jimin.print();
	}
}
class Employee{
	public void print() { System.out.println("���� �ٸ� �޼ҵ�");  }
	public void display() {
		System.out.println("���� �θ� �޼ҵ�");
	}
}