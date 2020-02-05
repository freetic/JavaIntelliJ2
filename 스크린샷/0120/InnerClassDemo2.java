/*
 * Local Inner Class
 * 1. Why?
 * 2. How to create : �����ִ� �޼ҵ尡 ����Ǿ��
 * 3. Restricted Point : 1) �޼ҵ� �ȿ����� ������. Ŭ���� ������ �����ؾ�
 *                               2) ����Ŭ�������� ����������(public, private, protected) ���Ұ�
 *                               3) static ��� �Ұ�
 *                               4) static variable, static method�� �����Ұ�
 * */
public class InnerClassDemo2 {
	public static void main(String[] args) {
		static int kor = 100;
		LocalOuterClass outer = new LocalOuterClass();
		outer.display();
	}
}
class LocalOuterClass{
	public void display() {
		int age = 50; //local variable
		class LocalInnerClass{
			private int kor = 90;
			private static int eng = 100;
			public static void print() {
				System.out.println("���� ����Ŭ������ �޼ҵ�");
			}
		}
		LocalInnerClass inner = new LocalInnerClass();
		
		
		
	}
}