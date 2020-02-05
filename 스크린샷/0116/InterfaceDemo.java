//5. interface는 instantiation을 할 수 없다. 그래서 다형성으로 구현해야 한다.
public class InterfaceDemo {
	public static void main(String[] args) {
		//Weekable w = new Weekable();
		Weekable w = new Week();
		w.set(Weekable.THU);
		//Weekable.FRI = 100;
		System.out.println("오늘은 " + w.get() + "요일입니다.");
	}
}
