import java.util.Scanner;

public class LCMGCM {
	public static void main(String[] args) {
		LCMGCM lg = new LCMGCM();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();   int b = scan.nextInt();
		int gcm = lg.calcGcm(a, b);
		int lcm = a / gcm * b / gcm * gcm;
		System.out.println("lcm = " + lcm + ", gcm = " + gcm);
	}
	int calcGcm(int a, int b){    //8,  16
		int gcm = 0;
		for(int i = 2 ; i <= a ; i++) {
			if(a % i == 0 && b % i == 0)  gcm = i;
		}
		return gcm;
	}
}
