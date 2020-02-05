/*
 * static ���
 * 1. static variable  : ��������(Shared Variable)
 * 2. static method : �ּҾ��� �޼ҵ� �����Ϸ���
 * 3. static initialization block
 * 4. static class
 */
public class StaticDemo {
	public static void main(String[] args) {
		Lion [] array = new Lion[5];
		for(int i = 0 ; i < array.length ; i++)  array[i] = new Lion();
		for(Lion lion : array)  lion.display();
	}
}
class Lion{
	private int count;    //member variable
	private static int cnt;    //static variable
	public Lion() {
		//count++;      cnt = count;
		//cnt++;             count = cnt;
		cnt++;    count++;
	}
	public void display() {
		System.out.printf("count = %d, cnt = %d\n", count, cnt);
	}
}









