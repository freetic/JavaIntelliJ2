//2���� 50���� �Ҽ�(prime number) ����ϱ�
public class Prime {
	public static void main(String[] args) {
		for(int i = 2 ; i <= 50 ; i++) {
			if(isPrime(i)) System.out.printf("%d\t", i);
		}
	}
	static boolean isPrime(int su) {
		boolean flag = false;
		int i;
		for(i=2 ; i < su ; i++) {
			if(su % i == 0) break;
		}
		if(i == su) return true;
		else return false;
	}
}
