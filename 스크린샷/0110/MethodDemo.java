
public class MethodDemo {
	public static void main(String[] args) {
		//calcSum();   //Call by Name
		calcSum(10, 50);  //Call by Value
		calcSum(1, 10);
		calcSum(20, 30);
	}
	static void calcSum(int start, int last){  //int num = 50
		int sum = 0;
		for(int i = start ; i <= last ; i++) {
			sum += i;
		}
		System.out.println(start + "���� " + last + "������ ���� " + sum + "�Դϴ�.");
		return;
	}
}
