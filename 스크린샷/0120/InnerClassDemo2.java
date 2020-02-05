/*
 * Local Inner Class
 * 1. Why?
 * 2. How to create : 속해있는 메소드가 실행되어야
 * 3. Restricted Point : 1) 메소드 안에서는 절차적. 클래스 선언후 생성해야
 *                               2) 지역클래스에는 접근제한자(public, private, protected) 사용불가
 *                               3) static 사용 불가
 *                               4) static variable, static method를 소유불가
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
				System.out.println("나는 지역클래스의 메소드");
			}
		}
		LocalInnerClass inner = new LocalInnerClass();
		
		
		
	}
}