/*
 * Anonymous Inner Class
 * 1. Why?   : 일회용/ 특정클래스의 멤버메소드 재정의
 * 2. How to create : 속해있는 메소드가 호출받을 때
 * 3. Restricted Point
 */
public class InnerClassDemo3 {
	public static void main(String[] args) {
		Employee jimin = new Employee() {
			@Override
			public void display() {
				System.out.println("나는 자식 메소드");
			}
		};
		jimin.display();   jimin.print();
	}
}
class Employee{
	public void print() { System.out.println("나는 다른 메소드");  }
	public void display() {
		System.out.println("나는 부모 메소드");
	}
}