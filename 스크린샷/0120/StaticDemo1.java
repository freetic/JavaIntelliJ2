
public class StaticDemo1 {
	static int age = getAge();	
	public static void main(String[] args) {
		//Tiger tiger = new Tiger();
		Tiger.name
		System.out.println("나는 메인 메소드");   System.out.println("age = " + age);
	}
	static int getAge() {
		System.out.println("나는 스태틱 메소드");
		return 24;
	}
}
class Tiger{
	private Tiger() {}
	static String name = "Sally";
}