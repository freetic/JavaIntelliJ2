/*
 * static Inner Class
 * 1. Why?  : Packaging
 * 2. How to create : 바깥 클래스의 주소가 필요하지 않다.
 * 3. Restricted Point : 바깥 클래스의 멤버변수와 멤버메소드 접근 불가
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
		public StaticInner() { System.out.println("방금 스택틱 객체가 생성됐습니다.");  }
		public void display() {
			System.out.println(mat);
		}
	}
}







