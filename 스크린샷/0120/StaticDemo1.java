
public class StaticDemo1 {
	static int age = getAge();	
	public static void main(String[] args) {
		//Tiger tiger = new Tiger();
		Tiger.name
		System.out.println("���� ���� �޼ҵ�");   System.out.println("age = " + age);
	}
	static int getAge() {
		System.out.println("���� ����ƽ �޼ҵ�");
		return 24;
	}
}
class Tiger{
	private Tiger() {}
	static String name = "Sally";
}