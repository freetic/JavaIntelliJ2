/*
 * Instance Inner Class
 * 1. Why? : 재정의의 부담(의무)없이 다중상속하려고 
 * 2. How to create : 바깥 클래스의 주소를 통해서 생성.
 * 3. Restricted Point : static 변수, static method를 가질 수 없다.
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
	int age = 24;   //바깥클래스의 멤버변수
	static int kor = 100;   //바깥클래스의 스태틱변수
	class InstanceInner extends Sonata{
		int eng = 90;     //안쪽 클래스의 멤버변수
		//static int mat = 70;
		public InstanceInner() {   //안쪽 클래스의 생성자
			System.out.println("안쪽 클래스가 방금 생성됐습니다.");
		}
		public void display() {
			System.out.println(bgcolor);
		}
	}
}
class Car{
	int price = 25_000_000;   //Car 클래스의 멤버변수
}
class Sonata{
	String bgcolor = "Silver";  
}







