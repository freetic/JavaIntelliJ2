/*
 * 객체의 형변환
 * 1. 자식 --> 부모  : 자동/강제 형변환 모두 가능, 항상 성공
 * 2. 부모 --> 자식 : 강제형변환만 가능하며, 항상 성공하지 않는다.
 */
public class CastDemo {
	public static void main(String[] args) {
		//Test t = new Test(); 
		//Demo d = new Demo();
		//t = d;
		Test t;   //선언
		t = new Demo();
		
		/*
		 * Test t = new Test(); Demo d = new Demo(); //t = (Test)d; if(t instanceof
		 * Demo) { d = (Demo)t; }else { System.out.println("형변환 불가"); }
		 */
		
	}
}
class Test{}
class Demo extends Test{}