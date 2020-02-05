//1 + (1 + 2) + (1 + 2 + 3) +...+ (1 + 2 + ...50)ÀÇ °ªÀº?
public class Sequence {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i <= 50 ; i++) {
			sum += add(i);
		}
		System.out.println("sum = " + sum);
	}
	static int add(int last) {
		int sum = 0;
		for(int i = 0 ; i <= last ; i++) {
			sum += i;
		}
		return sum;
	}
}
