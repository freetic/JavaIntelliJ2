//5. interface�� instantiation�� �� �� ����. �׷��� ���������� �����ؾ� �Ѵ�.
public class InterfaceDemo {
	public static void main(String[] args) {
		//Weekable w = new Weekable();
		Weekable w = new Week();
		w.set(Weekable.THU);
		//Weekable.FRI = 100;
		System.out.println("������ " + w.get() + "�����Դϴ�.");
	}
}
