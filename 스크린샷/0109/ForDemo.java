import java.util.Scanner;

public class ForDemo {
	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("�󸶺��� ���ұ�� : "); int
		 * start = scan.nextInt(); System.out.print("�󸶱��� ���ұ�� ? : "); int last =
		 * scan.nextInt(); int sum = 0; for(int i = start ; i <= last ; i++) { //�ʱⰪ ;
		 * ���� ; ���� //sum = sum + i; sum += i; } System.out.println(start + "���� " + last
		 * + "������ ���� " + sum);
		 */
		/*
		 * int count = 0; for(int i = 1 ; i <= 100 ; i++) { if(i % 7 == 0) {
		 * System.out.print(i + "\t"); count++; if(count % 5 == 0 )
		 * System.out.println(); } }
		 */
		
		//�빮�� A���� Z���� ����ϱ�
		/*
		 * int count = 0, line = 1; for(int i = 65 ; i <= 90 ; i++) { if(line % 2 == 0)
		 * System.out.printf("%c\t", (i + 32)); else System.out.printf("%c\t", i);
		 * count++; if(count % 5 == 0) { System.out.println(); line++; } }
		 */
		/*
		 * int i = 1; for( ; ; ) { System.out.print(i + "\t"); i++; }
		 */
		//x�� 1���� 3�� �����ϰ�, y�� 100���� 2�� �����Ѵ�.  x�� y�� �����ɶ��� x, y�� ����?
		/*
		 * int x, y; for(x = 1, y = 100 ; y > 0 ; x += 3, y -= 2) { if(x > y) break; }
		 * System.out.printf("x = %d, y = %d\n", x, y);
		 */
		
		/*
		 * for(int i = 1 ; i <= 9 ; i++) { System.out.println("5 x " + i + " = " + 5 *
		 * i); }
		 */ 
		
		/*
		 * for(int i = 5 ; i >= 1 ; i--) { for(int j = 1 ; j <= i ; j++) {
		 * System.out.print("*" + '\t'); } System.out.println(); }
		 */
		
		/*
		 * for(int i = 65 ; i <= 90 ; i++) { for(int j = 65 ; j <= i ; j++) {
		 * //System.out.print("*\t"); System.out.printf("%c\t", j); }
		 * System.out.println(); }
		 */
		
		/*
		 * for(int i = 1 ; i <= 9 ; i++) { for(int j = 2 ; j <= 9 ; j++) {
		 * System.out.printf("%d x %d = %d\t", j, i, j * i); } System.out.println(); }
		 */
		
		int [] ages = {5, 6, 7, 8, 9};
//		for(int i = 0 ; i < 5 ; i++) {
//			System.out.print(ages[i] + "\t");
//		}
		
		for(int age  : ages) {
			System.out.print(age + "\t");
		}
	}
}



