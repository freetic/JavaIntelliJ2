/*
 * static Inner Class
 * 1. Why?  : Packaging
 * 2. How to create : �ٱ� Ŭ������ �ּҰ� �ʿ����� �ʴ�.
 * 3. Restricted Point : �ٱ� Ŭ������ ��������� ����޼ҵ� ���� �Ұ�
 */
public class InnerClassDemo1 {
	public static void main(String[] args) {
		int age = StaticOuter.age;
		StaticOuter.StaticInner inner = new StaticOuter.StaticInner();
	}
}
class StaticOuter{
	static int age = 24;
	int kor = 100;
	static class StaticInner{
		int eng = 100;
		static int mat = 100;
		public StaticInner() { System.out.println("��� ����ƽ ��ü�� �����ƽ��ϴ�.");  }
		public void display() {
			System.out.println(mat);
		}
	}
}







